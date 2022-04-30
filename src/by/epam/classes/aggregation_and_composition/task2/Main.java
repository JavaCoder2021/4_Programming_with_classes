/*
 * 2. 
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. 
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
package by.epam.classes.aggregation_and_composition.task2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Car car = new Car("Mersedes", 9.1, 40, 606, 75, 15, WheelType.Summer);
		int choice;

		while (true) {

			menuText();
			choice = getIntFromConsol("");

			if (choice < 0 || choice > 4) {
				System.out.println("Incorrect choose!");
				continue;
			}

			if (choice == 0)
				break;
			switch (choice) {
			case 1:
				System.out.printf("Car passed %.2f km. \n", car.move());
				break;
			case 2:
				car.addFuel(getDoubleFromConsol("Add fuel (L): "));
				System.out.printf("Fuel level: %.2f litres.\n", car.getFuelLevel());
				break;
			case 3:
				car.setWheelDiameter(getIntFromConsol("Wheel diameter: "));
				System.out.println("New wheel diameter: " + car.getWheelDiameter());
				break;
			case 4:
				System.out.println("Car brand: " + car.getBrand());
				break;
			}

		}

	}

	public static void menuText() { 
            System.out.print(
            	"\n" + 
            	"Select the menu item:\n" +
            	"0. Exit\n" +
            	"1. Go\n" +
            	"2. Refuel\n" +
            	"3. Change the wheel\n" +
            	"4. Display the brand of the car on the console\n" +                   
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
