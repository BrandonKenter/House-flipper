package sample;

/**
 * The type of repair to be performed.
 */
public class RepairType {
    String description; // Main description of what the repair is
    String materialPrice; // Price of all materials to do the repair
    String estimatedDuration; // Estimated duration of the repair
    int valueAdded; // Percentage of added value to a property after this repair
    int repairPriceTotal; // The total price calculated using materials and labor
    String laborPrice; // The total price of labor to perform the repair
    Boolean checkButton = false; // Check button clicked status

    RepairType () {}
}
