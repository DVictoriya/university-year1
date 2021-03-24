public class Parrot extends Omnivore { // creating a subclass of animal

	public Parrot(String name, int age) {
		super(name, age); // inheriting variables from superclass
	}

	public void makeNoise() { // overriding noise method
		System.out.println("quakquak"); // printing noise
	}
}