import java.util.ArrayList;
import java.util.List;
/**
 * This class will store all the shapes that are going to be displayed and also the viewers.
 * if there is a change about to be made the model will return
 * a deep copy as requested by the client.
 * @author Hans Christian, Evan Lee
 *
 */
public class DrawingModel {

	// ArrayList for shapes
	private List<Shape> shapesList = new ArrayList<Shape>();
	// ArrayList for the views
	private List<DrawingView> views = new ArrayList<DrawingView>();

	public DrawingModel() {
	}

	// add new shapes to the model
	public void add(Shape shapes) {
		shapesList.add(shapes);
		notifyViewers();
	}

	// to notify viewers when something in the model changes
	public void notifyViewers() {
		for (DrawingView view : views) {
			view.notify(this);
		}
	}

	// returns the list of the shapes (deep copy)
	// by creating a new array list and loop through the current list and copy
	// the values into the new one
	public List<Shape> getShapes() {
		List<Shape> copyList = new ArrayList<Shape>();
		for (Shape s : shapesList) {
			copyList.add(s.copy());
		}
		return copyList;
	}

	public void addView(Viewer view) {
		views.add(view);
		view.notify(this);
	}

}
