import java.util.HashSet;

public class WordGroup {
	private String words;

	public WordGroup(String wordArray) {
		this.words = wordArray.toLowerCase();  // calling method lowercase, which print every word with lower case characters
	}

	public String[] getWordArray() { // spliting the string words on individuaul lines
		return words.split(" ");
	}

	public HashSet<String> getWordSet(WordGroup group) {
		HashSet<String> set = new HashSet();  //creating a hashset and adding all the data to the map
		for (String words : group.getWordArray()) {
			set.add(words);
		}
		for (String words : this.getWordArray()) {
			set.add(words);
		}
		return set;
	}
}