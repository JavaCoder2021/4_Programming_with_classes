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

	private double distance(Point a, Point b) {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		result = prime * result + ((c == null) ? 0 : c.hashCode());
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
		Triangle other = (Triangle) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		if (c == null) {
			if (other.c != null)
				return false;
		} else if (!c.equals(other.c))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
