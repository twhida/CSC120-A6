/* This is a stub for the Library class */
import java.util.*;

public class Library extends Building {
  private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }

    public void addTitle(String title){
      if(this.collection.contains(title)){
        System.out.println("This book already exists in the collection.");
      }
      else this.collection.put(title, true);
    }

    public void removeTitle(String title){
      if(!this.collection.contains(title)){
        System.out.println("This book does not already exist in the collection.");
      }
      else this.collection.remove(title, false);
    }

    public void checkOut(String title){
      if(!this.collection.contains(title)){
        System.out.println("This book is already checked out!");
      }
      else this.collection.replace(title, true, false);
    }

    public void returnBook(String title){
      if(this.collection.contains(title)){
        System.out.println("This book was not checked out!");
      }
      else this.collection.replace(title, false, true);
    }

    boolean containsTitle;
    public boolean containsTitle(String title){
      if(this.collection.contains(title)){
        return containsTitle = true;
      } else return containsTitle = false;
    }

    //this is wrong but I'm not sure how to implement the boolean with .contains, because I'm havng trouble getting .equalsKey to work
    boolean isAvailable;
    public boolean isAvailable(String title, boolean available){
    //I think this should work because only if it exists and is true it will return isAvailable?
      if(this.collection.contains(title) && this.collection.contains(true)){ 
       return isAvailable = true;
      }
      else return isAvailable = false;
    }

    /**
     * prints out the entire collection in an easy-to-read way (including checkout status)
     * an attempted at distinguishing checked out books commented out    
     */
    public void printCollection(){
      System.out.println(this.collection);
      // if(this.collection = (title, false)){
      // System.out.println("This book is checked out!");
    }
    
    public static void main(String[] args) {
      new Library("","",3);
    }
  
  }