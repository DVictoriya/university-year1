public abstract class Carnivore extends Animal { // creating abstact class extension of the abstract superclass
    public Carnivore(String name, int age) {
        super(name, age);
    }

    public Carnivore(){

    }

    public void eat(Food type) throws Exception { // checking the food given and if it is something the animal does not
        // eat we are throwing and error mesage
        if (type instanceof Meat) {
            System.out.println(this.getName() + "is eating" + type.getFoodName());
        } else {
            throw new Exception("Sorry,I eat only meat.");
        }
    }

}