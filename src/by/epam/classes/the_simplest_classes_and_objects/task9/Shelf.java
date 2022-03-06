package by.epam.classes.the_simplest_classes_and_objects.task9;

import java.util.*;

public class Shelf {

	private List<Book> books = new LinkedList();

	public Shelf() {
		super();
	}

	public Shelf(List<Book> books) {
		super();
		this.books = books;
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public void addBooks(List<Book> books) {
		books.addAll(books);
	}

	public Book getOneBook(int number) {
		return books.get(number);
	}

	public List<Book> getAllBooks() {
		return books;
	}

	public void removeOneBook(Book book) {
		books.remove(book);
	}

	public void removeAllBooks() {
		books.removeAll(books);
	}

}