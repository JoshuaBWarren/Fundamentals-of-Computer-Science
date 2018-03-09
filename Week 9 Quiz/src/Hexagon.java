import java.awt.Point;

/*
 * Joshua Warren
 * CS210
 * 3/06/2018
 * Chapter 8 Quiz
 */

public class Hexagon {
	

	private Point center;
	private double side;
	
	// Represents a 2-dimensional Hexagon.
	public Hexagon(Point center, double side) {
		if(side < 0) {
			throw new IllegalArgumentException();
		}
		
		this.center = center;
		this.side = side;
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
