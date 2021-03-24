import java.util.ArrayList;
import java.util.Collections;

/**
 * Creating the Battle class where we
 * implement the algorithm for each round.
 */
public class Battle {
    /**
     * Declaring two instances for
     * the student and monster team.
     */
    private final Team studentTeam;
    private final Team monsterTeam;

    public Battle(Team studentTeam, Team monsterTeam) {
        this.studentTeam = studentTeam;
        this.monsterTeam = monsterTeam;
    }

    /**
     * In this method fight() we first create an ArrayList where
     * we are going to store all members of both team. Next we call
     * the sort method to sort the members regarding their speed in descending
     * order.
     * Next we implement the algorithm for the battle where, we check if both teams
     * have members which are alive if one of the teams has fallen we return the winning team.
     * What is more we check if the members of the team are alive and so if yes
     * we call the move() method in order for the players to use their special abilities.
     * We return "null" if both teams have survived all 30 rounds.
     */
    public Team fight() throws Exception {
        ArrayList<Character> myCharacter = new ArrayList<>();
        for (Character character1 : studentTeam.getMembers()) { //adding all students
            myCharacter.add(character1);
        }
        for (Character character2 : monsterTeam.getMembers()) { //adding all monsters
            myCharacter.add(character2);

            try {
                Thread.sleep(500);
                Collections.sort(myCharacter, Collections.reverseOrder()); //sorting all members of the teams by speed
                System.out.println("In the battle will participate: ");
                System.out.println();
                for (Character studentCharacter : myCharacter) {
                    System.out.println(studentCharacter.getName());

                }

                for (int round = 1; round < 30; round++) {
                    System.out.println("=========== ROUND : " + round + " ==============");
                    System.out.println();
                    for (Character players : myCharacter) {
                        if (studentTeam.teamHasFallen()) {
                            System.out.println("You are DEAD! Sorry! Monster Team has won.");
                            System.out.println();
                            return monsterTeam;
                        } else if (monsterTeam.teamHasFallen()) {
                            System.out.println("Congratulations! Your Student Team won!");
                            System.out.println();
                            return studentTeam;
                        }
                        if (players.getHP() > 0) {
                            if (players instanceof Student) {
                                studentTeam.move(players, monsterTeam);

                            } else {
                                monsterTeam.move(players, studentTeam);

                            }
                        }
                    }
                    System.out.println();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Both teams survived all 30 rounds.");
        return null;
    }
}

