/*
 * 4.  
 * Создайте  класс  Train,  содержащий  поля:  название  пункта  назначения,  номер  поезда,  время  отправления. 
 * Создайте данные в массив из пяти элементов типа Train, 
 * добавьте возможность сортировки элементов массива по номерам поездов. 
 * Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
 * Добавьте  возможность  сортировки  массив  по  пункту  назначения,  причем  поезда  с  одинаковыми  пунктами 
 * назначения должны быть упорядочены по времени отправления. 
 */
package by.epam.classes.the_simplest_classes_and_objects.task4;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		int choice;
		Depo depo = new Depo();
		TrainLogic trainLogic = new TrainLogic();
		TrainView trainView = new TrainView();

		depo.addTrain(new Train("Moscow", 1, "12:42"));
		depo.addTrain(new Train("St. Petersburg", 2, "12:45"));		
		depo.addTrain(new Train("Minsk", 10, "23:08"));		
		depo.addTrain(new Train("St. Petersburg", 5, "12:42"));		
		depo.addTrain(new Train("Moscow", 7, "05:44"));

		while (true) {

			menuText();
			choice = getIntFromConsol("");
			if (choice < 1 || choice > 4) {
				System.out.println("Incorrect choose!");
				continue;
			}

			switch (choice) {
			case 1:
				Collections.sort(depo.getAllTrains(), trainLogic.new ByNumberComparator());
				trainView.print(depo.getAllTrains());
				break;
			case 2:
				Train train = trainLogic.findByNumber(getIntFromConsol("Number of train: "), depo.getAllTrains());
				if (train != null)
					trainView.print(train);
				else
					System.out.println("Wrong array element number selected");
				break;
			case 3:
				Collections.sort(depo.getAllTrains(), trainLogic.new ByDestinationAndTimeComparator());
				trainView.print(depo.getAllTrains());
				break;
			}
			if (choice == 4)
				break;

		}

	}

	public static void menuText() {
        
        System.out.print(
            "\n" + 
            "Select the menu item:" + "\n" +
            "1. Sorting by train numbers" + "\n" +
            "2. Displaying information about the train by number" + "\n" +
            "3. Sort by destination" + "\n" +
            "4. Exit" + "\n\n"
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
