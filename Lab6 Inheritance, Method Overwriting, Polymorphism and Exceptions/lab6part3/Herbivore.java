public abstract class Herbivore extends Animal { // creating abstact class extension of the abstract superclass
	public Herbivore(String name, int age) {
		super(name, age);
	}

	public void eat(Food type) throws Exception { // checking the food given and if it is something the animal does not
													// eat we are throwing and error mesage
		if (type instanceof Plant) {
			System.out.println(this.getName() + "is eating" + type.getFoodName());
		} else {
			throw new Exception("Sorry,I eat only plants.");
		}
	}
}