package by.epam.classes.aggregation_and_composition.task1;

import java.util.*;

public class Sentence {
    
    private ArrayList<String> words = new ArrayList<>();

    public Sentence() {
        //
    }
    
    public Sentence(Word word) {
        addWord(word);
    }
        
    public void addWord(Word word) {
        this.words.add(word.getValue());
    }
    
    public void print() {
        for (int i = 0; i < words.size(); i++) {
            if ((i + 1) == words.size())
                System.out.print(words.get(i) + ". ");
            else
                System.out.print(words.get(i) + " ");
        }
    }
    
}
