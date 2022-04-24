package by.epam.classes.aggregation_and_composition.task1;

import java.util.*;

public class Text {

	private String text = "";
	private List<Sentence> sentences = new ArrayList<Sentence>();
	private String header = "";

	public Text() {
		super();
	}

	public Text(List<Sentence> sentences) {
		super();
		this.sentences = sentences;
	}

	public Text(String header) {
		super();
		this.header = header;
	}

	public Text(List<Sentence> sentences, String header) {
		super();
		this.sentences = sentences;
		this.header = header;
	}

	public List<Sentence> getSentences() {
		return sentences;
	}

	public void addSentence(Sentence sentence) {
		sentences.add(sentence);
	}

	public void addSentences(List<Sentence> sentences) {
		this.sentences.addAll(sentences);
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((header == null) ? 0 : header.hashCode());
		result = prime * result + ((sentences == null) ? 0 : sentences.hashCode());
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
		Text other = (Text) obj;
		if (header == null) {
			if (other.header != null)
				return false;
		} else if (!header.equals(other.header))
			return false;
		if (sentences == null) {
			if (other.sentences != null)
				return false;
		} else if (!sentences.equals(other.sentences))
			return false;
		return true;
	}

	@Override
	public String toString() {
		text = text + header + ".\n";
		for (Sentence sentense : sentences)
			text = text + sentense + "\n";
		return text;
	}

}
