package dictionary;

import java.util.HashMap;
import java.util.Map;

public class SaveableDictionary {
	private final Map<String, String> dictionary;

	public SaveableDictionary() {
		dictionary = new HashMap<>();
	}

	public void add(String words, String translation) {
		dictionary.put(words, translation);
	}

	public String translate(String word) {
		if (dictionary.containsKey(word)) {
			return dictionary.get(word);
		}

		return dictionary.entrySet().stream().filter(entry -> entry.getValue().equals(word)).map(Map.Entry::getKey).findFirst().orElse(null);
	}

	public void delete(String word) {
		dictionary.remove(word);
	}


}
