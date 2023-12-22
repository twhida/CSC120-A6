
/**
 * Building class
 * Static String name, String address, and int nFloors
 */
public class Building {

    protected String name = "Interesting Name";
    protected String address = "The Address";
    protected int nFloors = 1;

    /**
     * Constructor for an instance of Building 
     * @param name String
     * @param address String
     * @param nFloors int
     * @RuntimeException for nFloors int>1
     */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /**
     * getter for Building name
     * @return Building String name
     */
    public String getName() {
        return this.name;
    }

    /**
     * getter for Builidng address
     * @return Building String address
     */
    public String getAddress() {
        return this.address;
    }

    /** getter for Building nFloors
     * @return Building int nFloors
     */
    public int getFloors() {
        return this.nFloors;
    }

    /**
     * toString method
     * @return a String describing the Building String name, String address, and int nFloors
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    /**
     * Main method that creates an instance of Building fordHall
     * @param args
     * prints the instance parameters
     */
    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}
