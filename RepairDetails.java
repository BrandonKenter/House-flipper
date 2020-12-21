package flipper;

/**
 * The type of repair to be performed.
 */
public class RepairDetails {
    public String repairDescription; // Main description of what the repair is
    public String repairMaterialPrice; // Price of all materials to do the repair
    public String repairEstimatedDuration; // Estimated duration of the repair
    public String repairValueAddedPercent; // Percentage of added value to a property after this repair
    public int repairPriceTotal; // The total price calculated using materials and labor
    public double repairValueAddedTotal; // The value added to the property with this repair
    public int repairLaborPrice; // The total price of labor to perform the repair
    public Boolean repairCheckButton = false; // Check button clicked status

    RepairDetails() {}
}
