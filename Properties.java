package flipper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Loads unique properties and their information into an arraylist. This arraylist is used to make loading each property
 * and its available repairs random.
 */
public class Properties {
    public static ArrayList<PropertyDetails> propertyList;

    Properties() {
        propertyList = new ArrayList<>();
        loadPropertyTypes();
    }

    /**
     * Loads CSV file lines into an arraylist. Each line is represented as a PropertyType with a location, square
     * footage and price.
     */
    public void loadPropertyTypes() {
        List<List<String>> records = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File("src/flipper//propertyinfo/propertyList.csv"))) {
            while (scanner.hasNextLine()) {
                records.add(getRecordFromLine(scanner.nextLine()));
            }
        }
        catch (Exception ignored) {}

        for (List<String> record : records) {
            PropertyDetails propertyEntry = new PropertyDetails();

            for (int j = 0; j < record.size(); j++) {
                if (j == 0) {
                    propertyEntry.propertyLocation = record.get(j).strip();
                }
                if (j == 1) {
                    propertyEntry.propertyPrice = record.get(j).strip();
                }
                if (j == 2) {
                    propertyEntry.propertyComps = record.get(j).strip();
                }
                if (j == 3) {
                    propertyEntry.propertySqFt = record.get(j).strip();
                }
                if (j == 4) {
                    propertyEntry.propertyLotSize = record.get(j).strip();
                }
                if (j == 5) {
                    propertyEntry.propertyBedBath = record.get(j).strip();
                }
                if (j == 6) {
                    propertyEntry.propertyYearBuilt = record.get(j).strip();
                }
                if (j == 7) {
                    propertyEntry.propertyOccupancyType = record.get(j).strip();
                }
                if (j == 8) {
                    propertyEntry.propertyLastSold = record.get(j).strip();
                }
                if (j == 9) {
                    propertyEntry.propertyTimeOnMarket = record.get(j).strip();
                }
            }
            propertyList.add(propertyEntry);
        }
    }

    /**
     * Helper method for loadPropertyTypes() to parse a csv file and return the values from the file.
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
