
public class Point {
	// encapsulation - only Point objects can access their own fields directly
	private int x;    // EACH Point object should have a variable
	private int y;    // inside it named x, and a variable named y
	
	// Initializes the state of a new Point object at the given x/y location.
	// 1) run when client says 'new'
	// 2) initializes the state of the object being created
	public Point(int initialX, int initialY) {
		x = initialX;
		y = initialY;
	}
	
	// Initializes the state of a new Point object at the origin (0, 0).
	public Point() {
		x = 0;
		y = 0;
	}
	
	// Returns the point's x-coordinate.
	// Provides a read-only access to the point's state.
	public int getX() {
		return x;
	}
	
	// Returns the point's y-coordinate.
	public int getY() {
		return y;
	}
	
	// Shifts the point's x/y coordinates by the given amounts.
	public void translate(int dx, int dy) {
		x += dx;
		y += dy;    // or, setLocation(x + dx, y + dy);
	}
	
	// Sets the point's x/y coordinates to be the given values.
	public void setLocation(int newX, int newY) {
		x = newX;
		y = newY;
	}
	
	// Computes the distance between this point and the given other point p2.
	public double distance(Point p2) {
		int dx = x - p2.x;
		int dy = y - p2.y;
		double distance = Math.sqrt(dx*dx + dy*dy);
		return distance;
	}
	
	// Computes the distance between this point and the origin (0, 0).
	public double distanceFromOrigin() {
		Point origin = new Point();  // 0, 0
		return distance(origin);
	}
	
	// Returns a string representation of the point, such as "(5, -2)".
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
