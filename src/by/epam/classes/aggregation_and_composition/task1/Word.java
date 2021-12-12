package by.epam.classes.aggregation_and_composition.task1;

public class Word {
    
    private String word;
    
    public Word() {
        this.word = "null";
    }
    
    public Word(String word) {
        setValue(word);
    }
    
    public void setValue(String word) {
        this.word = word;
    }  

    public String getValue() {
        return word;
    }    
    
}
