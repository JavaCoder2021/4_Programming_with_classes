package javacoder2021;

import by.epam.classes.the_simplest_classes_and_objects.*;
import java.util.Scanner;
import java.util.Arrays;

public class JavaCoder2021 {

    public static void main(String[] args) {
              
        Train[] trains = new Train[5];
        
        trains[0] = new Train("Moscow",         1,  "12:42");
        trains[1] = new Train("St. Petersburg", 2,  "12:45");
        trains[2] = new Train("Minsk",          10, "23:08");
        trains[3] = new Train("St. Petersburg", 5,  "12:42");
        trains[4] = new Train("Moscow",         7,  "05:44");
        
        Scanner input = new Scanner(System.in);
        int choice;
        
        while (true) 
        {
            menuText();
            choice = input.nextInt();
            if (choice == 5)
                break;
            if (choice < 1 || choice > 5) 
            {
                System.out.println("Incorrect choose!");
                continue;
            }
            
            switchChoice(input, choice, trains);
            
        }
            
    }
    
    private static void switchChoice(Scanner input, int choice, Train[] trains)
    {
        switch (choice)
        {
            case 1:
                Arrays.sort(trains, new Train.ByNumberComparator());
                for (Train train : trains)
                    train.print();
                break;           
            case 2:
                System.out.print("Number of train: ");
                int trainNumber = input.nextInt();
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
    
    public static int TrainTrue(int nowTrainNumber, Train[] trains)
    {
        
        boolean trainTrue = false;
        
        for (int i = 0; i < trains.length; i++)
            if (nowTrainNumber == trains[i].getTrainNumber())
            {
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
            "Выберете пункт меню:" + "\n" +
            "1. Сортировка по номерам поездов" + "\n" +
            "2. Вывод информации о поезде по номеру" + "\n" +
            "3. Сортировка по пункту назначения" + "\n" +
            "4. Вывод всех поездов" + "\n" +
            "5. Выход" + "\n\n"
        );
        
    }
   
}
