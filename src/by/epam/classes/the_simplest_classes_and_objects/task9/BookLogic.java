package by.epam.classes.the_simplest_classes_and_objects.task9;

import java.util.LinkedList;
import java.util.List;

public class BookLogic {
	
	public List<Book> sortByAuthor(String author, List<Book> books) {
		
		List<Book> sortedBooks = new LinkedList();

		for (Book book : books)
			if (author.toLowerCase().equals(book.getAuthor().toLowerCase()))
				sortedBooks.add(book);

		return sortedBooks;

	}

	public List<Book> sortByPublisher(String publisher, List<Book> books) {

		List<Book> sortedBooks = new LinkedList();

		for (Book book : books)
			if (publisher.toLowerCase().equals(book.getPublisher().toLowerCase()))
				sortedBooks.add(book);

		return sortedBooks;

	}

	public List<Book> sortByYear(int year, List<Book> books) {

		List<Book> sortedBooks = new LinkedList();

		for (Book book : books)
			if (book.getYearOfPublication() > year)
				sortedBooks.add(book);

		return sortedBooks;

	}

}
