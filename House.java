/* This is a stub for the House class */
import java.util.*;

public class House extends Building {
  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, ArrayList<String> residents) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");

  }

  public boolean hasDiningRoom(){
    return this.hasDiningRoom = true;
  }

  public int nResidents(){
    return this.nResidents();
  }

  public void moveIn(String name){
    if (!this.residents.contains(name)){
      throw new RuntimeException(this.name + " already lives in this house.");
    } 
    else this.residents.add(name);
  }

  public String moveOut(String name){
    if (!this.residents.contains(name)){
      return (this.name + " does not already live in this house.");
    } 
    else this.residents.remove(name);
      return this.name;
  }
    boolean isResident;
    public boolean isResident(String person){
      if(this.residents.contains(person)){
        return isResident = true;
      }
      else return isResident = false;
      
    }
  

  public static void main(String[] args) {
    new House();
  }

}