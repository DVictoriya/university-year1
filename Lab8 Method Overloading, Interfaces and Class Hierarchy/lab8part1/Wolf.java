public class Wolf extends Carnivore { // creating a subclass of animal
    public Wolf(String name, int age) {
        super(name, age); // inheriting variables from superclass
    }
    public Wolf(){
    }

    public void makeNoise() { // overriding noise method
        System.out.println("owwww"); // printing noise
    }

}