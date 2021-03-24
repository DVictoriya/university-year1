/**
 * Creating a class StudentTeam which extends class "Team" and overrides
 * the move() method
 */
public class StudentTeam extends Team {
    public StudentTeam(String name) {
        super(name);
    }

    /**
     * In the overridden method move() the first part is regarding the whether the member is of
     * type AIStudent and if this is true we check whether the member's KP is equal to the maximum
     * if and only if this is true we call the special abilities. Whenever we have a special ability
     * which deals damage to the enemy, we have implemented a method in class "Team" which returns the member
     * with the lowest HP In order to kill it.However, if the the student does not have maximum KP we invoke
     * two other special abilities again declared in the "Team" class.
     */
    public void move(Character member, Team enemyTeam) throws Exception {
        if (member instanceof AIStudent) {
            if (((AIStudent) member).currentKP == ((AIStudent) member).getMaxKP()) {
                ((AIStudent) member).machineLearning(enemyTeam.getMinHP());
            } else {
                if (((AIStudent) member).currentKP == ((AIStudent) member).getMaxKP()) {
                    if (member.getHP() > 0 && member.getHP() < 4) {
                        ((AIStudent) member).naturalLanguageProcessing();
                    }
                } else {
                    if (((AIStudent) member).currentKP > ((AIStudent) member).getMaxKP()) {
                        ((AIStudent) member).javaProgramming(enemyTeam.getMinHP());
                    } else {
                        ((AIStudent) member).selfStudy();
                    }
                }
            }
        } else if (member instanceof CSStudent) {
            if (((CSStudent) member).currentKP == ((CSStudent) member).getMaxKP()) {
                ((CSStudent) member).pairWorking(member.getTeam().getMinHP(), enemyTeam.getMinHP());
            } else {
                if (((CSStudent) member).currentKP == ((CSStudent) member).getMaxKP()) {
                    ((CSStudent) member).support(member.getTeam().getMinHP());
                } else {
                    if (((CSStudent) member).currentKP > ((CSStudent) member).getMaxKP()) {
                        ((CSStudent) member).javaProgramming(enemyTeam.getMinHP());
                    } else {
                        ((CSStudent) member).selfStudy();
                    }
                }
            }
        } else if (member instanceof CyberStudent) {
            if (((CyberStudent) member).currentKP == ((CyberStudent) member).getMaxKP()) {
                ((CyberStudent) member).cyberAttack(enemyTeam);
            } else {
                if (((CyberStudent) member).currentKP > ((CyberStudent) member).getMaxKP()) {
                    ((CyberStudent) member).javaProgramming(enemyTeam.getMinHP());
                } else {
                    ((CyberStudent) member).selfStudy();
                }
            }
        } else if (member instanceof SEStudent) {
            if (((SEStudent) member).currentKP == ((SEStudent) member).getMaxKP()) {
                ((SEStudent) member).groupWork(enemyTeam.getMinHP());
            } else {
                if (((SEStudent) member).currentKP == ((SEStudent) member).getMaxKP()) {
                    ((SEStudent) member).groupDiscussion();
                } else {
                    if (((SEStudent) member).currentKP > ((SEStudent) member).getMaxKP()) {
                        ((SEStudent) member).javaProgramming(enemyTeam.getMinHP());
                    } else {
                        ((SEStudent) member).selfStudy();

                    }
                }
            }

        }

    }
}
