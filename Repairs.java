package sample;


import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class Repairs {
    public static Hashtable<RepairType, Boolean> repairTypes;

    Repairs() {
        repairTypes = new Hashtable<>();
        loadRepairTypes();
    }

    public void loadRepairTypes() {
        List<List<String>> records = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File("repairList.csv"));) {
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
            }
            repairTypes.put(repairEntry, true);
        }
    }

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

