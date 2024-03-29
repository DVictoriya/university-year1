 abstract class Animal {
	private String name;
	private int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public abstract void makeNoise();

	public abstract void eat(Food type)throws Exception; // updating the abstract class eat to throw an exception
		
	
}