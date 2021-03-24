import java.util.Random;
 /** Creating a "Boss" class which inherits from "Monster2" all attributes
        * and special abilities, as well as implements the
        * "Monster" class which enables us to override the strike() method.
        */
public class Boss extends Monster2 implements Monster{
    /**
     * In the constructor we assign the corresponding attributes
     * with the corresponding value presented in the table.
     */
    public Boss(String name) {
        super(name, 8, 7, 8, 7);
    }

    /**
     * Overriding the strike() method. In this method we
     * use "Random" to create a range from 1-100. Depending
     * on the range different special abilities are called.
     */
    public void strike(Character enemy){
        Random number = new Random();
        int value = number.nextInt(100);
        if(value >= 0 && value < 50) {
            syntaxError(enemy);
        }
        else if(value >= 50 &&  value < 65){
            nullPointerException();
        }
        else if ( value >= 65 && value <80){
            arrayIndexOutOfBoundException(enemy);
        }
        else if( value >= 50 && value <90){
            noneTermination();
        }else if ( value >= 90) {
            concurrentModificationException(enemy);
        }
    }

    /**
     * We have implemented this method noneTermination() in the
     * Boss class, because it will be used only by this class.
     * It enables the monster to  resurrect all fallen members of the
     * team.
     */
    public void noneTermination() {
        for (Character member : getTeam().getMembers()) {
            if(member.getHP() == 0){
                System.out.println(this.getName()+ " is about to resurrect all of his friends");
                member.increaseHP(member.getMaxHP());
            }

        }
    }

    /**
     * This final ability "concurrentModificationException" is the most deadly one
     * because it deals damage to all students as well as decrease their knowledge points.
     * Invoking this method enables the Minion and Boss to increase their explorer points(EP)
     */
    public void concurrentModificationException(Character enemy){//TODO enemy.getTeam null?
        enemy.getTeam();
        for(Character fallen : enemy.getTeam().getMembers()){
            System.out.println(this.getName()+ " is using currentModificationException and deal damage to all enemies  " + enemy.getName());
            enemy.decreaseHP(100 * getAttack() / (100 + enemy.getDefence()));
        }
        if (enemy instanceof Student){
            ((Student) enemy).increaseKP(3);
        }
        if (enemy.getHP() == 0) {
            System.out.println(enemy.getName()+ " has been defeated");
            increaseEP(4);
        }
        increaseEP(3);

    }
}