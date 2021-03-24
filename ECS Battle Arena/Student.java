/**
 * Creating a class Student which inherits all attributes from the Character class
 * and declaring two new variables
 */
public class Student extends Character  {
    private int maxKP;  //Knowledge points, required for invoking special abilities
    protected int currentKP;

    public Student(String name, int baseHP, int baseAtk, int baseDef, int baseSpd, int maxKP) {
        super(name, baseHP, baseAtk, baseDef, baseSpd);
        this.maxKP = maxKP;
        currentKP = 0;
    }

    /**
     * Setting two accessor methods which return
     * the current number of Knowledge points and
     * the maximum which can be reached.
     *
     */

    public int getKP() {
        return currentKP;
    }
    public int getMaxKP(){
        return maxKP;
    }

    /**
     * Here we are creating a method "increaseKP" which
     * will be used in order to increase the number of knowledge
     * points, however without exceeding the maximum points.
     *
     */

    public void increaseKP(int amount) {
        if (currentKP <= this.maxKP) {
            if (currentKP + amount > this.maxKP) {
                this.currentKP = this.maxKP;
            } else {
                this.currentKP += amount;
            }
        }
    }

    /**
     * Whenever this method is invoked a student will be
     * able to increase certain attributes and at the same time
     * he/she will be able to deal damage to the enemy. This is a special
     * skill.
     */

    public void javaProgramming(Character enemy) {
        increaseEP(3);
        increaseKP(1);
        System.out.println(this.getName()+ "  deals damage to the enemy " +enemy.getName());
        enemy.decreaseHP(100 * this.getAttack() / (100 + enemy.getDefence()));
        enemy.increaseEP(2);
        if (enemy instanceof Student) {
            increaseKP(3);
        }
        if (enemy.getHP() == 0) {
            increaseEP(4);

        }
    }

    /**
     * Another special skill is the method
     * "selfStudy" which is used for
     * increasing the hit point, explorer points
     * and the knowledge points.
     */

    public void selfStudy() {
        System.out.println(this.getName()+ " is using selfStudy to increase his attributes");
        increaseHP(2);
        increaseEP(6);
        increaseKP(2);

    }

}
