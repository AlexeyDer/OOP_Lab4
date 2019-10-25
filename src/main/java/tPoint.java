import java.util.Random;
import java.util.Scanner;

public class tPoint extends Figure {
	private final int window_w = 1300, window_h = 750;
	private boolean bx = true, by = true;
	private static Random random = new Random();
	private double a = Math.toRadians(0.1);

	private int count_x;
	private int count_y;

    protected tPoint() {
    	super(-1, -1);
        this.count_x = -1;
        this.count_y = -1;
    }

	protected tPoint(int x, int y) {
		super(x, y);
		this.count_x = random.nextInt(2);
		this.count_y = random.nextInt(2);
	}

	protected tPoint(double x, double y) {
		super(x, y);
		this.count_x = random.nextInt(2);
		this.count_y = random.nextInt(2);
	}



	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public void setCount_x(int count_x) {
        this.count_x = count_x;
    }

    public void setCount_y(int count_y) {
        this.count_y = count_y;
    }

    public int getCount_x() {
        return count_x;
    }

    public int getCount_y() {
        return count_y;
    }

    public int getWindow_h() {
        return window_h;
    }

    public int getWindow_w() {
        return window_w;
    }


	public void MovePramX() {
		if (bx && getX() < window_w - 15)
			setX(getX() + 1);
		else {
			bx = false;
			if (!bx && getX() > 1)
				setX(getX() - 1);
			else
				bx = true;
		}
	}

	@Override
	public void OnCircle() {
		return;
	}


	public int moveCords(int a) {
		if (a == 0)
			return 1;
		else
			return 0;
	}

	public void MoveHaot() {

		if (count_x == 0 && bx && getX() < window_w - 15)
			setX(getX() + 1);
		else {
			if (bx) {
				count_x = moveCords(count_x);
			}
			bx = false;
			count_x = moveCords(count_x);

			if (count_x == 1 && !bx && getX() > 1)
				setX(getX() - 1);
			else {
				if (!bx) {
					count_x = moveCords(count_x);
				}
				bx = true;
			}
		}
		
		

		if (count_y == 0 && by && getY() < window_h - 40)
			setY(getY() + 1);
		else {
			if (by) {
				count_y = moveCords(count_y);
			}
			by = false;
			count_y = moveCords(count_y);

			if (count_y == 1 && !by && getY() > 1)
				setY(getY() - 1);
			else {
				if (!by) {
					count_y = moveCords(count_y);
				}
				by = true;
			}
		}

		if (count_x == 0)
			setX(getX() + 1);
		else
			setX(getX() - 1);

		if (count_y == 0)
			setY(getY() + 1);
		else
			setY(getY() - 1);

	}

	public static void main(String args[]) throws InterruptedException {
		final int window_w = 1300, window_h = 750;
		final int n = 50;
		int x, y, x1, y1, x2, y2;

		tPoint[] point = new tPoint[n];
		MyLine[] line = new MyLine[n];
		MyTriangle[] triangles = new MyTriangle[n];
		MyRectangle[] rectangles = new MyRectangle[n];
		MyRomb[] rombs = new MyRomb[n];
		MyElips[] elips = new MyElips[n];
		MyCircle[] circles = new MyCircle[n];



		for (int i = 0; i < n; i++) {
			x = random.nextInt(window_w - 200);
			y = random.nextInt(window_h - 150);
            x1 = x + 100;
            y1 = random.nextInt(window_h);
            x2 = random.nextInt(window_w);
            y2 = random.nextInt(window_w);
			point[i] = new tPoint(x, y);
			line[i] = new MyLine(x, y, x1, y);
			triangles[i] = new MyTriangle(x, y, x + 100, y + 75, x - 20, y + 100);
			rectangles[i] = new MyRectangle(x, y, x + 100, y, x + 100, y + 50, x, y + 50);
			rombs[i] = new MyRomb(x, y, x + 20, y + 50, x , y + 100, x - 20, y + 50);
			circles[i] = new MyCircle(x, y, 100, 100);
			elips[i] = new MyElips(x, y, 100, 50);


		}
			tPoint[] figures = new tPoint[7];
//
//        figures[0] = point[n];
//        figures[1] = line[n];
//        figures[2] = triangles[n];
//       	figures[3] = rectangles[n];
//       	figures[4] = rombs[n];
//       	figures[5] = circles[n];
//       	figures[6] = elips[n];

		new Window(window_w, window_h, point, line, triangles, rectangles, rombs, circles, elips, figures, n);
	}
}
