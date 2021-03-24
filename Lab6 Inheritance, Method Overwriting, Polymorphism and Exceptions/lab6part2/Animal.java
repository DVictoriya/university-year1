public abstract class Animal { // creating an abstract superclass
	private String name; // declaring instance variables
	private int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() { // creating method get name
		return name;
	}

	public int getAge() { // creating method get age
		return age;
	}

	public abstract void makeNoise(); // creating an abstract method
}