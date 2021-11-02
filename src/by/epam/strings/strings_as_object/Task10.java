//10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным 
//или вопросительным знаком. Определить количество предложений в строке X. 

package task10;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        //Input
        Scanner input = new Scanner(System.in);
        System.out.print("Line = ");
        String str = input.nextLine();
                
        output(countOfSentences(str));
        
    }
    
    public static boolean isEndOfnumberSentence(char tmp) {
        
        boolean isEnd = false;

        if (tmp == '.' || tmp == '!' || tmp == '?') 
            isEnd = true;

        return isEnd;
        
    }
    
    public static int countOfSentences(String str) {

        int numberSentences = 0;
        
        for ( char tmp: str.toCharArray() )
        {
            if (isEndOfnumberSentence(tmp))   
                numberSentences++;            
        }
        
        return numberSentences;
         
    }
    
    public static void output (int numberSentences) {
        
        System.out.println("Number of offers = " + numberSentences);
        
    }
    
}
