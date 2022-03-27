package by.epam.classes.the_simplest_classes_and_objects.task8;

import java.util.List;

public class CustomerView {
	
	public void print(List<Customer> customers) {

		for (Customer customer : customers)
			System.out.println(customer);

	}

	public void print(Customer customer) {

		System.out.println(customer);

	}

}
