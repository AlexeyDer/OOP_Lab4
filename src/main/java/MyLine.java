public class MyLine extends tPoint {
    private int x0, y0;
    private int x1, y1;

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

    public void LineOnCircle(int x1, int y1, int x2, int y2) {
            if (x1 == x2) {
                setX0(x1);
                setY0(Math.abs(y1 - y2) / 2);
            }
            if (y1 == y2) {
                setX0(Math.abs(x1 - x2) / 2);
                setY0(y1);
            }

           // setX(getX0() + (getX() - getX0()) * Math.cos(a) - (getY() - getY0()) * Math.sin(a));


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
