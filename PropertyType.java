package sample;

/**
 * The type of property to be assessed.
 */
public class PropertyType {
    String propertyLocation; // Location of the property
    String propertySqFt; // Square footage of the property
    String propertyPrice; // Price of the property
    String propertyDescription; // Paragraph describing the property
    String propertyMaxValue; // The maximum the property can sell for based on comps
    Boolean propertyApproved = null;
    RepairType[] propertyRepairs = new RepairType[9];

    PropertyType() {}


    /**
     * Calculates the total materials price for all the repairs of a property.
     */
    public int calculateMaterialsPriceTotal(Property property) {
        int propertyMaterialsPriceTotal = 0;

        for (int i = 0; i < 10; i++) {
            if (property.propertyDetails.propertyRepairs[i].repairCheckButton == true) {
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
            if (property.propertyDetails.propertyRepairs[i].repairCheckButton == true) {
                laborPriceTotal += property.propertyDetails.propertyRepairs[i].repairLaborPrice;
            }
        }
        return laborPriceTotal;
    }

    /**
     * Calculates the total value added for all the repairs of a property.
     *
     * @param property
     * @return
     */
    public int calculateValueAddedTotal(Property property) {
        int propertyValueAddedTotal = Integer.parseInt(property.propertyDetails.propertyPrice.replace(",", ""));

        for (int i = 0; i < 10; i++) {
            if (property.propertyDetails.propertyRepairs[i].repairCheckButton == true) {
                propertyValueAddedTotal += ((property.propertyDetails.propertyRepairs[i].repairPriceTotal) *=
                        (property.propertyDetails.propertyRepairs[i].repairValueAddedTotal));
            }
        }
        return propertyValueAddedTotal;
    }
    /**
     * Calculates the total amount spent for all the repairs of a property.
     *
     * @param property
     * @return
     */
    public int calculateAmountSpentTotal(Property property) {
        int propertyAmountSpentTotal = Integer.parseInt(property.propertyDetails.propertyPrice.replace(",", ""));

        for (int i = 0; i < 10; i++) {
            if (property.propertyDetails.propertyRepairs[i].repairCheckButton == true) {
                propertyAmountSpentTotal += property.propertyDetails.propertyRepairs[i].repairPriceTotal;
            }
        }
        return propertyAmountSpentTotal;
    }
}
