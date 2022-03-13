/*
 * 7.
 * Описать  класс,  представляющий  треугольник.  
 * Предусмотреть  методы  для  
 * - создания объектов,  
 * - вычисления площади, 
 * - периметра и 
 * - точки пересечения медиан.  
 */
package by.epam.classes.the_simplest_classes_and_objects.task7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Point a = new Point();
		Point b = new Point();
		Point c = new Point();

		System.out.println("Enter point A: ");
		a.setX(getDoubleFromConsol("X = "));
		a.setY(getDoubleFromConsol("Y = "));
		
		System.out.println("Enter point B: ");
		b.setX(getDoubleFromConsol("X = "));
		b.setY(getDoubleFromConsol("Y = "));
		
		System.out.println("Enter point C: ");
		c.setX(getDoubleFromConsol("X = "));
		c.setY(getDoubleFromConsol("Y = "));

		Triangle triangle = new Triangle(a, b, c);
		System.out.println(triangle);

		System.out.println("Square: " + triangle.square());

		System.out.println("Perimeter: " + triangle.perimeter());

		System.out.print("medianCrossing: ");
		System.out.println(triangle.medianCrossing());

	}

	public static double getDoubleFromConsol(String str) {

		double a;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print(str);
		while (!scanner.hasNextDouble()) {
			scanner.next();
			System.out.println("Invalid input!");
			System.out.print(str);
		}
		a = scanner.nextDouble();

		return a;

	}

}
