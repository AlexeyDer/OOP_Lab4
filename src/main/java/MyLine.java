public class MyLine extends tPoint {
    private int x0, y0;
    private int x1, y1;
    private int R1x, R1y;

    private boolean bx = true, by = true;

    protected MyLine(int x, int y, int x1, int y1){
        super(x, y);
        this.x1 = x1;
        this.y1 = y1;
    }



    public void MovePramX() {
        if (bx && (getX() < getWindow_w() - 15 && getX1() <  getWindow_w() - 15)) {
            setX(getX() + 1);
            setX1(getX1() + 1);
        }
        else {
            bx = false;
            if (!bx && getX() > 1 && getX1() > 1) {
                setX(getX() - 1);
                setX1(getX1() - 1);
            }
            else
                bx = true;
        }
    }

    public void OnCircle() {
//        if (x1 == x2 || y1 == y2) {
//            if (x1 == x2) {
//                setX0(x1);
//                setY0((Math.abs(y1 - y2) / 2) + y1 > y2 ? y1 : y2);
//            }
//            if (y1 == y2) {
//                //  setR1(Math.abs(x1 - x2));
//                setX0((Math.abs(x1 - x2) / 2) + x1 > x2 ? x1 : x2);
//                setY0(y1);
//            }
//        } else {
            setX0((getX() + getX1()) / 2);
            setY0((getY() + getY1()) / 2);

            R1x = ((getX() > getX1()) ? getX() - x0 : getX1() - x0);
            R1y = ((getY() > getY1()) ? getY() - y0 : getY1() - y0);

            double a = Math.toRadians(30);
            double cosA = Math.cos(a), sinA = Math.sin(a);

            setX((int)(R1x * cosA + R1y * sinA + x0));
            setY((int)(R1y * cosA - R1x * sinA + y0));

    }

    public int getR1x() {
        return R1x;
    }

    public void setR1x(int r1) {
        R1x = r1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX0() {
        return x0;
    }

    public void setX0(int x0) {
        this.x0 = x0;
    }

    public int getY0() {
        return y0;
    }

    public void setY0(int y0) {
        this.y0 = y0;
    }
}
