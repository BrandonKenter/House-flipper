package flipper;

/**
 * The type of property to be assessed.
 */
public class PropertyDetails {
    public String propertyLocation; // Location of the property
    public String propertySqFt; // Square footage of the property
    public String propertyPrice; // Price of the property
    public String propertyDescription; // Paragraph describing the property
    public String propertyMaxValue; // The maximum the property can sell for based on comps
    public Boolean propertyApproved = null;
    public RepairDetails[] propertyRepairs = new RepairDetails[10];

    PropertyDetails() {}

    /**
     * Calculates the total materials price for all the repairs of a property.
     */
    public int calculateMaterialsPriceTotal(Property property) {
        int propertyMaterialsPriceTotal = 0;

        for (int i = 0; i < 10; i++) {
            if (property.propertyDetails.propertyRepairs[i].repairCheckButton) {
                propertyMaterialsPriceTotal += Integer.parseInt(property.propertyDetails.propertyRepairs[i].repairMaterialPrice);
            }
        }
        return propertyMaterialsPriceTotal;
    }

    /**
     * Calculates the total labor price for all the repairs of a property.
     */
    public int calculateLaborPriceTotal(Property property) {
        int laborPriceTotal = 0;

        for (int i = 0; i < 10; i++) {
            if (property.propertyDetails.propertyRepairs[i].repairCheckButton) {
                laborPriceTotal += property.propertyDetails.propertyRepairs[i].repairLaborPrice;
            }
        }
        return laborPriceTotal;
    }

    /**
     * Calculates the total amount spent for all the repairs of a property.
     *
     * @param property
     * @return
     */
    public int calculateAmountSpentTotal(Property property) {
        int propertyAmountSpentTotal = Integer.parseInt(property.propertyDetails.propertyPrice);

        for (int i = 0; i < 10; i++) {
            if (property.propertyDetails.propertyRepairs[i].repairCheckButton) {
                propertyAmountSpentTotal += property.propertyDetails.propertyRepairs[i].repairPriceTotal;
            }
        }

        return propertyAmountSpentTotal;
    }

    /**
     * Calculates the total value added for all the repairs of a property.
     *
     * @param property
     * @return
     */
    public int calculateValueAddedTotal(Property property) {
        int propertyValueAddedTotal = Integer.parseInt(property.propertyDetails.propertyPrice);

        for (int i = 0; i < 10; i++) {
            if (property.propertyDetails.propertyRepairs[i].repairCheckButton) {
                propertyValueAddedTotal += property.propertyDetails.propertyRepairs[i].repairValueAddedTotal;
            }
        }
        return propertyValueAddedTotal;
    }
}
