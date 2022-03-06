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

public class Book {

	private static int ID = 0;
	private int id, yearOfPublication;
	private double price;
	private String title, author, publisher, numberOfPages, typeOfBinding;

	public Book() {
		super();
	}

	public Book(String title, String author, String publisher, int yearOfPublication, String numberOfPages,
			double price, String typeOfBinding) {
		super();
		id = ID++;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.yearOfPublication = yearOfPublication;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.typeOfBinding = typeOfBinding;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public String getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(String numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTypeOfBinding() {
		return typeOfBinding;
	}

	public void setTypeOfBinding(String typeOfBinding) {
		this.typeOfBinding = typeOfBinding;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [id=" + id + ", yearOfPublication=" + yearOfPublication + ", price="
				+ price + "$, title=" + title + ", author=" + author + ", publisher=" + publisher + ", numberOfPages="
				+ numberOfPages + ", typeOfBinding=" + typeOfBinding + "]";
	}

}