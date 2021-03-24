public class Koala extends Herbivore{ // creating my own animal which is an extension of herbivore
	public Koala(String name, int age) {
		super(name, age);
	}

	public void makeNoise() {
		System.out.println("squeak");
	}

}