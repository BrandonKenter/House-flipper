package sample;
import java.util.Random;

/**
 *
 */
public class Property {
    PropertyType propertyDetails;

    /**
     * Initialize a property's details and its list of repairs.
     *
     * @param page
     */
    Property(int page) {
        Random random = new Random();
        if (page == 0) {
            // Retrieve random property from list and remove from list
            int idx = random.nextInt(Properties.propertyTypes.size());
            this.propertyDetails = Properties.propertyTypes.get(idx);
            Properties.propertyTypes.remove(idx);

            // Generate repair options for property
            for (int i = 0; i < 10; i++) {
                // Assign property values
                idx = random.nextInt(Repairs.repairTypes.size());
                propertyDetails.propertyRepairs[i] = Repairs.repairTypes.get(idx);
                Repairs.repairTypes.remove(idx);
            }
        }
    }
}
