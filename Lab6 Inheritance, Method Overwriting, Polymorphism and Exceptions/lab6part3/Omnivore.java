public abstract class Omnivore extends Animal{ // creating abstact class extension of the abstract superclass
	public Omnivore(String name, int age){
		super(name, age);
	}

	public void eat(Food type) { // checking the food given and if it is something the animal eats
		if (type instanceof Plant) {
			System.out.println(this.getName() + "is eating" + type.getFoodName()); //we print that that is something that the eanimal eats
		} 
}
}