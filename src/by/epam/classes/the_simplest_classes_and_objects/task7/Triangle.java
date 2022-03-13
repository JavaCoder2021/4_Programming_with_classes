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

public class Triangle {

	private Point a, b, c;

	public Triangle() {
		super();
	}

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double distance(Point a, Point b) {
		double dx = a.getX() - b.getX();
		double dy = a.getY() - b.getY();

		return Math.sqrt(dx * dx + dy * dy);
	}

	public double square() {
		double ab = distance(a, b);
		double bc = distance(b, c);
		double ac = distance(a, c);

		double p = (ab + bc + ac) / 2;

		return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
	}

	public double perimeter() {
		double ab = distance(a, b);
		double bc = distance(b, c);
		double ac = distance(a, c);

		return ab + bc + ac;
	}

	public Point medianCrossing() {
		return new Point((a.getX() + b.getX() + c.getX()) / 3, (a.getY() + b.getY() + c.getY()) / 3);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
