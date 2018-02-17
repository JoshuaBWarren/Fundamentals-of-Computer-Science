import java.awt.Color;
import java.awt.Graphics;

/*
 * Joshua Warren, CS-210, 2/15/2018
 */

/*
 * I can honestly say I have no idea.  I know width is going to be related
 * to the last two variables of the draw functions, but I can't logic out
 * in my head where/how to put them.
 */

public class MickeyBoxMany {
	
	public static final int N = 2; // how many
	 
	 // required main method
	 public static void main(String[] args) {
		 
	   int sizeX = 800; // width
	   int sizeY = sizeX / N; // scale height
	   
	   DrawingPanel panel = new DrawingPanel(sizeX, sizeY);
	   panel.setBackground(Color.YELLOW); // as in text
	   
	   Graphics g = panel.getGraphics(); // Oracle Graphics
	   
	   int width = sizeX / N; // divides up the width
	   for (int i=0; i < N; i++) {
	       int x = i * width; // shift each box over
	       int y = sizeX / (20 * N);
	       // you write this drawFigure method:
	       drawFigure(g, x, y, width); // size parameter added
	   }
	 }
	
	public static void drawFigure(Graphics g, int x, int y, int width) {
		
		g.setColor(Color.BLUE);
		g.fillOval(x, y, 40, 40);
		g.fillOval(x + 80, y, 40, 40);
		
		g.setColor(Color.RED);
		g.fillRect(x + 20, y + 20, 80, 80);
		
		g.setColor(Color.BLACK);
		g.drawLine(x + 20, y + 60, x + 100, y + 60);
	}

}
