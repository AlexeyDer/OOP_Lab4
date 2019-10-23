public class MyElips extends MyCircle {
    private int width, len;
    private double dx, dy, dx1, dy1;

    protected MyElips(double x, double y, int width, int len) {
        super(x, y, width, len);

//        this.dx = (width / 2 + x);
//        this.dy = (len / 2) + y;

    }

    public void OnCircle() {
        double cosA = Math.cos(getA()), sinA = Math.sin((getA()));

        setX(((width / 2) * cosA + getX()));
        setY(((len / 2)) * sinA + getY());

        setA(getA() + 0.01);
    }

    public void setDx(double dx) {
        this.dx = dx;
    }

    public void setDy(double dy) {
        this.dy = dy;
    }

}
