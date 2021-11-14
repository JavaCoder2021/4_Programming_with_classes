package javacoder2021;

import by.epam.classes.aggregation_and_composition.*;

public class JavaCoder2021 {

    public static void main(String[] args) {
        
        Word word1 = new Word("Train");
        Word word2 = new Word();
        Word word3 = new Word();
        word2.setValue("let's");
        word3.setValue("go");
        
        Sentence sentense1 = new Sentence();
        sentense1.addWord(word1);
        sentense1.addWord(word2);
        sentense1.addWord(word3);
        sentense1.print();
        System.out.println("\n");
        
        Word word4 = new Word("Green");
        Word word5 = new Word("tree");
        Sentence sentense2 = new Sentence();
        sentense2.addWord(word4);
        sentense2.addWord(word5);  
        
        Text text = new Text();
        text.setHead("Train");
        text.addSentence(sentense1);
        text.addSentence(sentense2);
        text.print();
    }
}
