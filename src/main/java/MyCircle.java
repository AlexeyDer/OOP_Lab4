public class MyCircle extends tPoint {
    private int width, len;

    protected MyCircle(int x, int y, int width, int len) {
        super(x, y);
        setLen((len));
        setWidth(width);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }
}
