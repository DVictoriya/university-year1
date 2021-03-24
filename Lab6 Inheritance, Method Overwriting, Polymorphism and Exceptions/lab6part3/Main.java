public class Main {
	public static void main(String[] args) {
		Food meat = new Meat("Meat");
		Food plant = new Plant("Plant");
		Carnivore mywolf = new Wolf("Aleksander", 11);
		mywolf.makeNoise();
		Omnivore myparrot = new Parrot("Olivera", 35);
		myparrot.makeNoise();
		myparrot.eat(plant);
		Herbivore mykoala = new Koala("Ekatherina", 28);
		mykoala.makeNoise();
		
		
		try {
			mykoala.eat(meat); //givin meat to herbivore
		}
		catch (Exception ex) {
			ex.printStackTrace(); //catching exception (printing  error message)
			
		}
		try {
			mywolf.eat(plant);  //givin plat to carnivore
		}
		catch (Exception ex) {  //catching exception (printing  error message)
			ex.printStackTrace();
			
		}
	}
}