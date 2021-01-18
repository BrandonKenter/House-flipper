package flipper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Loads unique repairs and their information into an arraylist. This arraylist is used to make loading each property
 * and its available repairs random.
 */
public class Repairs {
    public static ArrayList<RepairDetails> repairList;

    Repairs() {
        repairList = new ArrayList<>();
        loadRepairTypes();
    }
    
    /**
     * Loads CSV file lines into an arraylist. Each line is represented as a RepairType with a description, material
     * price and estimated duration.
     */
    public void loadRepairTypes() {
        List<List<String>> records = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File("src/flipper/propertyinfo/repairList.csv"))) {
            while (scanner.hasNextLine()) {
                records.add(getRecordFromLine(scanner.nextLine()));
            }
        }
        
        catch (Exception ignored) {}

        for (List<String> record : records) {
            RepairDetails repairEntry = new RepairDetails();

            for (int j = 0; j < record.size(); j++) {
                if (j == 0) {
                    repairEntry.repairDescription = record.get(j).strip();
                }
                if (j == 1) {
                    repairEntry.repairCondition = record.get(j).strip();
                }
                if (j == 2) {
                    repairEntry.repairMaterialPrice = record.get(j).strip();
                }
                if (j == 3) {
                    repairEntry.repairEstimatedDuration = record.get(j).strip();
                }
                if (j == 4) {
                    repairEntry.repairValueAddedPercent = record.get(j).strip();
                }
            }

            // Calculate the labor price for this repair
            repairEntry.repairLaborPrice = Integer.parseInt(repairEntry.repairEstimatedDuration) * 19;

            // Calculate the total repair price for this repair
            repairEntry.repairPriceTotal = Integer.parseInt(repairEntry.repairMaterialPrice) +
                    repairEntry.repairLaborPrice;

            // Calculate the value added for this repair
            repairEntry.repairValueAddedTotal = repairEntry.repairPriceTotal *
                    Double.parseDouble(repairEntry.repairValueAddedPercent);

            // Add to list
            repairList.add(repairEntry);
        }
    }
    
    /**
     * Helper method for loadRepairTypes() to parse a csv file and return the values from the file.
     *
     * @param line CSV file line.
     * @return arraylist of CSV file lines.
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
