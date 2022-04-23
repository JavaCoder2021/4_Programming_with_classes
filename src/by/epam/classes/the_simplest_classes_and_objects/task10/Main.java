/*
 * 10. 
 * Создать класс Airline, спецификация которого приведена ниже. 
 * Определить конструкторы, set- и get- методы и метод  toString(). 
 * Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль.  
 *  
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.  
 * Найти и вывести:  
 * a) список рейсов для заданного пункта назначения;  
 * b) список рейсов для заданного дня недели;  
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного. 
 */
package by.epam.classes.the_simplest_classes_and_objects.task10;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Airlines airlines = new Airlines();
		AirlineView airlineView = new AirlineView();
		AirlineLogic airlineLogic = new AirlineLogic();
		List<Airline> sortedAirlines;
		int choice;
		String destination, daysOfWeek;
		double departureTime;

		airlines.addAirline(new Airline(105, "Moscow", "Boing", "13.55", "Monday"));
		airlines.addAirline(new Airline(35, "Minsk", "Boing", "10.05", "Saturday"));
		airlines.addAirline(new Airline(125, "Kiev", "Boing", "09.20", "Sunday"));
		airlines.addAirline(new Airline(55, "Moscow", "Boing", "21.45", "Sunday"));
		airlines.addAirline(new Airline(45, "Minsk", "Boing", "19.15", "Wednesday"));

		while (true) {

			menuText();
			choice = getIntFromConsol("");

			if (choice < 0 || choice > 3) {
				System.out.println("Incorrect choose!");
				continue;
			}

			if (choice == 0)
				break;
			switch (choice) {
			case 1:
		        	destination = getStringFromConsol("Destination: ");
		        	sortedAirlines = airlineLogic.sortByDestination(airlines.getAirlines(), destination);
		        	airlineView.print(sortedAirlines);
				break;
			case 2:
		        	daysOfWeek = getStringFromConsol("Day of week: ");
		        	sortedAirlines = airlineLogic.sortByDaysOfWeek(airlines.getAirlines(), daysOfWeek);
		        	airlineView.print(sortedAirlines);
				break;
			case 3:
		        	daysOfWeek = getStringFromConsol("Day of week: ");
		        	departureTime = getDoubleFromConsol("Departure time: ");
		       		sortedAirlines = airlineLogic.sortByDepartureTime(airlines.getAirlines(), daysOfWeek, departureTime);
		        	airlineView.print(sortedAirlines);
				break;
			}

		}

	}

	public static void menuText() {
		
        System.out.print(
            "\n" + 
            "Select the menu item:\n" +
            "0. Exit\n" +
            "1. List of flights for a given destination\n" +
            "2. List of flights for a given day of the week\n" +
            "3. List of flights for a given day of the week, the departure time for which is longer than the specified one\n" +
            "\n"
        );
        
    }

	public static String getStringFromConsol(String str) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print(str);
		String line = scanner.nextLine();

		return line;

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
	
	public static double getDoubleFromConsol(String str) {

		double a;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print(str);
		while (!scanner.hasNextDouble()) {
			scanner.nextLine();
			System.out.print(str);
		}
		a = scanner.nextDouble();

		return a;

	}

}
