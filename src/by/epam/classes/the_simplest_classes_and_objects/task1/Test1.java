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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test1 other = (Test1) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [a=" + a + ", b=" + b + "]";
	}

}
