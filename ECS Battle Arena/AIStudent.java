/**
 * Here we are creating a type of student which studies Computer Science with Artificial intelligence.
 * The student extends all attributes from "Student"
 */
public class AIStudent extends Student {
    /**
     * In the constructor we assign the corresponding attributes
     * with the corresponding value presented in the table.
     */
    public AIStudent(String name) {
        super(name, 6, 7, 7, 5, 3);
    }

    /**
     * "machineLearning" is a method which can be invoked if and only
     * if the student knowledge points are equal to the maximum. This
     * method is a special ability which enables the student to deal
     * double damage to the enemy and increase different attributes.
     * If the method the student does not have enough KP we throw an Exception
     * stating that the students does not have enough KP
     */
    public void machineLearning(Character enemy) throws Exception {
        if (this.currentKP == getMaxKP()) {
            System.out.println(this.getName()+ " is using machineLearning and deals double damage to " +enemy.getName());
            enemy.decreaseHP(2 * (100 * this.getAttack() / (100 + enemy.getDefence())));
            increaseEP(4);
            currentKP = 0;
        } else {
            throw new Exception("Not enough KP");
        }
        if (enemy.getHP() == 0) {
            System.out.println(enemy.getName()+ " has been defeated.");
            increaseEP(4);
        }
    }

    /**
     * "naturalLanguageProcessing" is a method which can be invoked if and only
     * if the student knowledge points are equal to the maximum. This
     * method is a special ability which enables the student to heal
     * itself by assigning the defence points as it's hit points
     * and at the same time increase different attributes.
     * If the method the student does not have enough KP we throw an Exception
     * stating that the students does not have enough KP
     */

    public void naturalLanguageProcessing() throws Exception {
        if (this.currentKP == getMaxKP()) {
            System.out.println(this.getName()+ " is using naturalLanguageProcessing to heal himself.");
            increaseHP(getDefence());
            increaseEP(4);
            currentKP = 0;
        } else {
            throw new Exception("Not enough KP");
        }
    }
}