package by.epam.classes.the_simplest_classes_and_objects.task9;

import java.util.List;

public class ShelfShow {

	public static void allBooks(List<Book> books) {

		for (Book book : books)
			System.out.println(book);

	}

	public static void oneBook(Book book) {

		System.out.println(book);

	}

}