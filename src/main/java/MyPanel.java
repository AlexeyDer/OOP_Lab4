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
					
				//g2d.drawLine(point[i].getX(), point[i].getY(), point[i].getX(), point[i].getY());
				g2d.drawLine(line[i].getX(), line[i].getY(), line[i].getX1(), line[i].getY1());
//                g2d.drawLine(triangles[i].getX(), triangles[i].getY(), triangles[i].getX1(), triangles[i].getY1());
//                g2d.drawLine(triangles[i].getX1(), triangles[i].getY1(), triangles[i].getX2(), triangles[i].getY2());
//                g2d.drawPolygon(new int[] {triangles[i].getX(), triangles[i].getX1(), triangles[i].getX2()},
//                        new int[] {triangles[i].getY(), triangles[i].getY1(), triangles[i].getY2()}, 3);

			}		
			bc = false;
	}
	
	
	
}
