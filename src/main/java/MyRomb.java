public class MyRomb extends MyRectangle{
    private double x0, y0;
    private boolean bx = true, by = true;

    protected MyRomb(double x, double y, double x1, double y1, double x2, double y2, double x3, double y3) {
        super(x, y , x1, y1, x2, y2, x3, y3);

        setX0((getX1() + getX3()) / 2);
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


}
