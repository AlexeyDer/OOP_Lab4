public class MyTriangle extends MyLine {
    private double x0, y0;
    private double x2, y2;
    private boolean bx = true, by = true;
    private double dx2, dy2;
  //  private double a = Math.toRadians(0.1);
  //  private int count_x, count_y;

    protected MyTriangle() {
        super(-1, -1, -1, -1);
        this.x2 = -1;
        this.y2 = -1;
    }

    protected MyTriangle(double x, double y, double x1, double y1, double x2, double y2) {
        super(x, y, x1, y1);
        this.x2 = x2;
        this.y2 = y2;

        setX0((getX() + getX1() + getX2()) / 3);
        setY0((getY() + getY1() + getY2()) / 3);

        setDx(getX() - getX0());
        setDy(getY() - getY0());

        setDx1(getX1() - getX0());
        setDy1( getY1() - getY0());

        setDx2(getX2() - getX0());
        setDy2(getY2() - getY0());

    }


    @Override
    public void OnCircle() throws InterruptedException {
        double cosA = Math.cos(getA()), sinA = Math.sin(getA());

        setX((getDx() * cosA + getDy() * sinA + getX0()));
        setX1((getDx1() * cosA + getDy1() * sinA + getX0()));
        setX2((getDx2() * cosA + getDy2() * sinA + getX0()));

        setY((getDy() * cosA - getDx() * sinA + getY0()));
        setY1((getDy1() * cosA - getDx1() * sinA + getY0()));
        setY2((getDy2() * cosA - getDx2() * sinA + getY0()));
        setA(getA() + 0.01);

    }

    @Override
    public void MovePramX() {
        if (bx && (getX() < getWindow_w() - 15 && getX1() <  getWindow_w() - 15 && getX2() <  getWindow_w() - 15) ) {
            setX(getX() + 1);
            setX1(getX1() + 1);
            setX2(getX2() + 1);
        }
        else {
            bx = false;
            if (!bx && getX() > 1 && getX1() > 1 && getX2() > 1) {
                setX(getX() - 1);
                setX1(getX1() - 1);
                setX2(getX2() - 1);
            }
            else
                bx = true;
        }
    }

    public void MoveHaot() {

        if (getCount_x() == 0 && bx && getX() < getWindow_w() - 15 && getX1() < getWindow_w() - 15 && getX2() < getWindow_w() - 15) {
            setX(getX() + 1);
            setX1(getX1() + 1);
            setX2(getX2() + 1);
        }
        else {
            if (bx) {
                setCount_x(moveCords(getCount_x()));
            }
            bx = false;
            setCount_x(moveCords(getCount_x()));

            if (getCount_x() == 1 && !bx &&
                    getX() > 1 &&
                    getX1() > 1 &&
                    getX2() > 1) {
                setX(getX() - 1);
                setX1(getX1() - 1);
                setX2(getX2() - 1);
        }
            else {
                if (!bx) {
                    setCount_x(moveCords(getCount_x()));
                }
                bx = true;
            }
        }

///////////////////////////////////////////////////////////////////////////////////////

        if (getCount_y() == 0 && by &&
                getY() < getWindow_h() - 40 &&
                getY1() < getWindow_h() - 40 &&
                getY2() < getWindow_h() - 40 ) {
            setY(getY() + 1);
            setY1(getY1() + 1);
            setY2(getY2() + 1);
        }
        else {
            if (by) {
                setCount_y(moveCords(getCount_y()));
            }
            by = false;
            setCount_y(moveCords(getCount_y()));

            if (getCount_y() == 1 && !by &&
                    getY() > 1 &&
                    getY1() > 1 &&
                    getY2() > 1) {
                setY(getY() - 1);
                setY1(getY1() - 1);
                setY2(getY2() - 1);
            }
            else {
                if (!by) {
                    setCount_y(moveCords(getCount_y()));
                }
                by = true;
            }
        }



        if (getCount_x() == 0) {
            setX(getX() + 1);
            setX1(getX1() + 1);
            setX2(getX2() + 1);
        }
        else {
            setX(getX() - 1);
            setX1(getX1() - 1);
            setX2(getX2() - 1);
        }

        if (getCount_y() == 0) {
            setY(getY() + 1);
            setY1(getY1() + 1);
            setY2(getY2() + 1);
        }
        else {
            setY(getY() - 1);
            setY1(getY1() - 1);
            setY2(getY2() - 1);
        }
    }


    public double getDx2() {
        return dx2;
    }

    public double getDy2() {
        return dy2;
    }

    public void setDx2(double dx2) {
        this.dx2 = dx2;
    }

    public void setDy2(double dy2) {
        this.dy2 = dy2;
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


    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
}
