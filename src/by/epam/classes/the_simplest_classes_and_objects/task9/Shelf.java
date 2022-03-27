package by.epam.classes.the_simplest_classes_and_objects.task9;

import java.util.*;

public class Shelf {

	private List<Book> books;
	
	{
		books = new LinkedList<Book>();
	}

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
		this.books.addAll(books);
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
		books.clear();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((books == null) ? 0 : books.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shelf other = (Shelf) obj;
		if (books == null) {
			if (other.books != null)
				return false;
		} else if (!books.equals(other.books))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [books=" + books + "]";
	}

}
