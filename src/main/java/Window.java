import java.awt.*;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

public class Window extends JFrame {

	private tPoint[] point;
	private MyLine[] line;
	private MyTriangle[] triangles;
	private MyRectangle[] rectangles;
	private MyRomb[] rombs;
	private MyCircle[] circles;
	private MyElips[] elips;
	private tPoint[] figures;
	private int n;
	public static final int window_w = 1300, window_h = 750;

	JFrame frame;

	public Window(int window_w, int window_h, tPoint[] point, MyLine[] line, MyTriangle[] triangles,
				  MyRectangle[] rectangles, MyRomb[] rombs, MyCircle[] circles, MyElips[] elips, tPoint[] figures, int n) throws InterruptedException {
		this.point = point;
		this.line = line;
		this.triangles = triangles;
		this.rectangles = rectangles;
		this.rombs = rombs;
		this.circles = circles;
		this.elips = elips;
		this.figures = figures;
		this.n = n;
        Random r = new Random();
        Color c[] = new Color[n];
        for (int i = 0; i < n; i++) {
            c[i] = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256), r.nextInt(256));
        }

        frame = new JFrame("tPoint");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(window_w, window_h);
		frame.setVisible(true);
		frame.setContentPane(new MyPanel(point, line, triangles, rectangles, rombs, circles, elips, figures, n, c));
		frame.setLocationRelativeTo(null);
		MoveIt();
	}

	private void MoveIt() throws InterruptedException {
//        Scanner scanner = new Scanner(System.in);
//        int c = scanner.nextInt();
//
//        System.out.println("\tMain menu: ");
//        System.out.println("1. Points");
//        System.out.println("2. Lines");

		while (true) {
//
//            for (int i = 0; i < 3; i++)
//                figures[i].MovePramX();
//            try {
//                Thread.sleep(10);
//            } catch (Exception exc) {
//            }

			for (int i = 0; i < n; i++)
				point[i].MoveHaot();
			try {
				Thread.sleep(10);
			} catch (Exception exc) {
			}

			for (int i = 0; i < n; i++)
				line[i].OnCircle();
			try {
				Thread.sleep(10);
			} catch (Exception exc) {
			}

			for (int i = 0; i < n; i++)
				triangles[i].MoveHaot();
			try {
				Thread.sleep(10);
			} catch (Exception exc) {
			}

			for (int i = 0; i < n; i++)
				rectangles[i].OnCircle();
			try {
				Thread.sleep(10);
			} catch (Exception exc) {
			}

			for (int i = 0; i < n; i++)
				rombs[i].OnCircle();
			try {
				Thread.sleep(10);
			} catch (Exception exc) {
			}

			for (int i = 0; i < n; i++)
				elips[i].OnCircle();
			try {
				Thread.sleep(10);
			} catch (Exception exc) {
			}


			frame.repaint();

		}
	}
}
