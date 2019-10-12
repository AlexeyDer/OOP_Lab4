public class MyRectangle extends MyTriangle {
    private int x3, y3;

    MyRectangle(int x, int y, int x1, int y1, int x2, int y2, int x3, int y3) {
        super(x, y , x1, y1, x2, y2);
        setX3(x3);
        setY3(y3);
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
