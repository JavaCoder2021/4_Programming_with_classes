/*
 * 3. 
 * - Создайте класс с именем Student, содержащий поля: 
 * - фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
 * - Создайте массив из десяти элементов такого типа. 
 * - Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
package by.epam.classes.the_simplest_classes_and_objects.task3;

import java.util.Arrays;

public class Student {
    
    private String fio;
    private int groupNumber;
    private int[] academicPerformance = new int[5];  
    
    public Student(String fio, int groupNumber, int[] academicPerformance) {
        this.fio = fio;
        this.groupNumber = groupNumber;
        this.academicPerformance = academicPerformance;
    }
    
    public boolean isGood() {
        boolean bestSt;
        bestSt = true;
        for (int i : academicPerformance) {
            if (i < 9) bestSt = false;
        }  
        return bestSt;
    }
    
    @Override
    public String toString() {
        return fio + " №" + groupNumber;
    }
    
}
