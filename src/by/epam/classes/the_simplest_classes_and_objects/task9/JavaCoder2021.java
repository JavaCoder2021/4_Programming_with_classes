package javacoder2021;

import by.epam.classes.the_simplest_classes_and_objects.*;
import java.util.*;

public class JavaCoder2021 {

    public static void main(String[] args) {
        
        Books books = new Books();
    
        Scanner input = new Scanner(System.in);
        int choice;
        
        while (true)
        {
            menuText();
            choice = Integer.parseInt(input.nextLine());
            if (choice == 0)
                break;
            if (choice < 0 || choice > 3) 
            {
                System.out.println("Incorrect choose!");
                continue;
            }
                      
            switch (choice)
            {
                case 1:
                    books.sortByAuthor(input);
                    break;           
                case 2:
                    books.sortByPublisher(input);
                    break;           
                case 3:
                    books.sortByYear(input);
                    break;             
            }     
            
        }    
        
    }
    
    private static void menuText() { 
        System.out.print(
            "\n" + 
            "Выберете пункт меню:\n" +
            "0. Выйти\n" +
            "1. Вывести книги данного автора\n" +
            "2. Вывести книги, выпущенные заданным издательством\n" +
            "3. Вывести книги, выпущенные после заданного года\n" +
            "\n"
        );   
    }
    
}
