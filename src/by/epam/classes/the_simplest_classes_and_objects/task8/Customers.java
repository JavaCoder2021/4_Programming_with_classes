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

import java.util.LinkedList;
import java.util.List;

public class Customers {

	private List<Customer> customers;

	{
		customers = new LinkedList<Customer>();
	}

	public Customers() {
		super();
	}

	public Customers(List<Customer> customers) {
		super();
		this.customers = customers;
	}

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	public void addCustomers(List<Customer> customers) {
		this.customers.addAll(customers);
	}

	public Customer getCustomer(int number) {
		return customers.get(number);
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void removeCustomer(Customer customer) {
		customers.remove(customer);
	}

	public void removeCustomers() {
		customers.clear();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customers == null) ? 0 : customers.hashCode());
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
		Customers other = (Customers) obj;
		if (customers == null) {
			if (other.customers != null)
				return false;
		} else if (!customers.equals(other.customers))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [customers=" + customers + "]";
	}

}
