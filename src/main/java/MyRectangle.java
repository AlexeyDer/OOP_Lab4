public class MyRectangle extends MyTriangle {
    private int x3, y3;
    private boolean bx = true, by = true;

    MyRectangle(int x, int y, int x1, int y1, int x2, int y2, int x3, int y3) {
        super(x, y , x1, y1, x2, y2);
        setX3(x3);
        setY3(y3);
    }

    public void MovePramX() {
        if (bx &&
                (getX() < getWindow_w() - 15 &&
                        getX1() <  getWindow_w() - 15 &&
                        getX2() <  getWindow_w() - 15) &&
                        getX3() <  getWindow_w() - 15)  {
            setX(getX() + 1);
            setX1(getX1() + 1);
            setX2(getX2() + 1);
            setX3(getX3() + 1);
        }
        else {
            bx = false;
            if (!bx && getX() > 1 && getX1() > 1 && getX2() > 1 && getX3() > 1) {
                setX(getX() - 1);
                setX1(getX1() - 1);
                setX2(getX2() - 1);
                setX3(getX3() - 1);
            }
            else
                bx = true;
        }
    }

    public int getX3() {
        return x3;
    }

    public int getY3() {
        return y3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }
}
