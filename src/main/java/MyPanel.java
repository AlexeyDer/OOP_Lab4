import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.*;
import javax.swing.Timer;
import javax.swing.text.Element;

public class MyPanel extends JPanel{
	private tPoint[] point;
	private MyLine[] line;
	private MyTriangle[] triangles;
	private MyRectangle[] rectangles;
	private MyRomb[] rombs;
	private MyCircle[] circles;
	private MyElips[] elips;
	private tPoint[] figures;
	private int n;
	private Timer timer = null;
	boolean bc = true;
	private Color c[];
	private double theta = 0.00001;

	private int R1x, R1y;
	private int R1x1, R1y1;

	
	public MyPanel(tPoint[] m, MyLine[] line, MyTriangle[] triangles, MyRectangle[] rectangles, MyRomb[] rombs, MyCircle[] circles,
				   MyElips[] elips, tPoint[] figures, int n, Color c[]) {
		this.point = m;
		this.n = n;
		this.line = line;
		this.triangles = triangles;
		this.rectangles = rectangles;
		this.rombs = rombs;
		this.circles = circles;
		this.elips = elips;
		this.figures = figures;
		this.c = c;
	}

	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;
	
		g2d.setStroke(new BasicStroke(5));
		setBackground(Color.black);


			for (int i = 0; i < n; i++) {
					g2d.setColor(c[i]);
//
					drawPoints(g2d, point, i);
			 		drawLines(g2d, line, i);
					drawTriangle(g2d, triangles, i);
					drawRectangle(g2d, rectangles, i);
//					drawRomb(g2d, rombs, i);
			//		drawCircle(g2d, circles, i);
//					drawElips(g2d, elips, i);

			}		
			bc = false;
	}

	private void drawElips(Graphics2D g2d, MyElips[] elips, int i) {
		g2d.drawOval((int)elips[i].getX(), (int)elips[i].getY(), elips[i].getWidth(), elips[i].getLen());
//		g2d.rotate(this.theta);
//		this.theta += 0.0001;
	}

	private static void drawCircle(Graphics2D g2d, MyCircle[] circles, int i) {
		g2d.drawOval((int)circles[i].getX(), (int)circles[i].getY(), circles[i].getWidth(), circles[i].getLen());
	}

	private static void drawRomb(Graphics2D g2d, MyRomb[] rombs, int i) {
		g2d.drawLine((int)rombs[i].getX(), (int)rombs[i].getY(),(int) rombs[i].getX1(), (int)rombs[i].getY1());
		g2d.drawLine((int)rombs[i].getX1(), (int)rombs[i].getY1(),(int) rombs[i].getX2(), (int)rombs[i].getY2());
		g2d.drawLine((int)rombs[i].getX2(), (int)rombs[i].getY2(),(int) rombs[i].getX3(), (int)rombs[i].getY3());
		g2d.drawLine((int)rombs[i].getX3(), (int)rombs[i].getY3(),(int) rombs[i].getX(), (int)rombs[i].getY());
	}

	private static void drawRectangle(Graphics2D g2d, MyRectangle[] rectangles, int i) {
		g2d.drawLine((int)rectangles[i].getX(), (int)rectangles[i].getY(),(int) rectangles[i].getX1(), (int)rectangles[i].getY1());
		g2d.drawLine((int)rectangles[i].getX1(), (int)rectangles[i].getY1(),(int) rectangles[i].getX2(), (int)rectangles[i].getY2());
		g2d.drawLine((int)rectangles[i].getX2(), (int)rectangles[i].getY2(),(int) rectangles[i].getX3(), (int)rectangles[i].getY3());
		g2d.drawLine((int)rectangles[i].getX3(), (int)rectangles[i].getY3(),(int) rectangles[i].getX(), (int)rectangles[i].getY());
	}

	private static void drawPoints(Graphics2D g2d, tPoint[] point, int i) {
		g2d.drawLine((int)point[i].getX(), (int)point[i].getY(),(int) point[i].getX(), (int)point[i].getY());
	}

	private static void drawLines(Graphics2D g2d, MyLine[] line, int i) {
		g2d.drawLine((int)line[i].getX(),(int) line[i].getY(),(int) line[i].getX1(), (int)line[i].getY1());
	}

	private static void drawTriangle(Graphics2D g2d, MyTriangle[] triangles, int i){
		g2d.drawPolygon(new int[] {(int)triangles[i].getX(), (int)triangles[i].getX1(), (int)triangles[i].getX2()},
				new int[] {(int)triangles[i].getY(),(int) triangles[i].getY1(),(int) triangles[i].getY2()}, 3);
	}



	
}
