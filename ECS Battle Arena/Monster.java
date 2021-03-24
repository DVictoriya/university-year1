/**
 * Here we create an interface class Monster
 */
public interface Monster {
    /**
     * In this class we implements only strike() method
     * which will enable other classes to override this method.
     * In order to implement the abilities of Monster we
     * create another class "Monster2"
     */
    void strike(Character enemy);
}