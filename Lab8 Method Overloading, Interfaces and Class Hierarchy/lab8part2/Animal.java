abstract class Animal implements Comparable<Animal>{ //implementing Comparable in order to use the compareTo method
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Animal(){
        this("newborn", 0 );
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void makeNoise();

    public abstract void eat(Food type) throws Exception; // updating the abstract class eat to throw an exception

    public void eat(Food type, Integer number){
        for(int i = 0; i < number; i++ ){
            System.out.println(this.getName()+ " is eating " +type.getFoodName()+ " " +number+ " times a day");

        }
    }
    public int compareTo(Animal a){ //comparing the ages in the Demo class
        if(this.getAge() == a.getAge()){
            return 0;
        }
        else if(this.getAge() > a.getAge()){
            return 1;
        }
        else if(this.getAge() < a.getAge()){
            return -2;
        }
        return 3;
    }



}