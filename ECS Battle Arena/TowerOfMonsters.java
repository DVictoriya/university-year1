import java.util.ArrayList;

/**
 * creating the TowerOfMonsters class
 * where we will implement the algorithm
 * for the different battles.
 */

public class TowerOfMonsters {

    private ArrayList<MonsterTeam> team; //declaring an ArrayList where we will store all members of the enemy team

    public TowerOfMonsters(String fileName) {
        TowerOfMonstersFileReader tower = new TowerOfMonstersFileReader(fileName);
        team = tower.CreatingMonsterTeam(); //adding the members of the Monster team in the array


    }

    /**
     *In this helper method towerOfMonsters, we declare a integer
     * counter corresponds to the levels.
     * We then create a new Battle in which we add both teams
     * Having several if statements enables us to check whether
     * the students have won. If they have we then move on to the next level.
     */

    public void towerOfMonsters(Guild guild) throws Exception {
        welcome();
        int counter = 0;
        while (counter < team.size() && !guild.guildHasFallen()) {
            MonsterTeam monsterTeam = team.get(counter);

            Team studentTeam;
            studentTeam = guild.getTeam();

            System.out.println("============Battle " + (counter + 1) + "  will be between " + studentTeam.getName() + " VS " + monsterTeam.getName()+" =============");
            System.out.println();
            Battle battle = new Battle(studentTeam, monsterTeam);
            if (battle.fight().equals(studentTeam)) {
                counter++;
                if (counter >= team.size()) {
                    System.out.println(studentTeam.getName() + " have won over " + monsterTeam.getName());
                } else {
                    if (!guild.guildHasFallen()) {
                        System.out.println(studentTeam.getName() + " have won over " + monsterTeam + " and proceed to the next level " + (counter + 1) + "!");
                    } else {
                        System.out.println(studentTeam.getName() + " were defeated by " + monsterTeam.getName() + " on level " + (counter + 1) + "!");
                        System.out.println(studentTeam.getName() + " were not able to defeat the Tower of Monsters...");
                    }
                }
            }
        }

    }

    public void welcome() {
        System.out.println("Welcome to TowerOfMonsters");
    }

    /**
     *In the main method we create a ne TowerOfMonsters where we pass
     * the name of the file from which we will read.
     * Then we create a guild holding all 8 students, from
     * which the teams will be formed.
     * Finally calling the towerOfMonster() method containing
     * the algorithm for the battles.
     */
    public static void main(String[] args) throws Exception {
        TowerOfMonsters tower = new TowerOfMonsters("monsters.txt");

        Character aiStudent1 = new AIStudent("John Lock");
        Character aiStudent2 = new AIStudent("Jack Shepard");
        Character csStudent1 = new CSStudent("Kate Austen");
        Character csStudent2 = new CSStudent("Sayid Jarrah");
        Character seStudent1 = new SEStudent("Hugo Reyes");
        Character seStudent2 = new SEStudent("James Ford");
        Character cyberStudent1 = new CyberStudent("Jin-Soo Kwon");
        Character cyberStudent2 = new CyberStudent("Frank Lapidus");
        Guild guild = new Guild();
        guild.addMember(aiStudent1);
        guild.addMember(aiStudent2);
        guild.addMember(csStudent1);
        guild.addMember(csStudent2);
        guild.addMember(seStudent1);
        guild.addMember(seStudent2);
        guild.addMember(cyberStudent1);
        guild.addMember(cyberStudent2);
        tower.towerOfMonsters(guild);

    }
}
