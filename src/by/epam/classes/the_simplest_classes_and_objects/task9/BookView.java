package by.epam.classes.the_simplest_classes_and_objects.task9;

import java.util.List;

public class BookView {
	
	public void print(List<Book> books) {

		for (Book book : books)
			System.out.println(book);

	}

	public void print(Book book) {

		System.out.println(book);

	}

}
