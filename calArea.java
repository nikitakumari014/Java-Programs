abstract class Shape
{
 abstract void rectangleArea(int l,int b);
 abstract void squareArea(int s);
 abstract void circleArea(float r);
}
class Area extends Shape{
    public void rectangleArea(int l,int b)
    {
     System.out.println("Area of rectangle is: "+l*b);
    }
    public void squareArea(int s)
    {
        System.out.println("Area of square is: "+s*s);
    }
    public void circleArea(float r)
    {
        System.out.println("Area of circle is: "+ 22*r*r/7);
    }
}
public class calArea{
    public static void main(String[]args)
    {
        Area a = new Area();
        a.circleArea(7.5f);
        a.squareArea(12);
        a.rectangleArea(9, 3);

    }
}