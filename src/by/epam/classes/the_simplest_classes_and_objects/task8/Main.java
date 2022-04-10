/*
 * 8. 
 * Создать класс Customer, спецификация которого приведена ниже. 
 * Определить конструкторы, set- и get- методы и метод  toString(). 
 * Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль.  
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.  
 * Найти и вывести:  
 * a) список покупателей в алфавитном порядке;  
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
package by.epam.classes.the_simplest_classes_and_objects.task8;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		int choice;
    	List<Customer> sortedCustomers;
		Customers customers = new Customers();
		CustomerView customerView = new CustomerView();
		CustomerLogic customerLogic = new CustomerLogic();
		
		customers.addCustomer(new Customer("Ivanov", "Ivan", "Ivanovich", "Moscow", 123456));
		customers.addCustomer(new Customer("Sidorov", "Sidr", "Sidorovich", "Minsk", 654321));
		customers.addCustomer(new Customer("Petrov", "Petr", "Petrovich", "Saint Petersburg", 333333));

		while (true) {
			menuText();
			choice = getIntFromConsol("");
			if (choice < 0 || choice > 2) {
				System.out.println("Incorrect choose!");
				continue;
			}

			if (choice == 0)
				break;
			switch (choice) {
			case 1:
				customerLogic.sortByName(customers.getCustomers());
				customerView.print(customers.getCustomers());
				break;
			case 2:
				System.out.println("Enter your credit card range\n");
				int from = getIntFromConsol("From: ");
				int to = getIntFromConsol("To: ");
				sortedCustomers = customerLogic.sortByCreditCardNumber(from, to, customers.getCustomers());
				customerView.print(sortedCustomers);
				break;
			}

		}

	}
	
    public static void menuText() { 
        System.out.print(
            "\n" + 
            "Select the menu item:\n" +
            "0. Exit\n" +
            "1. Display of customers in alphabetical order\n" +
            "2. Display of customers with a credit card in the interval\n" +
            "\n"
        );   
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
