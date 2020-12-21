package sample;
import java.util.Arrays;
import java.util.Random;

/**
 *
 */
public class Property {
    PropertyType propertyDetails;
    int initialized = 0;

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
        int idx = random.nextInt(Properties.propertyTypes.size());
        this.propertyDetails = Properties.propertyTypes.get(idx);
        Properties.propertyTypes.remove(idx);

        // Generate repair options for property
        for (int i = 0; i < 10; i++) {
            // Assign property values
            idx = random.nextInt(Repairs.repairTypes.size());
            this.propertyDetails.propertyRepairs[i] = Repairs.repairTypes.get(idx);
            Repairs.repairTypes.remove(idx);
            }
    }
}