public class Main {
	public static void main(String[] args) {
		Animal mywolf = new Wolf("ALEK", 11);
		mywolf.makeNoise(); //calling overridden makeNoise method
		Animal myparrot = new Parrot("Olivera", 35);
		myparrot.makeNoise();  //calling overridden makeNoise method
		Food meat = new Meat("meat");
		Food plant = new Plant("Plant");
		
		System.out.println(mywolf);
		System.out.println(myparrot);
		System.out.println(meat);
		System.out.println(plant);
	}
}