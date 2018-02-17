import java.awt.Color;
import java.awt.Graphics;

public class Stuff {
	
	public static void main (String[] args) {
		
	//	DrawingPanel panel = new DrawingPanel(200, 200);
		//Graphics g = panel.getGraphics();
		
		
		
	//	DrawingPanel panel = new DrawingPanel(200, 200);
		
	//	Graphics g = panel.getGraphics();
		/*
		DrawingPanel panel = new DrawingPanel(450, 150);
		panel.setBackground(Color.YELLOW);
		Graphics g = panel.getGraphics();
		
		
		g.setColor(Color.BLACK);
		g.fillRect(10, 10, 50, 50);
		g.setColor(Color.WHITE);
		g.fillOval(10, 10, 50, 50);
		*/
		
		/*
		g.drawRect(10, 20, 40, 20);
		g.drawLine(10, 20, 50, 40);
		*/
		
	/*
		for(int i = 0; i < 20; i++) {
			g.drawOval(i * 10, i * 10, 200 - (i * 10), 200 - (i * 10));
		}
		*/
		
		//drawFigure(g, 50, 25);
		//drawFigure(g, 250, 45);
		//drawFace(g, 10, 30);
		//drawFace(g, 150, 50);
		//drawManyFaces(g, 10, 30);
		
		/*	
		for(int i = 0; i < 4; i++) {
			g.drawRect(20 + 20 * i, 20 + 20 * i, 160 - 40 * i, 160 - 40 * i);
		}
		*/
		
		 DrawingPanel panel = new DrawingPanel(800, 800);
	     Graphics g = panel.getGraphics();
	      /*    
	     for(int i = 0; i <= 6; i++) {
	    	 g.drawRect(25, 50, 50 + 50 * i, 50);
	    	 g.drawString(Integer.toString(i), 50 + 50 * i, 100);
	    	 
	     }
	         
	        
	      
	        g.setColor(Color.CYAN);
	        g.fillRect(0, 0, 400, 300);
	        drawFigure(g, 50, 50, 200);
		*/
	     int x = 50;
	     int y = 50;
	     
	     for(int i = 1; i <= 6; i++) {
	    	 for(int j = 1; j <= 35; j++) {
	    		 if(j % 7 == 0) {
	    			  x = x - 350;
	    			  y = y + 50;
	    		 }
	    		 g.drawString(Integer.toString(j), x + 50 * j, y + 50);
	    	 }
	     }
	     
	     
	} 
	
	public static void drawDay(Graphics g, int d, int x, int y) {
		int[] array = new int[] {1, 2, 3, 4 , 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
		
		int countX = 50;
		int countY = 50;
	     
	     for(int i = 1; i <= 6; i++) {
	    	 for(int j = 1; j <= 35; j++) {
	    		 if(j % 7 == 0) {
	    			 countX = countX - 350;
	    			 countY = countY + 50;
		    		 
		    	 }
	    		 g.drawString(Integer.toString(j), x + 50 * j, y + 50);
	    	 }
	    	
	    	 //g.drawString(Integer.toString(i), 50 * i, 50);
	     }
	}
	
	

		/*
	public static void drawManyFaces(Graphics g, int x, int y) {
		
		for(int i = 0; i <= 4; i++) {
			drawFace(g, x + 100 * i, y);
		}
	}
	
	public static void drawFace(Graphics g, int x, int y) {
		
		g.setColor(Color.BLACK);
		g.drawOval(x, y, 100, 100);  // face outline
		
		g.setColor(Color.BLUE);
		g.fillOval(x + 20, y + 30, 20, 20);  // eyes
		g.fillOval(x + 60, y + 30, 20, 20);
		
		g.setColor(Color.RED);
		g.drawLine(x + 30, y + 70, x + 70, y + 70); // mouth
	}
	
	*//*
	public static void drawFigure(Graphics g, int x, int y) {
		
		g.setColor(Color.BLUE);
		g.fillOval(x, y, 40, 40);
		g.fillOval(x + 80, y, 40, 40);
		
		g.setColor(Color.RED);
		g.fillRect(x + 20, y + 20, 80, 80);
		
		g.setColor(Color.BLACK);
		g.drawLine(x + 20, y + 60, x + 100, y + 60);
	}
	
	public static void MickeyBox() {
		
		DrawingPanel panel = new DrawingPanel(220, 150);
		Graphics g = panel.getGraphics();
		
		panel.setBackground(Color.YELLOW);
		g.setColor(Color.BLUE);
		g.fillOval(50, 25, 40, 40);
		g.fillOval(130, 25, 40, 40);
		
		g.setColor(Color.RED);
		g.fillRect(70, 45, 80, 80);
		
		g.setColor(Color.BLACK);
		g.drawLine(70, 85, 149, 85);
		
	}

	*/
	
	 public static void drawFigure(Graphics g, int x, int y, int size) {
	        int separation = size / 5;
	        g.setColor(Color.RED);
	        
	        for(int i = 1; i <= 5; i++)
	            g.drawRect(x, y, separation * i, separation * i);
	            
	        g.setColor(Color.BLACK);
	        g.drawLine(x, y, x + size, y + size);
	    }
}
