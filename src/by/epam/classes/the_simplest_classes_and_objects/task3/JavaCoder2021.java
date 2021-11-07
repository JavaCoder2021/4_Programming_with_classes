package javacoder2021;

import by.epam.classes.the_simplest_classes_and_objects.*;

public class JavaCoder2021 {

    public static void main(String[] args) {
        
        Student[] students = new Student[10];
        
        students[0] = new Student("Ivanov I.I.", 1, new int[] {5, 6, 7, 3, 9});
        students[1] = new Student("Petrov P.P.", 1, new int[] {9, 10, 9, 9, 9});
        students[2] = new Student("Sidorov S.S.", 1, new int[] {8, 6, 7, 3, 10});
        students[3] = new Student("Koslov K.K.", 2, new int[] {5, 10, 7, 6, 9});
        students[4] = new Student("Sergeev S.S.", 2, new int[] {9, 10, 9, 9, 9});
        students[5] = new Student("Vasilyev V.V.", 2, new int[] {8, 6, 7, 7, 10});
        students[6] = new Student("Kolosov K.K.", 3, new int[] {9, 10, 9, 9, 9});
        students[7] = new Student("Komlev K.K.", 2, new int[] {9, 10, 9, 9, 10});
        students[8] = new Student("Kurchaviy K.K.", 2, new int[] {8, 8, 7, 7, 10});
        students[9] = new Student("Pleshko P.P.", 3, new int[] {9, 10, 9, 9, 10}); 
        
        System.out.println("All students:");
        showAllStudents(students);
        
        System.out.println("--------------------------");
               
        System.out.println("Best students:");
        showBestStudents(students);   
        
    }
    
    public static void showAllStudents(Student[] students)
    {
        for (Student student : students)
            student.print();
    }
    
    public static void showBestStudents(Student[] students)
    {
        for (Student student : students)
            if (student.isGood())
                student.print();
    }
    
}
