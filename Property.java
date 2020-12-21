package flipper;

import java.util.Random;

/**
 *
 */
public class Property {
    public PropertyDetails propertyDetails;
    private int initialized = 0;

    /**
     * Initialize a property's details and its list of repairs.
     */
    Property() {
        if (initialized == 0) {
            Properties properties = new Properties();
            Repairs repairs = new Repairs();
            initialized += 1;
        }

        Random random = new Random();

        // Retrieve random property from list and remove from list
        int idx = random.nextInt(Properties.propertyList.size());
        this.propertyDetails = Properties.propertyList.get(idx);
        Properties.propertyList.remove(idx);

        // Generate repair options for property
        for (int i = 0; i < 10; i++) {
            // Assign property values
            idx = random.nextInt(Repairs.repairList.size());
            this.propertyDetails.propertyRepairs[i] = Repairs.repairList.get(idx);
            Repairs.repairList.remove(idx);
            }
    }
}