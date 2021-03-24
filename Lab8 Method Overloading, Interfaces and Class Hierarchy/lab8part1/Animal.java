abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Animal(){
        this("newborn", 0 );
    } //creating new constructor and chaining it to the original by using this()

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void makeNoise();

    public abstract void eat(Food type) throws Exception; // updating the abstract class eat to throw an exception

    public void eat(Food type, Integer number){ // creating a new method eat with different parameters
        for(int i = 0; i < number; i++ ){ //iterate over number of time animal eats/print
            System.out.println(this.getName()+ " is eating " +type.getFoodName()+ " " +number+ " times a day");

        }
    }

}