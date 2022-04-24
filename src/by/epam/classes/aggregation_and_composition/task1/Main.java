/*
 * 1. 
 * Создать объект класса Текст, используя классы Предложение, Слово. 
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.  
 */
package by.epam.classes.aggregation_and_composition.task1;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Sentence sentense1 = new Sentence();
		Sentence sentense2 = new Sentence();
		sentense1.addWords(Arrays.asList(new Word("Train"), new Word("let's"), new Word("go"), new Word("to"), new Word("Moscow")));
		sentense2.addWords(Arrays.asList(new Word("Car"), new Word("goes"), new Word("to"), new Word("Minsk"), new Word("every"), new Word("week")));
		
		Text text = new Text();
		text.setHeader("Train");
		text.addSentences(Arrays.asList(sentense1, sentense2));
		
		System.out.print(text);
		
	}

}
