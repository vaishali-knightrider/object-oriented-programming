package animal;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal cat; // yaha bs cat aek ref variable which can point to a memory address of type "Animal"
        cat =  new Animal();
        cat.setLegs(4);
        cat.setSpecies("CAT");
        System.out.println("Cat : legs - "+ cat.getLegs());
        System.out.println("Cat : species - "+ cat.getSpecies());

        Animal dog = new Animal();
        dog.setSpecies("DOG");
        dog.setLegs(6);
        System.out.println("DOG : legs - "+ cat.getLegs());
        System.out.println("DOG : species - "+ cat.getSpecies());

        Animal.setTail(true);
        System.out.println("Cat : tail - "+cat.getTail());
        System.out.println("Dog : tail - "+dog.getTail());

        Animal.setTail(false);
        System.out.println("Cat : tail - "+cat.getTail());
        System.out.println("Dog : tail - "+dog.getTail());

//        how to call static members and member methods
//        classname.staticMemberVariable
//        classname.staticMemberMethod
    }
}
