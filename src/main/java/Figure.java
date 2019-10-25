public abstract class Figure{
    private double x, y;

    Figure(double x, double y) {
         this.x = x;
         this.y = y;
    }

    Figure(int x, int y) {
        this.x = (double)x;
        this.y = (double)y;
    }

    public abstract void MoveHaot();
    public abstract void MovePramX();
    public abstract void OnCircle();


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

}
