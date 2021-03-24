import java.util.ArrayList;

/**
 * Creating a class which takes to variables one of which is the name,
 * which later will be use to clarify whether the team has students or monsters.
 * The latter is an ArrayList which will store the member of a team.
 */

public abstract class Team {  //making the class abstract in order to override the abstract method move()
    private final String name;
    private final ArrayList<Character> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;

    }

    /**
     * Implementing a move() method which will be later used to be overridden
     * and invoke special abilities of students and monsters
     */
    public abstract void move(Character member, Team enemyTeam) throws Exception;

    /**
     * Declaring to accessor methods which will return the name of the team
     * and the members
     */
    public String getName() {
        return name;
    }

    public Character[] getMembers() {
        return this.members.toArray(new Character[0]);
    }

    /**
     * This method "addMember" is used to add a member to a team,
     * however an team could only have 5 members. What is more,
     * we cannot add a member which is already in the team and
     * we cannot extend the number of member in the team.
     */

    public int addMember(Character member) {


        int status = 0;
        if (members.contains(member)) {
            status = -1;
        } else if (members.size() == 5) {
            status = -2;
        } else if (members.add(member)) {
            member.setTeam(this);
            status = members.size();
        }
        return status;
    }

    /**
     * In the method teamHasFallen(), we check
     * to se whether in the teams there are still alive
     * members.
     * if they are alive we return false, if they
     * are not alive we return true
     */
    public boolean teamHasFallen() {
        for (Character teamStudent : getMembers()) {
            if (teamStudent.getHP() > 0)
                return false;
        }
        return true;
    }

    /**
     * Creating an additional method which returns the
     * member with the lowest HP. Which will be later used in the
     * StudentTeam class, in order to determine which enemy to attack
     * or which student to heal.
     */


    public Character getMinHP() {
        Character someone = null;
        int i = 999999999;
        for (Character person : this.getMembers()) {
            if (person.getHP() > 0) {
                if (person.getHP() < i) {
                    someone = person;
                    i = someone.getHP();
                }
            }
        }
        return someone;
    }

}