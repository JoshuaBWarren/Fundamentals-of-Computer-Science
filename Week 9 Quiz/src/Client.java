import java.awt.Point;

public class Client {

	public static void main(String[] args) {
		
		Hexagon h1 = new Hexagon(new Point(82,92),10);
		h1.setSide(50);
		
		System.out.println(h1.area()); // returns 6495.19
		System.out.println(h1.perimeter()); // returns 300.0
	}
}
