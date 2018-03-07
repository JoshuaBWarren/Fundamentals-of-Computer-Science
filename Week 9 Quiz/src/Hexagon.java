import java.awt.Point;

/*
 * Joshua Warren
 * CS210
 * 3/06/2018
 * Chapter 8 Quiz
 */

public class Hexagon {
	
	private int x;
	private int y;
	private Point center;
	private double side;
	
	// Represents a 2-dimensional Hexagon.
	public Hexagon(int x, int y, Point center, double side) {
		if(side < 0) {
			throw new IllegalArgumentException();
		}
		
		this.x = x;
		this.y = y;
		this.center = center;
		this.side = side;
	}
	
	// Represents a 2-dimensional Hexagon whose top-left corner
	// is specified by a given Point center with a length side. 
	public Hexagon(Point center, double side) {
		this.center = new Point(0, 0);
		this.side = 0;
	}
	
	
	/*
	 * Getter method for field x.
	 * Get's the current value for x.
	 */
	public int getX() {
		return x;
	}

	/*
	 * Setter method for field x.
	 * Set's a value for the x.
	 */
	public void setX(int x) {
		this.x = x;
	}

	/*
	 * Getter method for field y.
	 * Get's the current value for y.
	 */
	public int getY() {
		return y;
	}

	/*
	 * Setter method for field y.
	 * Set's a value for the y.
	 */
	public void setY(int y) {
		this.y = y;
	}


	/*
	 * Getter method for field center.
	 * Get's the current value for center.
	 */
	public Point getCenter() {
		return center;
	}

	/*
	 * Setter method for field center.
	 * Set's a value for the center.
	 */
	public void setCenter(Point center) {
		this.center = center;
	}

	/*
	 * Getter method for field side.
	 * Get's the current value for side.
	 */
	public double getSide() {
		return side;
	}

	/*
	 * Setter method for field side.
	 * Set's a value for side.
	 */
	public void setSide(double side) {
		this.side = side;
	}
	
	/*
	 * Computes the area of a Hexagon.
	 */
	public double area() {
		return 3 * Math.sqrt(3) / 2 * Math.pow(side, 2);
	}
	
	/*
	 * Computes the perimeter of a Hexagon.
	 */
	public double perimeter() {
		return 6 * side;
	}

}
