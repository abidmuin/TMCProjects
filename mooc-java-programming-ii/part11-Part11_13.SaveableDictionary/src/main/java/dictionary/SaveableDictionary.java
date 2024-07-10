package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {
	private final Map<String, String> finnishToOther;
	private final Map<String, String> otherToFinnish;
	private String file;

	public SaveableDictionary() {
		this.finnishToOther = new HashMap<>();
		this.otherToFinnish = new HashMap<>();
	}

	public SaveableDictionary(String file) {
		this();
		this.file = file;
	}

	public boolean load() {
		try {
			File dictionaryFile = new File(this.file);
			Scanner fileReader = new Scanner(dictionaryFile);

			while (fileReader.hasNextLine()) {
				String line = fileReader.nextLine();
				String[] parts = line.split(":");
				String word = parts[0];
				String translation = parts[1];
				this.finnishToOther.put(word, translation);
				this.otherToFinnish.put(translation, word);
			}

			fileReader.close();
			return true;
		} catch (IOException e) {
			return false;
		}
	}

	public boolean save() {
		try {
			FileWriter writer = new FileWriter(this.file);

			for (String key : finnishToOther.keySet()) {
				String translation = finnishToOther.get(key);
				writer.write(key + ":" + translation + "\n");
			}

			writer.close();
			return true;
		} catch (IOException e) {
			return false;
		}
	}

	public void add(String word, String translation) {
		if (!this.finnishToOther.containsKey(word) && !this.otherToFinnish.containsKey(word)) {
			this.finnishToOther.put(word, translation);
			this.otherToFinnish.put(translation, word);
		}
	}

	public String translate(String word) {
		if (this.finnishToOther.containsKey(word)) {
			return this.finnishToOther.get(word);
		} else if (this.otherToFinnish.containsKey(word)) {
			return this.otherToFinnish.get(word);
		} else {
			return null;
		}
	}

	public void delete(String word) {
		if (this.finnishToOther.containsKey(word)) {
			String translation = this.finnishToOther.get(word);
			this.finnishToOther.remove(word);
			this.otherToFinnish.remove(translation);
		} else if (this.otherToFinnish.containsKey(word)) {
			String translation = this.otherToFinnish.get(word);
			this.otherToFinnish.remove(word);
			this.finnishToOther.remove(translation);
		}
	}
}
