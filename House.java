/* This is a stub for the House class */
import java.util.*;

/**
 * House class extends Building class
 * Uses attributes ArrayList<String> residents and boolean hasDiningRoom
 */
public class House extends Building {
  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  /**
   * Constructor for House, extended from Builiding class
   * @param name String
   * @param address String
   * @param nFloors int
   * initializes residents and hasDiningRoom
   */
  public House(String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");

  }

  /**
   * Accessor retrieves the boolean value for hasDiningRoom in House
   * @return true boolean
   */
  public boolean hasDiningRoom(){
    return this.hasDiningRoom = true;
  }

  /**
   * Accessor retrieves the int value for nResidents
   * @return nResidents int
   */
  public int nResidents(){
    return this.nResidents();
  }

  /**
   * method updates ArrayList<String> residents for when someone moves in
   * @param name String
   * @RuntimeException if the person already lives in the house, they cannot move in and a message is printed 
   */
  public void moveIn(String name){
    if (!this.residents.contains(name)){
      throw new RuntimeException(this.name + " already lives in this house.");
    } 
    else this.residents.add(name);
  }

  /**
   * method updates ArrayList<String> residents for when someone moves out
   * @param name String
   * @return name String
   */
  public String moveOut(String name){
    if (!this.residents.contains(name)){
      return (this.name + " does not already live in this house.");
    } 
    else this.residents.remove(name);
      return this.name;
  }
    /**
     * boolean method to check whether a given person is a resident of the House
     * @param name String
     * @return true if they are a resident, otherwise false
     */
    boolean isResident;
    public boolean isResident(String name){
      if(this.residents.contains(name)){
        return isResident = true;
      }
      else return isResident = false;
      
    }
  
    /**
     * New instance of House, Lamont
     * @param args
     */
  public static void main(String[] args) {
    new House("Lamont","17 Prospect St",2);
  }

}