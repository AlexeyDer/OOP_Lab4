import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.*;
import javax.swing.Timer;

public class MyPanel extends JPanel{
	private tPoint[] point;
	private MyLine[] line;
	private MyTriangle[] triangles;
	private int n;
	private Timer timer = null;
	boolean bc = true;
	private Color c[];

	private int R1x, R1y;
	private int R1x1, R1y1;

	
	public MyPanel(tPoint[] m, MyLine[] line, MyTriangle[] triangles, int n, Color c[]) {
		this.point = m;
		this.n = n;
		this.line = line;
		this.triangles = triangles;
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
					drawPoints(g2d, point, i);
			 		drawLines(g2d, line, i);
					drawTriangle(g2d, triangles, i);
			}		
			bc = false;
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
