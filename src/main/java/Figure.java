public abstract class Figure{
    private double x, y;

    Figure(double x, double y) {
         this.x = x;
         this.y = y;
    }

    public abstract void MoveHaot();
    public abstract void MovePramX();


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
