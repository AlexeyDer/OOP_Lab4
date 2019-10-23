public class MyRectangle extends MyTriangle {
    private double x0, y0;
    private double x3, y3;
    private boolean bx = true, by = true;
    private double dx3, dy3;

    MyRectangle() {
        super(-1, -1 , -1, -1, -1, -1);
        setX3(-1);
        setY3(-1);
    }


    MyRectangle(double x, double y, double x1, double y1, double x2, double y2, double x3, double y3) {
        super(x, y , x1, y1, x2, y2);
        setX3(x3);
        setY3(y3);

        setX0((getX() + getX1()) / 2);
        setY0((getY() + getY2()) / 2);

        setDx(getX() - getX0());    ///
        setDy(getY() - getY0());

        setDx1(getX1() - getX0());
        setDy1( getY1() - getY0());

        setDx2(getX2() - getX0());
        setDy2(getY2() - getY0());

        setDx3(getX3() - getX0());
        setDy3(getY3() - getY0());
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

    @Override
    public void OnCircle() throws InterruptedException {
        double cosA = Math.cos(getA()), sinA = Math.sin(getA());

        setX((getDx() * cosA + getDy() * sinA + getX0()));
        setX1((getDx1() * cosA + getDy1() * sinA + getX0()));
        setX2((getDx2() * cosA + getDy2() * sinA + getX0()));
        setX3((getDx3() * cosA + getDy3() * sinA + getX0()));

        setY((getDy() * cosA - getDx() * sinA + getY0()));
        setY1((getDy1() * cosA - getDx1() * sinA + getY0()));
        setY2((getDy2() * cosA - getDx2() * sinA + getY0()));
        setY3((getDy3() * cosA - getDx3() * sinA + getY0()));
        setA(getA() + 0.01);

    }

    @Override
    public void setX0(double x0) {
        this.x0 = x0;
    }

    @Override
    public void setY0(double y0) {
        this.y0 = y0;
    }

    @Override
    public double getX0() {
        return x0;
    }

    @Override
    public double getY0() {
        return y0;
    }

    public void setDx3(double dx3) {
        this.dx3 = dx3;
    }

    public void setDy3(double dy3) {
        this.dy3 = dy3;
    }

    public double getDx3() {
        return dx3;
    }

    public double getDy3() {
        return dy3;
    }

    public double getX3() {
        return x3;
    }

    public double getY3() {
        return y3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }
}
