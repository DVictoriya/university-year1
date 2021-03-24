import java.util.HashSet;
import java.util.HashMap;

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

	public HashMap<String, Integer> getWordCounts() { // creating a Hashmap , adding everything from the hashset and assigning it a value
		HashMap<String, Integer> map = new HashMap();
		for (String words : getWordArray()) {
			if (!map.containsKey((words))) {
				map.put(words, 1);
			} else {
				map.put(words, map.get(words) + 1);
			}

		}
		return map;
	}
}