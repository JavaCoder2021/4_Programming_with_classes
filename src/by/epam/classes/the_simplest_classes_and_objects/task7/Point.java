package by.epam.classes.the_simplest_classes_and_objects.task7;

public class Point {
    
    private double x, y;
    
    public Point() {
		super();
	}     
    
    public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    @Override
	public String toString() {
		return getClass().getSimpleName() + " [x=" + x + ", y=" + y + "]";
	}
    
}
