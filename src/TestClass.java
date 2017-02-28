import static org.junit.Assert.assertFalse;

import java.awt.Color;

/**
 * The test class to confirm if the copy method really return a deep copy
 * 
 * @author Hans Christian, Evan Lee
 *
 */
public class TestClass {

	@org.junit.Test
	public void testDiamond() {
		DiamondShape d = new DiamondShape(5, 5, Color.red, 0.7);
		DrawingModel m = new DrawingModel();
		m.add(d);
		Shape copy1 = m.getShapes().get(0);
		copy1.setColor(Color.BLACK);
		copy1.setX(6);
		copy1.setY(6);
		copy1.setSize(0.4);
		Shape copy2 = m.getShapes().get(0);
		assertFalse(copy1.getColor().equals(copy2.getColor()));
		assertFalse(copy1.getX() == copy2.getX());
		assertFalse(copy1.getY() == copy2.getY());
		assertFalse(copy1.getSize() == copy2.getSize());
	}

	@org.junit.Test
	public void testPlus() {
		PlusShape p = new PlusShape(5, 5, Color.red, 0.7);
		DrawingModel m = new DrawingModel();
		m.add(p);
		Shape copy1 = m.getShapes().get(0);
		copy1.setColor(Color.BLACK);
		copy1.setX(6);
		copy1.setY(6);
		copy1.setSize(0.4);
		Shape copy2 = m.getShapes().get(0);
		assertFalse(copy1.getColor().equals(copy2.getColor()));
		assertFalse(copy1.getX() == copy2.getX());
		assertFalse(copy1.getY() == copy2.getY());
		assertFalse(copy1.getSize() == copy2.getSize());
	}

}
