public class Wolf extends Animal { // creating a subclass of animal
	public Wolf(String name, int age) {
		super(name, age); // inheriting variables from superclass
	}

	public void makeNoise() { // declaring noise method
		System.out.println("ouwwww"); // printing noise
	}

}
