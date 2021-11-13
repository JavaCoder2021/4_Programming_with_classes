/*
1. 
Создать объект класса Текст, используя классы Предложение, Слово. 
Методы: дополнить текст, вывести на консоль текст, заголовок текста.  
*/

package by.epam.classes.the_simplest_classes_and_objects;

import java.util.*;

public class Text {
    
    private ArrayList<Sentence> text = new ArrayList<>();
    private String head;
    
    public Text()
    {
        //
    }
    
    public void setHead(String head)
    {
        this.head = head;
    }
    
    public String getHead()
    {
        return head;
    }
    
    public void addSentence(Sentence sentence) 
    {
        text.add(sentence);
    }
    
    public void print()
    {
        System.out.println(head + ". ");
        for (Sentence sentense : text)
            sentense.print();
    }
    
}
