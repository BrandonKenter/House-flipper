package flipper;

/**
 * The type of property to be assessed.
 */
public class PropertyDetails {
    public String propertyLocation; // Location of the property
    public String propertyPrice; // Price of the property
    public String propertyComps; // Average price of refurbished homes in 1-mile radius
    public String propertySqFt; // Square footage of the property
    public String propertyLotSize; // Size of the lot
    public String propertyBedBath; // Number of beds and baths
    public String propertyYearBuilt; // Year the property was built
    public String propertyOccupancyType; // Type of property (Single family, multi-family)
    public String propertyLastSold; // Days ago this property was last sold
    public String propertyTimeOnMarket; // Days this property has been on the market
    public Boolean propertyApproved = null; // Approved status
    public RepairDetails[] propertyRepairs = new RepairDetails[10]; // Array of repairs for one property

    PropertyDetails() {}

    /**
     * Calculates the total materials price for all the repairs of a property.
     *
     * @param property Reference to a property.
     * @return propertyMaterialsPriceTotal The total amount spent on repair materials for a property.
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
     *
     * @param property Reference to a property.
     * @return laborPriceTotal The total price for labor of all repairs for a property.
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
     * @param property Reference to a property.
     * @return propertyAmountSpentTotal The total amount spent on the property.
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
     * @param property Reference to a property.
     * @return propertyValueAddedTotal The total value added to the property.
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
