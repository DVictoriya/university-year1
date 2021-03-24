import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Creating a helper class where all functions regarding the text file are
 * implemented.
 */

public class TowerOfMonstersFileReader {
    private BufferedReader reader;

    /**
     * Creating a FileReader which enable us to
     * read from the text file.
     *
     */
    public TowerOfMonstersFileReader(String fileName) {
        try {
            reader = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage() + " File not found");
        }
    }

    /**
     * getLine() method will enable us to
     * read each line of the text file
     *
     */

    public String getLine() {
        String line = null;

        try {
            line = reader.readLine();
            return line;

        } catch (IOException e) {
            System.out.println(
                    e.getMessage() + "File not read correctly");
        }
        return null;
    }

    /**
     *Here we create a method which enables us
     *to read through the text file and separate the
     * different types of monsters from one another Name(Type,level).
     * Afterward,we add the monsters to an ArrayList.
     * Every new line corresponds to a level.
     */

    public ArrayList<MonsterTeam> CreatingMonsterTeam() {
        ArrayList<MonsterTeam> TowerOfMonstersList = new ArrayList<>();
        String newLine;
        int level= 0;
        while ((newLine = getLine()) != null) {
            level ++;
            MonsterTeam teamForLevel = new MonsterTeam( "the MONSTERS on level " +level);
            String[] parts= newLine.split(";");
            String allInformationAboutMonster = parts[0];
            for(String nameTypeAndLevel : parts){
                Character monster = splitMonster(nameTypeAndLevel);
                teamForLevel.addMember(monster);
            }
            TowerOfMonstersList.add(teamForLevel);
        }
        return TowerOfMonstersList;

        /**
         * In the last method splitMonster() we pass
         * the string which was read and placed in the ArrayList
         * Then we take the remaining part which consists of (Type,level)
         * and yet again we split it.
         * Finally we check to see whether the player is of
         * type Minion or Boss.
         */
    }
    public Character splitMonster(String allInformationAboutMonster){
        String[] nameOfMonsterAndRest = allInformationAboutMonster.split("\\(");
        String name = nameOfMonsterAndRest[0];
        String andRest = nameOfMonsterAndRest[1];

        String[] TypeAndLevel = andRest.split(",");
        String type = TypeAndLevel[0];
        int level = Integer.parseInt(TypeAndLevel[1].split("\\)")[0]);

         Character enemy;
         if(type.equals("Minion")){
             enemy= new Minion(name);
             enemy.setLevel(level);
         }
         else if(type.equals("Boss")){
             enemy = new Boss(name);
             enemy.setLevel(level);
         }
         else{
             System.out.println("Invalid type of enemy");
             enemy = null;
         }
         return enemy;
  }

}
