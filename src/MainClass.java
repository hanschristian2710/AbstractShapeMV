import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;

public class MainClass {
	private static final int NUMBER_OF_DIAMOND = 30;
	private static final int NUMBER_OF_PLUS = 25;

	public static void main(String[] args) {

		// creating JFrame
		JFrame frame = new JFrame("Shapes Drawing");
		Viewer view = new Viewer();
		frame.getContentPane().add(view).setBackground(Color.BLACK);
		frame.getContentPane().add(view);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.validate();
		frame.setVisible(true);

		// create the drawing model
		DrawingModel model = new DrawingModel();
		Random rand = new Random();

		// diamonds
		for (int i = 0; i < NUMBER_OF_DIAMOND; i++) {

			// random diamond size
			double size = 0.5 + rand.nextDouble(); // between 0.5 and 1.5

			// random coordinates
			int x = (int) (size * 20)
					+ rand.nextInt(frame.getWidth() + 1
							- (int) ((1 + size) * 40));
			int y = (int) (size * 20)
					+ rand.nextInt(frame.getHeight() + 1
							- (int) ((1 + size) * 40));

			// random colors for diamonds
			int red = (int) (Math.random() * 256);
			int green = (int) (Math.random() * 256);
			int blue = (int) (Math.random() * 256);
			Color diamondsColor = new Color(red, green, blue);

			// add the diamond display
			model.add(new DiamondShape(x, y, diamondsColor, size));

		}
		// pluses
		for (int i = 0; i < NUMBER_OF_PLUS; i++) {

			// random diamond size
			double size = 0.5 + rand.nextDouble();

			// random coordinates
			int x = (int) (size * 20)
					+ rand.nextInt(frame.getWidth() + 1
							- (int) ((1 + size) * 40));
			int y = (int) (size * 20)
					+ rand.nextInt(frame.getHeight() + 1
							- (int) ((1 + size) * 40));

			// random colors for pluses
			int red = (int) (Math.random() * 256);
			int green = (int) (Math.random() * 256);
			int blue = (int) (Math.random() * 256);
			Color plusesColor = new Color(red, green, blue);

			// add the plus display
			model.add(new PlusShape(x, y, plusesColor, size));
		}

		model.addView(view);

	}
}
