public class Character implements Comparable<Character> {
    /** Declaring all the variables which are going to be inherited by the subclasses
     *  of Student and Monster of the superclass Character.
     */
    private final String name;
    private final int baseHP;  //Hit points, refer to life of a member.
    private final int baseAtk;  //Attack points, is how damage it can cause.
    private final int baseDef;  //Defence points, are the damage that a member can receive.
    private final int baseSpd;   //Speed points, refer to the turn of a member to make move.
    protected int level;         //The level on  which the player is.
    protected int currentHP;
    protected int currentEP;


    public Team teamName; //Extending the Character class

    /**
     * Initializing all variables in the constructor.
     * Using "this" keyword to shadow the fields presented in the class.
     */

    public Character(String name, int baseHP, int baseAtk, int baseDef, int baseSpd) {
        this.name = name;
        this.baseHP = baseHP;
        this.baseAtk = baseAtk;
        this.baseDef = baseDef;
        this.baseSpd = baseSpd;
        this.level = 1;
        this.currentHP = baseHP;

    }

    /**
     *Declaring an mutator method and accessor method which
     * returns the current team for the character.
     * @param level
     */
    public int setLevel(int level){
        return this.level;
    }

    public void setTeam(Team team) {
        teamName = team;
    }

    public Team getTeam() {
        return teamName;
    }

    public String getName() {
        return name;
    }

    /**
     * Implementing accessor method which return the baseHP,baseAtk,baseDef,baseSpd calculated
     * using the formula Math.round(variable) * Math.pow(level, 1,2). Math.round rounds the variable
     * to a whole number,next we use Math.pow in order to calculate the base in our case "level" to
     * the exponent power "1.2".
     *
     */

    public int getMaxHP() {
        return (int) Math.round(baseHP * Math.pow(level, 1.2));
    }

    public int getAttack() {
        return (int) Math.round(baseAtk * Math.pow(level, 1.2));
    }

    public int getDefence() {
        return (int) Math.round(baseDef * Math.pow(level, 1.2));
    }

    public int getSpeed() {
        return (int) Math.round(baseSpd * Math.pow(level, 1.2));
    }

    public int getTargetEP() {
        return (int) Math.round(10 * Math.pow(level, 1.5));
    }

    public int getHP() {
        return currentHP;
    }

    public int getEP() {
        return currentEP;
    }

    /**
     * Implementing both methods "increaseHP", "decreaseHP" insuring ourselves that
     * whenever we either increase or decrease the Hit points the value will not
     * go over the the maximum specified or below zero.
     *
     */

    public void increaseHP(int amount) {
        if (currentHP + amount > this.getMaxHP()) {
            this.currentHP = this.getMaxHP();
        } else {
            this.currentHP += amount;
        }
    }

    public void decreaseHP(int amount) {
        if (currentHP - amount < 0) {
            this.currentHP = 0;
        } else {
            this.currentHP -= amount;
        }

    }

    /**
     * We use the  method "increaseEP" when we want to increase the explorer points
     * of a student, however this time whenever a student point are over the limit
     * or are equal to the TargetEP we increase the level of the student. And whenever,
     * the player starts a new level we set his/her hit points to maximum.
     */

    public void increaseEP(int amount) {
        this.currentEP += amount;
        if (currentEP >= this.getTargetEP()) {
            level++;
            this.currentEP = 0;
        }
        if(this.currentHP > 0){
            this.currentHP = this.getMaxHP();
        }
        else{
            this.currentHP = 0;
        }
    }

    /**
     * In this method "compareTo" we compare the speed of a
     * student and monster to determine who will first
     * make his move.
     */

    @Override
    public int compareTo(Character o) {
        if (this.getSpeed() == o.getSpeed()) {
            return 0;
        } else if (this.getSpeed() > o.getSpeed()) {
            return 1;
        } else {
            return -1;
        }
    }
}
