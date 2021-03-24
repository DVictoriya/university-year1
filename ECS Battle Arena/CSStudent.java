/**
 * Here we are creating a type of student which studies Computer Science.
 * The student extends all attributes from "Student"
 */
public class CSStudent extends Student {
    /**
     * In the constructor we assign the corresponding attributes
     * with the corresponding value presented in the table.
     */
    public CSStudent(String name) {
        super(name, 7, 6, 6, 6, 4);
    }

    /**
     * "pairWorking" is a method which can be invoked if and only
     * if the student knowledge points are equal to the maximum. This
     * method is a special ability which enables the student to team up with a friend
     * and deal damage to the enemy and increase different attributes.
     * If the method the student does not have enough KP we throw an Exception
     * stating that the students does not have enough KP
     */
    public void pairWorking(Character friend, Character enemy) throws Exception {
        if (this.currentKP == getMaxKP()) {
            friend.getTeam();
            System.out.println("A friend of "+friend.getName()+ " is using pairWorking in order to attack the enemy " +enemy.getName() );
            enemy.decreaseHP(100 * this.getAttack() / (100 + enemy.getDefence()));
            increaseEP(4);
            currentKP = 0;
        } else {
            throw new Exception("Not enough KP");
        }
        if (enemy.getHP() == 0) {
            System.out.println(enemy.getName()+ " has been defeated");
            increaseEP(4);
        }
    }
    /**
     * "support" is a method which can be invoked if and only
     * if the student knowledge points are equal to the maximum. This
     * method is a special ability which enables the student to heal
     * a friend by assigning the defence points as theirs hit points
     * and at the same time increase its attributes.
     * If the method the student does not have enough KP we throw an Exception
     * stating that the students does not have enough KP
     */

    public void support(Character friend) throws Exception {
        if (this.currentKP == getMaxKP()) {
            System.out.println(this.getName()+ " is using support in order to heal his friends" + friend.getName());
            friend.increaseHP(getDefence());
            increaseEP(4);
            currentKP = 0;
        } else {
            System.out.println(this.currentKP+", " +getMaxKP());
            throw new Exception("Not enough KP");
        }
    }
}