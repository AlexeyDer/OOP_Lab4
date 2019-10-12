public class MyTriangle extends MyLine {
    private int x2, y2;
    private boolean bx = true, by = true;
  //  private int count_x, count_y;

    protected MyTriangle(int x, int y, int x1, int y1, int x2, int y2) {
        super(x, y, x1, y1);
        this.x2 = x2;
        this.y2 = y2;
    }

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

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
}
