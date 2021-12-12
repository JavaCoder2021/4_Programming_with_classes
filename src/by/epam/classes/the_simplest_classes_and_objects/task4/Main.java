/*
 * 4.  
 * - Создайте  класс  Train,  содержащий  поля:  название  пункта  назначения,  номер  поезда,  время  отправления. 
 * - Создайте данные в массив из пяти элементов типа Train, 
 * добавьте возможность сортировки элементов массива по номерам поездов. 
 * - Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
 * - Добавьте  возможность  сортировки  массив  по  пункту  назначения,  причем  поезда  с  одинаковыми  пунктами 
 * назначения должны быть упорядочены по времени отправления. 
 */
package by.epam.classes.the_simplest_classes_and_objects.task4;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
   public static void main(String[] args) {
              
        Train[] trains = new Train[5];
        
        trains[0] = new Train("Moscow",         1,  "12:42");
        trains[1] = new Train("St. Petersburg", 2,  "12:45");
        trains[2] = new Train("Minsk",          10, "23:08");
        trains[3] = new Train("St. Petersburg", 5,  "12:42");
        trains[4] = new Train("Moscow",         7,  "05:44");
        
        int choice;
        
        while (true) {
            menuText();
            choice = scannerInt();
            if (choice == 5)
                break;
            if (choice < 1 || choice > 5) {
                System.out.println("Incorrect choose!");
                continue;
            }
            
            switch (choice) {
                case 1:
                    Arrays.sort(trains, new Train.ByNumberComparator());
                    for (Train train : trains)
                        train.print();
                    break;           
                case 2:
                    System.out.print("Number of train: ");
                    int trainNumber = scannerInt();
                    if (TrainTrue(trainNumber, trains) >= 0)
                        trains[TrainTrue(trainNumber, trains)].print();
                    else
                        System.out.println("Wrong array element number selected");
                    break;           
                case 3:
                    Arrays.sort(trains, new Train.ByDestinationAndTimeComparator());
                    for (Train train : trains)
                        train.print();
                    break;      
                case 4:
                    for (Train train : trains)
                        train.print();
                    break;         
            }  
            
        }
            
    }
   
    private static int scannerInt() {
        
        Scanner input = new Scanner(System.in);
        int num = -1;
        
        do {
            if (input.hasNextInt()) {
                num = input.nextInt();
            } 
            else {
                input.next();
            }
        } while (num <= 0);

        return num;
        
    }
    
    public static int TrainTrue(int nowTrainNumber, Train[] trains) {
        
        boolean trainTrue = false;
        
        for (int i = 0; i < trains.length; i++)
            if (nowTrainNumber == trains[i].getTrainNumber()) {
                trainTrue = true;
                nowTrainNumber = i;
                break;
            }
        
        if (trainTrue) 
            return nowTrainNumber;
        else
            return -1;

    }
        
    private static void menuText() {
        
        System.out.print(
            "\n" + 
            "Select the menu item:" + "\n" +
            "1. Sorting by train numbers" + "\n" +
            "2. Displaying information about the train by number" + "\n" +
            "3. Sort by destination" + "\n" +
            "4. Output of all trains" + "\n" +
            "5. Exit" + "\n\n"
        );
        
    }
    
}
