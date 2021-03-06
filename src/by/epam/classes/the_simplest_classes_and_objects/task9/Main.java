/*
 * 9. 
 * Создать класс Book, спецификация которого приведена ниже. 
 * Определить конструкторы, set- и get- методы и метод toString(). 
 * Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль.  
 *  
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.  
 * Найти и вывести:  
 * a) список книг заданного автора;  
 * b) список книг, выпущенных заданным издательством;  
 * c) список книг, выпущенных после заданного года. 
 */
package by.epam.classes.the_simplest_classes_and_objects.task9;

import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    	
    	List<Book> sortedBooks;
        Shelf shelf = new Shelf();
        BookLogic bookLogic = new BookLogic();
        BookView bookView = new BookView();
        int choice;
    	
        shelf.addBook(new Book("Самый богатый человек в Вавилоне", "Джордж Клейсон", "Попурри", 2021, "160", 13.55, "Мягкая обложка"));
        shelf.addBook(new Book("Как завоевывать друзей и оказывать влияние на людей", "Дейл Карнеги", "Попурри", 2020, "352", 13.21, "Мягкая обложка"));
        shelf.addBook(new Book("Думай и Богатей!", "Наполеон Хилл", "АСТ", 2019, "384", 14.41, "Твердый переплет"));
        shelf.addBook(new Book("Богатый папа, бедный папа", "Роберт Кийосаки", "Попурри", 2021, "352", 24.74, "Мягкая обложка"));

        while (true) {
        	
            menuText();
            choice = getIntFromConsol("");
            if (choice < 0 || choice > 3) {
                System.out.println("Incorrect choose!");
                continue;
            }
                 
            if (choice == 0)
                break;
            switch (choice) {
                case 1:
                	sortedBooks = bookLogic.sortByAuthor(getStringFromConsol("Author: "), shelf.getAllBooks());
                	bookView.print(sortedBooks);
                    break;           
                case 2:
                	sortedBooks = bookLogic.sortByPublisher(getStringFromConsol("Publisher: "), shelf.getAllBooks());
                	bookView.print(sortedBooks);
                    break;           
                case 3:
                	sortedBooks = bookLogic.sortByYear(getIntFromConsol("After a given year: "), shelf.getAllBooks());
                	bookView.print(sortedBooks);
                    break;             
            }   
            
        } 
        
    }
    
    public static void menuText() { 
    	
        System.out.print(
            "\n" + 
            "Select the menu item:\n" +
            "0. Exit\n" +
            "1. Display the books of this author\n" +
            "2. Display books published by the specified publisher\n" +
            "3. Display books published after a given year\n" +
            "\n"
        );   
        
    }
    
	public static String getStringFromConsol(String str) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
        System.out.print(str);
        String line = scanner.nextLine();	
        
        return line;
        
	}
    
	public static int getIntFromConsol(String str) {

		int a;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print(str);
		while (!scanner.hasNextInt()) {
			scanner.nextLine();
			System.out.print(str);
		}
		a = scanner.nextInt();

		return a;

	}
    
}
