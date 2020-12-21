package sample;

/**
 * The type of repair to be performed.
 */
public class RepairType {
    String repairDescription; // Main description of what the repair is
    String repairMaterialPrice; // Price of all materials to do the repair
    String repairEstimatedDuration; // Estimated duration of the repair
    String repairValueAddedPercent; // Percentage of added value to a property after this repair
    int repairPriceTotal; // The total price calculated using materials and labor
    double repairValueAddedTotal; // The value added to the property with this repair
    int repairLaborPrice; // The total price of labor to perform the repair
    Boolean repairCheckButton = false; // Check button clicked status

    RepairType () {}
}
