/**
 * In this class we implement all special abilities of Monster
 * which will be then inherited by the subclasses "Minion" and "Boss"
 */
public class Monster2 extends Character{ //extending Character in order to inherit all attributes
    public Monster2(String name, int baseHP, int baseAtk, int baseDef, int baseSpd){
        super(name, baseHP, baseAtk, baseDef, baseSpd);
    }

    /**
     *Implementing a method syntaxError() which enables Minion and Boss
     * to attack the student as well as decrease their knowledge points.
     * Invoking this method enables the Minion and Boss to increase their
     * explorer points(EP)
     */
    public void syntaxError(Character enemy){
        System.out.println(this.getName()+ " is using Syntax Error on " + enemy.getName());
        enemy.decreaseHP(100 * getAttack() / (100 + enemy.getDefence()));
        if (enemy instanceof Student){
            ((Student) enemy).increaseKP(3);
        }
        if (enemy.getHP() == 0) {
            System.out.println(enemy.getName()+ " has been defeated");
            increaseEP(4);
        }
        increaseEP(3);
    }

    /**
     * The implemented method nullPointerException()enables
     * minions and bosses to heals the themself
     * by the amount same as the monster’s defence.
     */
    public void nullPointerException(){
        System.out.println(this.getName()+ " just gained " +this.getDefence()+ " HP");
        increaseHP(getDefence());
    }
    /**
     * The method arrayIndexOutOfBoundException() enables Minion and Boss
     * to attack the student, deal double damage as well as decrease their knowledge points.
     * Invoking this method enables the Minion and Boss to increase their
     * explorer points(EP)
     */
    public void arrayIndexOutOfBoundException(Character enemy){
        System.out.println(this.getName()+ " is using array index out of Bound Exception on and deal double damage on  " + enemy.getName());
        enemy.decreaseHP(2*(100 * getAttack() / (100 + enemy.getDefence())));
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