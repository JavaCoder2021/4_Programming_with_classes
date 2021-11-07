/*
3. 
- Создайте класс с именем Student, содержащий поля: 
- фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
- Создайте массив из десяти элементов такого типа. 
- Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
*/

package by.epam.classes.the_simplest_classes_and_objects;

public class Student {
    
    public String fio;
    public int groupNumber;
    public int[] academicPerformance = new int[5];  
    
    public Student(String fio, int groupNumber, int[] academicPerformance)
    {
        this.fio = fio;
        this.groupNumber = groupNumber;
        this.academicPerformance = academicPerformance;
    }
    
}
