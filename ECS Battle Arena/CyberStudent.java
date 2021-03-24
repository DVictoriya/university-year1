/**
 * Here we are creating a type of student which studies Computer Science with Cyber security.
 * The student extends all attributes from "Student"
 */
public class CyberStudent extends Student {
    public CyberStudent(String name) {
        /**
         * In the constructor we assign the corresponding attributes
         * with the corresponding value presented in the table.
         */
        super(name, 7, 7, 5, 6, 6);
    }

    /**
     * "cyberAttack" is a method which can be invoked if and only
     * if the student knowledge points are equal to the maximum. This
     * method is a special ability which enables the student to deal damage
     * to all members in the the enemy team by iterating over it using for each loop
     * also increase different attributes.
     * If the method the student does not have enough KP we throw an Exception
     * stating that the students does not have enough KP
     */
    public void cyberAttack(Team enemyTeam)throws Exception {
        if (this.currentKP == getMaxKP()) {
            System.out.println(this.getName()+ " is using cyberAttack in order to attack all of the members of the enemy team " +enemyTeam.getName() );
            for(Character enemy : enemyTeam.getMembers()){
                enemy.decreaseHP(100 * getAttack() / (100 + enemy.getDefence()));
                if (enemy.getHP() == 0) {
                    System.out.println(enemy.getName()+ " has been defeated.");
                    increaseEP(4);
                }
                increaseEP(4);
                currentKP= 0;
            }
        }else {
            throw new Exception("Not enough KP");
        }
    }
}