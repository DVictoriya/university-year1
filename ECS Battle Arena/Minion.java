import java.util.Random;

/**
 * Creating a Minion class which inherits from "Monster2" all attributes
 * and special abilities, as well as implements the
 * "Monster" class which enables us to override the strike() method.
 */
public class Minion extends Monster2 implements Monster {

    public Minion(String name){
        /**
         * In the constructor we assign the corresponding attributes
         * with the corresponding value presented in the table.
         */
        super(name,5,5, 5 ,5);
    }

    /**
     * Overriding the strike() method. In this method we
     * use "Random" to create a range from 1-100. Depending
     * on the range different special abilities are called.
     */
    public void strike(Character enemy){
        Random number = new Random();
        int value =  number.nextInt(100);
        if(value > 0 && value <= 75){
            syntaxError(enemy);
        }
        else if(value > 75 && value <= 90){
            nullPointerException();
        }
        else if(value >90) {
            arrayIndexOutOfBoundException(enemy);
        }
    }
}
