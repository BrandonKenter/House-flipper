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
}
