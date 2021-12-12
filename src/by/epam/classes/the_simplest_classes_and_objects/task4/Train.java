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

import java.util.Comparator;

public class Train {
    
    private String destination;
    private int trainNumber;
    private String departureTime;
    
    public Train(String destination, int trainNumber, String departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }
    
    public static class ByNumberComparator implements Comparator < Train > {
        @Override
        public int compare(Train left, Train right) {
            return left.trainNumber - right.trainNumber;
        }
    }
    
    public static class ByDestinationAndTimeComparator implements Comparator < Train > {
        @Override
        public int compare(Train left, Train right) {
            if (left.destination == right.destination)
                return left.departureTime.compareTo(right.departureTime);
                return left.destination.compareTo(right.destination);
        }
    }
    
    public int getTrainNumber() {
        return trainNumber;
    }
    
    public void print() {
        System.out.println(trainNumber + " -> " + destination + " : " + departureTime);
    }
    
}
