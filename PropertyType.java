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
    Boolean approved = null;
    RepairType[] propertyRepairs = new RepairType[9];

    PropertyType() {}


    /**
     * Calculates the total materials price for all the repairs of a property.
     */
    public int calculateMaterialsPriceTotal(Property property) {
        int materialsPriceTotal = 0;

        for (int i = 0; i < 10; i++) {
            if (property.propertyDetails.propertyRepairs[i].checkButton == true) {
                materialsPriceTotal += Integer.parseInt(property.propertyDetails.propertyRepairs[i].materialPrice);
            }
        }
        return materialsPriceTotal;
    }

    /**
     * Calculates the total labor price for all the repairs of a property.
     */
    public int calculateLaborPriceTotal(Property property) {
        int laborPriceTotal = 0;

        for (int i = 0; i < 10; i++) {
            if (property.propertyDetails.propertyRepairs[i].checkButton == true) {
                laborPriceTotal += Integer.parseInt(property.propertyDetails.propertyRepairs[i].laborPrice);
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
        int valueAddedTotal = Integer.parseInt(property.propertyDetails.propertyPrice.replace(",", ""));

        for (int i = 0; i < 10; i++) {
            if (property.propertyDetails.propertyRepairs[i].checkButton == true) {
                valueAddedTotal += ((property.propertyDetails.propertyRepairs[i].repairPriceTotal) *=
                        (property.propertyDetails.propertyRepairs[i].valueAdded));
            }
        }
        return valueAddedTotal;
    }
    /**
     * Calculates the total amount spent for all the repairs of a property.
     *
     * @param property
     * @return
     */
    public int calculateAmountSpentTotal(Property property) {
        int amountSpentTotal = Integer.parseInt(property.propertyDetails.propertyPrice.replace(",", ""));

        for (int i = 0; i < 10; i++) {
            if (property.propertyDetails.propertyRepairs[i].checkButton == true) {
                amountSpentTotal += property.propertyDetails.propertyRepairs[i].repairPriceTotal;
            }
        }
        return amountSpentTotal;
    }
}
