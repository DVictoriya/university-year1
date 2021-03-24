import java.util.Random;

/**
 * Creating a class MonsterTeam which extends class "Team" and overrides
 * the move() method
 */
public class MonsterTeam extends Team {

    public MonsterTeam(String name){
        super(name);


    }

    /**
     *Implementing two methods randomMember() and randomStudent()
     * where we create a range with "Random" and we assign the minimum
     * value as 0 and the maximum to correspond to the length of the team.
     * Those to methods will enable us to attack the members of the StudentTeam
     * randomly
     * */
    public int randomMember(int min, int max){
        Random number = new Random();
        return number.nextInt(max-min)+min;
    }
    public int randomStudent(Team team){
        int i = randomMember(0, team.getMembers().length);
        if(team.getMembers()[i].getHP()==0){
            i = randomStudent(team);
        }
        return i;
    }

    /**
     *Overriding the method move(). In this method we check if the member is a "Minion"
     * and whenever this is true we invoke the special abilities of the Minion declared in the "Monster2" class.
     * If this is not true and the member is actually a "Boss" we invoke all special abilities in the "Monster2" class
     * as well as in the "Boss" class
     */
    public void move(Character member, Team enemyTeam)  {
        if(member instanceof Minion){
            ((Minion) member).strike(enemyTeam.getMembers()[randomStudent(enemyTeam)]); //attack randomly
        }
        else if(member instanceof Boss){
            ((Boss) member).strike(enemyTeam.getMembers()[randomStudent(enemyTeam)]); //attack randomly
        }
    }

}
