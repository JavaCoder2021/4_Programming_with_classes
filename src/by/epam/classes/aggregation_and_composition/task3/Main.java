/*
 * 3. 
 * Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.  
 */
package by.epam.classes.aggregation_and_composition.task3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		CountryView countryView = new CountryView();

		City gorodok = new City("Gorodok");
		City ezerische = new City("Ezerische");
		
		City brest = new City("Brest");
		City vitebsk = new City("Vitebsk");
		City gomel = new City("Gomel");
		City grodno = new City("Grodno");
		City minsk = new City("Minsk");
		City mogilev = new City("Mogilev");

		District gorodokskiy = new District("Gorodokskiy", gorodok);
		gorodokskiy.addCity(ezerische);
		
		Region brestskay = new Region("Brestskya", 32786, brest);
		Region vitebskya = new Region("Vitebskya", 40051, vitebsk);
		Region gomelskaya = new Region("Gomelskaya", 40372, gomel);
		Region grodnenskaya = new Region("Grodnenskaya", 25127, grodno);
		Region minskaya = new Region("Minskaya", 39854, minsk);
		Region mogilevskaya = new Region("Mogilevskaya", 29068, mogilev);

		Country country = new Country("Belarus", minsk);
		country.addRegion(brestskay);
		country.addRegion(vitebskya);
		country.addRegion(gomelskaya);
		country.addRegion(grodnenskaya);
		country.addRegion(minskaya);
		country.addRegion(mogilevskaya);
		
		int choice;

		while (true) {
			menuText();
			choice = getIntFromConsol("");
			if (choice == 0)
				break;
			if (choice < 0 || choice > 5) {
				System.out.println("Incorrect choose!");
				continue;
			}

			switch (choice) {
			case 1:
				countryView.printCapital(country);
				break;
			case 2:
				countryView.printNumberOfRegions(country);
				break;
			case 3:
				countryView.printAreaOfTheCountry(country);
				break;
			case 4:
				countryView.printRegionalCenters(country);
				break;
			}

		}

	}

	public static void menuText() {
       	    System.out.print(
	            "\n" + 
	            "0 - Exit\n" +
	            "1 - Display the capital\n" +
	            "2 - Number of regions\n" +
	            "3 - Area of the country\n" +
	            "4 - Regional centers\n" +                   
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
