package sample;

import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

/**
 * Loads unique repairs and their information into an arraylist. This arraylist is used to make loading each property
 * and its available repairs random.
 */
public class Repairs {

    public static ArrayList<RepairType> repairTypes = new ArrayList<>();

    Repairs() {
        repairTypes = new ArrayList<>();
        loadRepairTypes();
    }

    /**
     * Loads CSV file lines into an arraylist. Each line is represented as a RepairType with a description, material
     * price and estimated duration.
     */
    public void loadRepairTypes() {
        List<List<String>> records = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File("sample/repairList.csv"));) {
            while (scanner.hasNextLine()) {
                records.add(getRecordFromLine(scanner.nextLine()));
            }
        }
        catch (Exception e) {
            System.out.println("Failed to load types.");
        }

        for (int i = 0; i < records.size(); i++) {
            RepairType repairEntry = new RepairType();

            for (int j = 0; j < records.get(i).size(); j++) {
                if (j == 0) { repairEntry.description = records.get(i).get(j); }
                if (j == 1) { repairEntry.materialPrice = records.get(i).get(j); }
                if (j == 2) { repairEntry.estimatedDuration = records.get(i).get(j); }
                if (j == 3) { repairEntry.valueAdded = Integer.parseInt(records.get(i).get(j)); }
            }

            // Calculate the total repair price for this repair
            repairEntry.repairPriceTotal = Integer.parseInt(repairEntry.materialPrice) +
                    (Integer.parseInt(repairEntry.estimatedDuration) * 19);

            // Add to list
            repairTypes.add(repairEntry);
        }
    }

    /**
     * Helper method for loadRepairTypes() to parse a csv file and return the values from the file.
     *
     * @param line CSV file line
     * @return arraylist of CSV file lines
     */
    private List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<>();

        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(",");
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }
}
