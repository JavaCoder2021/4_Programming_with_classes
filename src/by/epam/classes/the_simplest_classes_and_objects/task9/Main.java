/*
 * 9. 
 * ������� ����� Book, ������������ �������� ��������� ����. 
 * ���������� ������������, set- � get- ������ � ����� toString(). 
 * ������� ������ �����, ������������ ������ ���� Book, � ����������� �������������� � ��������. 
 * ������ �������� ������ ������ � ������� ��� ������ �� �������.  
 *  
 * Book: id, ��������, �����(�), ������������, ��� �������, ���������� �������, ����, ��� ���������.  
 * ����� � �������:  
 * a) ������ ���� ��������� ������;  
 * b) ������ ����, ���������� �������� �������������;  
 * c) ������ ����, ���������� ����� ��������� ����. 
 */
package by.epam.classes.the_simplest_classes_and_objects.task9;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    	
	    List<Book> books = new LinkedList();
    	List<Book> sortedBooks;
    	
        books.add(new Book("����� ������� ������� � ��������", "������ �������", "�������", 2021, "160", 13.55, "������ �������"));
        books.add(new Book("��� ����������� ������ � ��������� ������� �� �����", "���� �������", "�������", 2020, "352", 13.21, "������ �������"));
        books.add(new Book("����� � �������!", "�������� ����", "���", 2019, "384", 14.41, "������� ��������"));
        
        Shelf shelf = new Shelf(books);
        shelf.addBook(new Book("������� ����, ������ ����", "������ ��������", "�������", 2021, "352", 24.74, "������ �������"));
    
        int choice;
        
        while (true) {
        	
            menuText();
            choice = getIntFromConsol("");
            if (choice == 0)
                break;
            if (choice < 0 || choice > 3) {
                System.out.println("Incorrect choose!");
                continue;
            }
                      
            switch (choice) {
                case 1:
                	sortedBooks = ShelfLogic.sortByAuthor(getStringFromConsol("Author: "), shelf.getAllBooks());
                	ShelfShow.allBooks(sortedBooks);
                    break;           
                case 2:
                	sortedBooks = ShelfLogic.sortByPublisher(getStringFromConsol("Publisher: "), shelf.getAllBooks());
                	ShelfShow.allBooks(sortedBooks);
                    break;           
                case 3:
                	sortedBooks = ShelfLogic.sortByYear(getIntFromConsol("After a given year: "), shelf.getAllBooks());
                	ShelfShow.allBooks(sortedBooks);
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