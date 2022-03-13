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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + id;
		result = prime * result + ((numberOfPages == null) ? 0 : numberOfPages.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((typeOfBinding == null) ? 0 : typeOfBinding.hashCode());
		result = prime * result + yearOfPublication;
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
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (id != other.id)
			return false;
		if (numberOfPages == null) {
			if (other.numberOfPages != null)
				return false;
		} else if (!numberOfPages.equals(other.numberOfPages))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (typeOfBinding == null) {
			if (other.typeOfBinding != null)
				return false;
		} else if (!typeOfBinding.equals(other.typeOfBinding))
			return false;
		if (yearOfPublication != other.yearOfPublication)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [id=" + id + ", yearOfPublication=" + yearOfPublication + ", price="
				+ price + "$, title=" + title + ", author=" + author + ", publisher=" + publisher + ", numberOfPages="
				+ numberOfPages + ", typeOfBinding=" + typeOfBinding + "]";
	}

}
