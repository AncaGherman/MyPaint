package shapes;

public class DemoShapesNoUI {
    public static void main(String[] args) {
        MyBagOfShapes mbs = new MyBagOfShapes();
        MyCircle circle1 = new MyCircle(new MyPoint(300, 300), 100);
        MyRectangle myr1 = new MyRectangle(new MyPoint(300, 300), 10, 100);
        MyRectangle myr2 = new MyRectangle(new MyPoint(400, 500), 150, 40);

        mbs.adShape(circle1);
        mbs.adShape(myr1);
        mbs.adShape(myr2);
    }
}
