/*
9. 
Создать класс Book, спецификация которого приведена ниже. 
Определить конструкторы, set- и get- методы и метод toString(). 
Создать  второй  класс,  агрегирующий  массив  типа  Book,  с  подходящими  конструкторами  и 
методами. 
Задать критерии выбора данных и вывести эти данные на консоль.  
 
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.  
Найти и вывести:  
a) список книг заданного автора;  
b) список книг, выпущенных заданным издательством;  
c) список книг, выпущенных после заданного года. 
*/

package by.epam.classes.the_simplest_classes_and_objects;

public class Book {
    
    private static int ID = 0;
    private int id, yearOfPublication;
    private double price;
    private String title, author, publisher, numberOfPages, typeOfBinding;
    
    public Book(String title, String author, String publisher, int yearOfPublication, 
            String numberOfPages, double price, String typeOfBinding)
    {
        id = ID++;
        this.title              = title;
        this.author             = author;
        this.publisher          = publisher;
        this.yearOfPublication  = yearOfPublication;
        this.numberOfPages      = numberOfPages;
        this.price              = price;
        this.typeOfBinding      = typeOfBinding;
    }
    
    public void setTitle(String title) 
    {
        this.title = title;
    }    
    
    public void setAuthor(String author) 
    {
        this.author = author;
    }  
    
    public void setPublisher(String publisher) 
    {
        this.publisher = publisher;
    }
    
    public void setYearOfPublication(int yearOfPublication) 
    {
        this.yearOfPublication = yearOfPublication;
    }
    
    public void setNumberOfPages(String numberOfPages)
    {
        this.numberOfPages = numberOfPages;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    
    public void setTypeOfBinding(String typeOfBinding)
    {
        this.typeOfBinding = typeOfBinding;
    }
    
    public int getId() 
    {
        return id;
    }
    
    public String getTitle() 
    {
        return title;
    }
    
    public String getAuthor() 
    {
        return author;
    }
    
    public String getPublisher() 
    {
        return publisher;
    }
 
    public int getYearOfPublication() 
    {
        return yearOfPublication;
    }
 
    public String getNumberOfPages() 
    {
        return numberOfPages;
    }    
    
    public double getPrice()
    {
        return price;
    }
       
    public String getTypeOfBinding()
    {
        return typeOfBinding;
    }
    
    @Override
    public String toString()
    {
        return id + " - " + title + " - " + author + " - " + publisher + " - " + yearOfPublication 
                + " year - " + numberOfPages + "  Price: " + price + "$ - " + typeOfBinding;
    }
    
    public void print() 
    {
        System.out.println(toString());
    }    
    
}
