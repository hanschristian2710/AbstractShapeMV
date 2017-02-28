import java.awt.Color;
import java.awt.Graphics;

public interface Shape {
	// The method will be implemented in the AbstractShape class which
	// will derived in the PlusShape and DiamondShape
	public void draw(Graphics g);

	// copy method to create deep copy
	public Shape copy();

	// other methods to be implemented in the concrete classes shapes
	public void setColor(Color c);

	public Color getColor();

	public void setX(int x);

	public int getX();

	public void setY(int y);

	public int getY();

	public void setSize(double size);

	public double getSize();

}
