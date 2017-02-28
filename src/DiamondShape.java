import java.awt.Color;
import java.awt.Graphics;

public class DiamondShape extends AbstractShape {

	public DiamondShape(int x, int y, Color c, double size) {
		super(x, y, c, size);
	}

	public void draw(Graphics g) {
		int[] xArray = { x, (int) (x - WIDTH / 2 * size), x,
				(int) (x + WIDTH / 2 * size) };
		int[] yArray = { (int) (y - HEIGHT / 2 * size), y,
				(int) (y + HEIGHT / 2 * size), y };
		g.setColor(c);
		g.fillPolygon(xArray, yArray, 4);
	}

	@Override
	public Shape copy() {
		DiamondShape copy = new DiamondShape(x, y, c, size);
		return copy;
	}

}
