/* This is a stub for the Cafe class */

import java.util.ArrayList;

public class Cafe extends Building{
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory
    private ArrayList<int[]> inventory(int CoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        return null;
    }
    
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 24;
        this.nSugarPackets = 8;
        this.nCreams = 8;
        this.nCups = 4;
        this.inventory(this.nCoffeeOunces, this.nSugarPackets, this.nCreams, this.nCups);
    }


    public void sellCoffee(int nCoffeeOunces, int nSugarPackets, int Creams){
        if(this.nCups >= 4){
        this.nCoffeeOunces -= 6;
        this.nSugarPackets -= 2;
        this.nCreams -= 2;
        this.nCups -= 1;
        }
        else restock(nCoffeeOunces, nSugarPackets, nCreams, nCups);

    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        while (this.nCoffeeOunces <= 0){
            this.nCoffeeOunces = 24;
            this.nSugarPackets = 8;
            this.nCreams = 8;
            this.nCups = 4;
        }
        
    }


    public static void main(String[] args) {
        new Cafe("The Mug", "1 Chapin Way", 1);
    }
    
}
