package by.epam.classes.the_simplest_classes_and_objects;

public class Word {
    
    private String word;
    
    public Word()
    {
        this.word = "null";
    }
    
    public Word(String word)
    {
        setValue(word);
    }
    
    public void setValue(String word) 
    {
        this.word = word;
    }  

    public String getValue() 
    {
        return word;
    }    
    
}
