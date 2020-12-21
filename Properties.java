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

        try (Scanner scanner = new Scanner(new File("src/flipper//propertyinfo/propertyList.csv"));) {
            while (scanner.hasNextLine()) {
                records.add(getRecordFromLine(scanner.nextLine()));
            }
        }
        catch (Exception e) {
            System.out.println("Failed to load property types.");
        }

        for (int i = 0; i < records.size(); i++) {
            PropertyDetails propertyEntry = new PropertyDetails();

            for (int j = 0; j < records.get(i).size(); j++) {
                if (j == 0) { propertyEntry.propertyLocation = records.get(i).get(j); }
                if (j == 1) { propertyEntry.propertySqFt = records.get(i).get(j); }
                if (j == 2) { propertyEntry.propertyPrice = records.get(i).get(j); }
                if (j == 3) { propertyEntry.propertyDescription = records.get(i).get(j); }
                if (j == 4) { propertyEntry.propertyMaxValue = records.get(i).get(j); }
            }
            propertyList.add(propertyEntry);
        }
    }

    /**
     * Helper method for loadPropertyTypes() to parse a csv file and return the values from the file.
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