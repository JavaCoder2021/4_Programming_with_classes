/*
 * 5. 
 * Туристические путевки. 
 * Сформировать набор предложений клиенту по выбору туристической путевки различного типа 
 * (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. 
 * Учитывать возможность выбора транспорта, питания и числа дней. 
 * Реализовать выбор и сортировку путевок.
 */
package by.epam.classes.aggregation_and_composition.task5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		TourAgency tourAgency = new TourAgency();
		TourAgencyLogic tourAgencyLogic = new TourAgencyLogic();
		TourAgencyView tourAgencyView = new TourAgencyView();

		Client petya = new Client("Petya", 59, "+37529 357-32-59");
		Client ivan = new Client("Ivan", 18, "+37529 218-45-14");

		tourAgency.addTour(new Tour(TourType.CRUISE, TourTransport.SHIP, true, 14, 1000));
		tourAgency.addTour(new Tour(TourType.TREATMENT, TourTransport.TRAIN, true, 10, 500));
		tourAgency.addTour(new Tour(TourType.EXCURSION, TourTransport.BUS, false, 5, 350));
		tourAgency.addTour(new Tour(TourType.SHOPPING, TourTransport.BUS, false, 3, 200));
		tourAgency.addTour(new Tour(TourType.RECREATION, TourTransport.AIRPLANE, true, 10, 1200));

		int choice;

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
				tourAgencyLogic.sortToursByCost(tourAgency);
				tourAgencyView.printTours(tourAgency.getTours());
				break;
			case 2:
				tourAgencyLogic.sortToursByDays(tourAgency);
				tourAgencyView.printTours(tourAgency.getTours());
				break;
			case 3:
				System.out.println("Tours for " + petya + ":");
				tourAgencyView.printTours(tourAgencyLogic.pickUpTours(TourTransport.TRAIN, true, 7, 14, 300, 600, tourAgency));
				System.out.println();
				System.out.println("Tours for " + ivan + ":");
				tourAgencyView.printTours(tourAgencyLogic.pickUpTours(TourTransport.SHIP, true, 7, 14, 800, 1500, tourAgency));
				break;
			}

		}

	}

	public static void menuText() {
          System.out.print(
	            "\n" + 
	            "0 - Exit\n" + 
	            "1 - View all tours by cost\n" +   
	            "2 - View all tours by days\n" + 
	            "3 - View all tours for client\n" + 
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
