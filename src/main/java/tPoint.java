import java.util.Random;

public class tPoint {
	private final int window_w = 1300, window_h = 750;
	private int x, y;
	private boolean bx = true, by = true;
	private static Random random = new Random();

	private int count_x;
	private int count_y;

	protected tPoint(int x, int y) {
		setX(x);
		setY(y);
		this.count_x = random.nextInt(2);
		this.count_y = random.nextInt(2);
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



    public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void MovePramX() {
		if (bx && x < window_w - 15)
			++this.x;
		else {
			bx = false;
			if (!bx && x > 1)
				--this.x;
			else
				bx = true;
		}
	}

	public int moveCords(int a) {
		if (a == 0)
			return 1;
		else
			return 0;
	}

	public void MoveHaot() {

		if (count_x == 0 && bx && x < window_w - 15)
			++this.x;
		else {
			if (bx) {
				count_x = moveCords(count_x);
			}
			bx = false;
			count_x = moveCords(count_x);

			if (count_x == 1 && !bx && x > 1)
				--this.x;
			else {
				if (!bx) {
					count_x = moveCords(count_x);
				}
				bx = true;
			}
		}
		
		

		if (count_y == 0 && by && y < window_h - 40)
			++this.y;
		else {
			if (by) {
				count_y = moveCords(count_y);
			}
			by = false;
			count_y = moveCords(count_y);

			if (count_y == 1 && !by && y > 1)
				--this.y;
			else {
				if (!by) {
					count_y = moveCords(count_y);
				}
				by = true;
			}
		}

		if (count_x == 0)
			++this.x;
		else
			--this.x;

		if (count_y == 0)
			++this.y;
		else
			--this.y;

	}

	public static void main(String args[]) {
		final int window_w = 1300, window_h = 750;
		final int n = 50;
		int x, y, x1, y1, x2, y2;

		tPoint[] point = new tPoint[n];
		MyLine[] line = new MyLine[n];
		MyTriangle[] triangles = new MyTriangle[n];

		for (int i = 0; i < n; i++) {
			x = random.nextInt(window_w - 100);
			y = random.nextInt(window_h - 100);
            x1 = x + 100;
            y1 = y + 75;
            x2 = x - 20;
            y2 = y + 100;
		//	point[i] = new tPoint(x, y);
//			line[i] = new MyLine(x, y, x1, y);
			triangles[i] = new MyTriangle(x, y, x1, y1, x2, y2);

		}

		new Window(window_w, window_h, point, line, triangles, n);
	}
}
