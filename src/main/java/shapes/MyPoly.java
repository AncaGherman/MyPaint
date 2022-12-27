package shapes;

public class MyPoly extends MyShape{
    MyPoint point1;
    MyPoint point2;
    MyPoint point3;

    public MyPoly(MyPoint point1, MyPoint point2, MyPoint point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public MyPoint getPoint1() {
        return point1;
    }

    public MyPoint getPoint2() {
        return point2;
    }

    public MyPoint getPoint3() {
        return point3;
    }
}
