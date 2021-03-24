public class Main {
	public static void main(String[] args) {
		Animal mywolf = new Wolf("ALEK", 11); // creating new object Wolf
		Animal myparrot = new Parrot("Olivera", 35); // creating new object Parrot
		Food meat = new Meat("meat"); // creating new object meat
		Food plant = new Plant("Plant"); // creating new object plant

		System.out.println(mywolf);
		System.out.println(myparrot);
		System.out.println(meat);
		System.out.println(plant);
	}
}