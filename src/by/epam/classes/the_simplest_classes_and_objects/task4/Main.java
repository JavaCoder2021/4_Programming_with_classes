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

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Train[] trains = new Train[5];

		trains[0] = new Train("Moscow", 1, "12:42");
		trains[1] = new Train("St. Petersburg", 2, "12:45");
		trains[2] = new Train("Minsk", 10, "23:08");
		trains[3] = new Train("St. Petersburg", 5, "12:42");
		trains[4] = new Train("Moscow", 7, "05:44");

		int choice;

		while (true) {

			menuText();
			choice = getIntFromConsol("");
			if (choice == 4)
				break;
			if (choice < 1 || choice > 4) {
				System.out.println("Incorrect choose!");
				continue;
			}

			switch (choice) {
			case 1:
				Arrays.sort(trains, new TrainLogic.ByNumberComparator());
				TrainShow.allTrains(trains);
				break;
			case 2:
				int trainNumber = (TrainLogic.trainTrue(getIntFromConsol("Number of train: "), trains));
				if (trainNumber > 0)
					TrainShow.oneTrain(trains[trainNumber]);
				else
					System.out.println("Wrong array element number selected");
				break;
			case 3:
				Arrays.sort(trains, new TrainLogic.ByDestinationAndTimeComparator());
				TrainShow.allTrains(trains);
				break;
			}

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
