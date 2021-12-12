package by.epam.classes.aggregation_and_composition.task1;

import java.util.*;

public class Text {
    
    private ArrayList<Sentence> text = new ArrayList<>();
    private String head;
       
    public void setHead(String head) {
        this.head = head;
    }
    
    public String getHead() {
        return head;
    }
    
    public void addSentence(Sentence sentence) {
        text.add(sentence);
    }
    
    public void print() {
        System.out.println(head + ". ");
        for (Sentence sentense : text)
            sentense.print();
        System.out.println();
    }
    
}
