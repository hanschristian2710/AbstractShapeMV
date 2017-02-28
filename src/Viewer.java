import java.awt.Graphics;
import java.util.List;

import javax.swing.JPanel;

public class Viewer extends JPanel implements DrawingView {

	// instance variables
	private DrawingModel model = null; // initialize to null until it is
										// notified

	public void notify(DrawingModel d) {
		model = d;
		repaint();

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (model == null) {
			return;
		} else {
			List<Shape> shapes = model.getShapes();
			for (Shape s : shapes) {
				s.draw(g);
			}
		}
	}

}
