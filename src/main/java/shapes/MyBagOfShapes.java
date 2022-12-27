package shapes;

public class MyBagOfShapes {
   private MyShape[] shapes = new MyShape[3];
   private int index;

    public MyShape[] getShapes() {
        return shapes;
    }

    public void adShape(MyShape s) {
       shapes[index]=s;
       index++;
   }
}
