import java.awt.Color;
import java.awt.Point;

public abstract class AbstractShape implements Shape {

	// This should be an abstract class that implements interface Shape. Add
	// instance variables, additional methods and default implementations here
	// once it becomes clear that all Shapes need to have such fields.
	
	// The middle point of the shape
	protected int x;
	protected int y;
	
	protected double size;
	protected Color c;
	final int WIDTH = 40, HEIGHT = 40;

	public AbstractShape(int x, int y, Color color, double size) {
		this.x = x;
		this.y = y;
		this.c = color;
		this.size = size;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point getPoint() {
		return new Point(x, y);
	}

	public void setPoint(Point p) {
		this.x = p.x;
		this.y = p.y;
	}

	public Color getColor() {
		return c;
	}

	public void setColor(Color color) {
		this.c = color;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

}
