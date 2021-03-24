/**
 * Here we are creating a type of student which studies Software Engineering.
 * The student extends all attributes from "Student"
 */
public class SEStudent extends Student {
    /**
     * In the constructor we assign the corresponding attributes
     * with the corresponding value presented in the table.
     */
    public SEStudent(String name) {
        super(name, 8, 5, 8, 4, 10);
    }

    /**
     * "groupWork" is a method which can be invoked if and only
     * if the student knowledge points are equal to the maximum. This
     * method is a special ability which enables all alive students to deal damage
     * to the enemy, also increase different attributes.
     * If the method the student does not have enough KP we throw an Exception
     * stating that the students does not have enough KP
     */
    public void groupWork(Character enemy) throws Exception {
        if (this.currentKP == getMaxKP()) {
            for (Character member : getTeam().getMembers()) {
                if (member.getHP() > 0) {
                    System.out.println(this.getName()+ " is using groupWork together with his friends to attack the enemy "+ enemy.getName());
                    enemy.decreaseHP(100 * getAttack() / (100 + enemy.getDefence()));
                    increaseEP(4);
                }
                if (enemy.getHP() == 0) {
                    System.out.println(enemy.getName()+ " has been defeated");
                    increaseEP(4);
                }
            }
        }else {
            throw new Exception("Not enough KP");
        }
        currentKP = 0;
    }

    /**
     * "groupWork" is a method which can be invoked if and only
     * if the student knowledge points are equal to the maximum. This
     * method is a special ability which enables a student to heal all alive
     * members in the team, also increase different attributes.
     * If the method the student does not have enough KP we throw an Exception
     * stating that the students does not have enough KP
     */
    public void groupDiscussion() throws Exception {
        if (this.currentKP == getMaxKP()) {
            for (Character member : getTeam().getMembers()) {
                if (member.getHP() > 0) {
                    System.out.println("OH wow" + this.getName()+ " is using groupDiscussion in order to heal all remaining members of the team");
                    member.increaseHP(this.getDefence() / 2);
                    increaseEP(4);
                }
            }
        } else {
            throw new Exception("Not enough KP");
        }
        currentKP = 0;
    }
}