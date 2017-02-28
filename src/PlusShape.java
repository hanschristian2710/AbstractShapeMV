import java.awt.Color;
import java.awt.Graphics;

public class PlusShape extends AbstractShape {

	public PlusShape(int x, int y, Color c, double size) {
		super(x, y, c, size);
	}

	public void draw(Graphics g) {
		g.fillRect((int) (x - WIDTH / 20 * size),
				(int) (y - HEIGHT / 2 * size), (int) (WIDTH / 10 * size),
				(int) (HEIGHT * size));
		g.fillRect((int) (x - WIDTH / 2 * size),
				(int) (y - HEIGHT / 20 * size), (int) (WIDTH * size),
				(int) (HEIGHT / 10 * size));
		g.setColor(c);

	}

	@Override
	public Shape copy() {
		PlusShape copy = new PlusShape(x, y, c, size);
		return copy;
	}

}
