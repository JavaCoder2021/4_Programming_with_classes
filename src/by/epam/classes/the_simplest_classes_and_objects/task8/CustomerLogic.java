package by.epam.classes.the_simplest_classes_and_objects.task8;

import java.util.*;

public class CustomerLogic {

	public class SortByName implements Comparator<Customer> {	

		@Override
		public int compare(Customer left, Customer right) {
			if (left.getSurname() != right.getSurname())
				return left.getSurname().compareTo(right.getSurname());
			if (left.getName() != right.getName())
				return left.getName().compareTo(right.getName());
			return left.getPatronymic().compareTo(right.getPatronymic());
		}

	}

	public List<Customer> sortByCreditCardNumber(int from, int to, List<Customer> customers) {

		List<Customer> sortedCustomers = new LinkedList<Customer>();

		for (Customer nowCustomer : customers) {
			if (nowCustomer.getCreditCardNumber() >= from
					&& nowCustomer.getCreditCardNumber() <= to)
				sortedCustomers.add(nowCustomer);
		}

		return sortedCustomers;

	}

}
