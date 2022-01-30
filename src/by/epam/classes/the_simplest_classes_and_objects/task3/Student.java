/*
 * 3. 
 * Создайте класс с именем Student, содержащий поля: 
 * фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
 * Создайте массив из десяти элементов такого типа. 
 * Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
package by.epam.classes.the_simplest_classes_and_objects.task3;

public class Student {

	private String fio;
	private int groupNumber;
	private int[] academicPerformance = new int[5];

	public Student() {
		super();
	}

	public Student(String fio, int groupNumber, int[] academicPerformance) {
		super();
		this.fio = fio;
		this.groupNumber = groupNumber;
		this.academicPerformance = academicPerformance;
	}

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int[] getAcademicPerformance() {
		return academicPerformance;
	}

	public void setAcademicPerformance(int[] academicPerformance) {
		this.academicPerformance = academicPerformance;
	}

	@Override
	public String toString() {
		return fio + " №" + groupNumber;
	}

}
