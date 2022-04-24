package by.epam.classes.aggregation_and_composition.task1;

import java.util.*;

public class Sentence {

	private String sentence = "";
	private List<Word> words = new ArrayList<Word>();

	public Sentence() {
		super();
	}

	public Sentence(Word word) {
		super();
		words.add(word);
	}

	public Sentence(List<Word> words) {
		super();
		this.words = words;
	}

	public void addWord(Word word) {
		this.words.add(word);
	}

	public void removeWord(Word word) {
		this.words.remove(word);
	}

	public void addWords(List<Word> words) {
		this.words.addAll(words);
	}

	public List<Word> getWords() {
		return words;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((words == null) ? 0 : words.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		if (words == null) {
			if (other.words != null)
				return false;
		} else if (!words.equals(other.words))
			return false;
		return true;
	}

	@Override
	public String toString() {
		for (int i = 0; i < words.size(); i++) {
			if ((i + 1) == words.size())
				sentence = sentence + words.get(i) + ".";
			else
				sentence = sentence + words.get(i) + " ";
		}
		return sentence;
	}

}
