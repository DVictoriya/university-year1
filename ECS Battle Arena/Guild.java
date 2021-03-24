/**
 * This class will enable us to create a guild
 * from which later we will be able to create teams of
 */

import java.util.ArrayList;
import java.util.Collection;

public class Guild {
    Team teamOfStudents = new StudentTeam("Students");
    Team teamOfMonsters = new MonsterTeam("Monsters");

    public Guild() {

    }

    ArrayList<Character> guild = new ArrayList<>();// creating an Arraylist where we will store the members of the guild

    public void addMember(Character character) { //adds character to guild
        guild.add(character);
    }

    /**
     * In the method guildHasFallen(), we check
     * to se whether in the guilds there are still alive
     * members.
     * if they are alive we return false, if they
     * are not alive we return true
     */
    public boolean guildHasFallen() {
        for (Character teamStudent : getMembers()) {
            if (teamStudent.getHP() > 0)
                return false;
        }
        return true;
    }


    public Collection<Character> getMembers() { //returning the characters of the guild
        return this.guild;
    }

    /**
     * getTeam() method is designed to choose 5 or less
     * students for the team. Also it is checking whether
     * the member is already in team and whether th e team is full.
     * If the statements above are note fulfilled we add the member.
     */
    public Team getTeam() {
        Team studentTeam = new StudentTeam("Students");
        if (guild.size() <= 5) {
            for (Character student : guild) {
                if (studentTeam.addMember(student) == -1) {
                    System.out.println();
                } else {
                    studentTeam.addMember(student);
                }
            }
        }
        for (Character student1 : guild) {
            if (studentTeam.addMember(student1) == -2) {
                System.out.println();
            } else {
                studentTeam.addMember(student1);
            }
        }
        return studentTeam;

    }
}
