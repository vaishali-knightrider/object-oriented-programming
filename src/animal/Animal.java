package animal;

/**
 * Model Class: it will always have getter setter and constructors
 * Static members(variables and methods) belong to class
 * and each object has a copy of the static members
 */
public class Animal {
    private int legs;
    private String species;
//    legs and species are instance member var
    private static boolean tail; // static member variable

    public static boolean getTail() {
        return tail;
    }

    public static void setTail(boolean tail) {
        Animal.tail = tail;
    }

    //    getter methods: fetch values of member variables
    public int getLegs() {
        return this.legs;
    }
    public String getSpecies(){
        return this.species;
    }

//    setter methods: set values of member variables
    public void setLegs(int legs){
        this.legs = legs;
    }
    public void setSpecies(String species){
        this.species = species;
    }
}
