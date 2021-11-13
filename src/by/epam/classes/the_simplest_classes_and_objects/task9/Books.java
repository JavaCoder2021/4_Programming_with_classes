package by.epam.classes.the_simplest_classes_and_objects;

import java.util.*;

public class Books {
    
    LinkedList<Book> books = new LinkedList();
    
    public void addBooks() 
    {
        books.add(new Book("Самый богатый человек в Вавилоне", "Джордж Клейсон", "Попурри", 2021, 
                "160", 13.55, "Мягкая обложка"));
        books.add(new Book("Как завоевывать друзей и оказывать влияние на людей", "Дейл Карнеги", "Попурри", 2020, 
                "352", 13.21, "Мягкая обложка"));
        books.add(new Book("Думай и Богатей!", "Наполеон Хилл", "АСТ", 2019, 
                "384", 14.41, "Твердый переплет"));
        books.add(new Book("Богатый папа, бедный папа", "Роберт Кийосаки", "Попурри", 2021, 
                "352", 24.74, "Мягкая обложка"));
    }
       
    public void sortByAuthor(Scanner input) 
    {
        System.out.print("Author: ");
        String bookAuthor = input.nextLine();
        for (Book mbr : books) 
            if (bookAuthor.equals(mbr.getAuthor()))
                mbr.print();
    }
    
    public void sortByPublisher(Scanner input) 
    {
        System.out.print("Publisher: ");
        String bookPublisher = input.nextLine();
        for (Book mbr : books) 
        {    
            if (bookPublisher.equals(mbr.getPublisher()))
                mbr.print();
        }
    }
    
    public void sortByYear(Scanner input) 
    {
        System.out.print("After given year: ");
        while (!input.hasNextInt()) {
            input.next();
            System.out.println("Invalid input!");
            System.out.print("After given year: ");
        }
        int year = Integer.parseInt(input.nextLine());
        for (Book mbr : books) 
        {    
            if (mbr.getYearOfPublication() > year)
                mbr.print();
        }
    }
    
}
