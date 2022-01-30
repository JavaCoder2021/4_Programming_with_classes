/*
 * 1.  
 * Создайте  класс  Test1  двумя  переменными.  
 * Добавьте  метод  вывода  на  экран  и  методы  изменения  этих переменных. 
 * Добавьте метод,  который  находит  сумму  значений  этих  переменных,  
 * и  метод,  который  находит наибольшее значение из этих двух переменных. 
 */
package by.epam.classes.the_simplest_classes_and_objects.task1;

public class Test1 {

	private int a;
	private int b;

	public Test1() {
		super();
	}

	public Test1(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int sumAB() {
		return (a + b);
	}

	public int maxAB() {
		return (a >= b) ? a : b;
	}

}
