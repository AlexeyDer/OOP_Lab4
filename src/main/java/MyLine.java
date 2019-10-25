public class MyLine extends tPoint {
    private double x0, y0;
    private double x1, y1;
    private double dx, dy;
    private double dx1, dy1;


    private int newX, newX1, newY, newY1;

    private boolean bx = true, by = true;

    protected MyLine(){
        super(-1, -1);
        this.x1 = -1;
        this.y1 = -1;
    }

    protected MyLine(int x, int y, int x1, int y1){
        super(x, y);
        this.x1 =(double) x1;
        this.y1 =(double) y1;

        setX0((getX() + getX1()) / 2);
        setY0((getY() + getY1()) / 2);

        this.dx = getX() - getX0();
        this.dy = getY() - getY0();

        this.dx1 = getX1() - getX0();
        this.dy1 = getY1() - getY0();
    }

    protected MyLine(double x, double y, double x1, double y1){
        super(x, y);
        this.x1 = x1;
        this.y1 = y1;

        setX0((getX() + getX1()) / 2);
        setY0((getY() + getY1()) / 2);

        this.dx = getX() - getX0();
        this.dy = getY() - getY0();

        this.dx1 = getX1() - getX0();
        this.dy1 = getY1() - getY0();
    }


    @Override
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

    public void OnCircle()  {
            double cosA = Math.cos(getA()), sinA = Math.sin(getA());

            setX((this.dx * cosA - this.dy * sinA + getX0()));
            setX1((this.dx1 * cosA - this.dy1 * sinA + getX0()));

            setY((this.dx * sinA + this.dy * cosA + getY0()));
            setY1((this.dx1 * sinA + this.dy1 * cosA + getY0()));
                setA(getA() + 0.01);
    }


    public void setDx1(double dx1) {
        this.dx1 = dx1;
    }

    public void setDy(double dy) {
        this.dy = dy;
    }

    public void setDy1(double dy1) {
        this.dy1 = dy1;
    }

    public double getDy() {
        return dy;
    }

    public double getDx1() {
        return dx1;
    }


    public double getDy1() {
        return dy1;
    }

    public double getDx() {
        return dx;
    }

    public void setDx(double r1) {
        dx = r1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX0() {
        return x0;
    }

    public void setX0(double x0) {
        this.x0 = x0;
    }

    public double getY0() {
        return y0;
    }

    public void setY0(double y0) {
        this.y0 = y0;
    }
}
