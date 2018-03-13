import java.awt.Point;

/*
 * Joshua Warren
 * CS210
 * 3/06/2018
 * Chapter 8 Quiz
 */

public class Hexagon {
	 // FIELDS
	 private Point center; // required to be center of the hexagon
	 private double side; // the length of one side (all six are same)

	// CONSTRUCTORS
	 public Hexagon() {
	   this(new Point(0,0),0);
	 }

	 public Hexagon(Point c, double s) {
	   center = c;
	   side = s;
	 }

	// ACCESSORS (getters)
	 public Point getCenter() {
	   return center;
	 }
	 
	 public double getSide() {
	   return side;
	 }

	// MODIFIERS (mutators)
	 public void setCenter(Point c) {
	   center = c;
	 }

	 public void setSide(double r) {
	   side = r;
	 }

	 

	 public double area() { // returns area (Google has formula)
	   return 1.5*Math.sqrt(3)*Math.pow(side, 2) * 100. / 100;
	 }

	 public double perimeter() {
	 // return perimeter (very simple math)
	   return 6.*side;
	 }
	}
