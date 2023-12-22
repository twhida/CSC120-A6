/* This is a stub for the Cafe class */

import java.util.ArrayList;

public class Cafe extends Building{
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory
    private ArrayList<int[]> inventory;
    
    public Cafe(String name, String address, int nFloors, ArrayList<int[]> inventory) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 24;
        this.nSugarPackets = 24;
        this.nCreams = 24;
        this.nCups = 4;
        this.inventory =(this.inventory(this.nSugarPackets, this.nCreams, this.nCups));
    }

    private ArrayList<int[]> inventory(int nSugarPackets2, int nCreams2, int nCups2) {
        return null;
    }
    
    public void sellCoffee(int nCoffeeOunces, int nSugarPackets, int Creams){
        this.nCoffeeOunces -= 6;
        this.nSugarPackets -= 2;
        this.nCreams -= 2;

    }
    
    public static void main(String[] args) {
        new Cafe();
    }
    
}
