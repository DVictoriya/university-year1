import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    //An abstract class permits you to make functionality that subclasses
    // can implement or override whereas an interface only permits you to
    // state functionality but not to implement it. A class can extend only
    // one abstract class while a class can implement multiple interfaces.
    public static void main(String[] args) {

        ArrayList<Animal> animal = new ArrayList<>(); //Creating an ArrayList and adding object to it
        Carnivore myWolf = new Wolf("Tom", 8);
        Omnivore myParrot = new Parrot("Cat", 9);
        Herbivore myKoala = new Koala("Jack", 12);
        animal.add(myWolf);
        animal.add(myKoala);
        animal.add(myParrot);

        for(Animal animal1 : animal) { //iterating over the ArrayList
            System.out.println(animal1.getName()+ " " + animal1.getAge());
        }
        Collections.sort(animal);

        for(Animal animal1 : animal) { //iterating over the already sorted list
            System.out.println(animal1.getName()+ " " + animal1.getAge());
        }

    }
}
