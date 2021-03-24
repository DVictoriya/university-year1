public class Main {
	public static void main(String[] args) { // creating two new object assigning them strings
		WordGroup plato = new WordGroup(
				"You can discover more about a person in an hour of play than in a year of conversation");
		WordGroup roosevelt = new WordGroup("When you play play hard when you work dont play at all");
	

        for (String i : plato.getWordArray()) { // taking the splitted and concerted to lowercase string
			System.out.println(i);
		}
		for (String i : roosevelt.getWordArray()) { // taking the splitted and concerted to lowercase string
			System.out.println(i);
		}
		
		for(String j : plato.getWordSet(roosevelt)) { // printing them to the screen
		  System.out.println(j);
	}
	
}
}
