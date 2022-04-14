class Area{
    Area(int l,int b)
    {
        System.out.println("Area of Rectangle is: "+l*b);
    }
    Area(float r)
    {
        float f = 22*r*r/7;
        System.out.println("Area of circle is: "+f);
    }
    Area(float l,float b)
    {
        System.out.println("Area of Triangle is: "+l*b/2);
    }
    Area(int s)
    {
        System.out.println("Area of Square is: "+s*s);
    }
}
class Volume 
{
   Volume(float r)
   {
       float f1 = 4*22*r*r*r/21;
    System.out.println("Volume of sphere is: "+f1);
   }
   Volume(float r,float h)
   {
       float f1 = 22*r*r*h/7;
       System.out.println("Volume of cylinder is: "+f1);
   }
   Volume(int a)
   {
    System.out.println("Volume of cube is: "+a*a*a);
   }
   Volume(int r,int h)
   {
       int f1 = r*r*h/3;
       System.out.println("Volume of cone is: "+f1);
   }

}


public class areaVolume {
    public static void main(String []args)
    {
        Area a = new Area(12);
        Area a1 = new Area(3,6);
        Area a2 = new Area(3.7f);
        Area a3 = new Area(6.5f,3.4f);
        Volume v = new Volume(4);
        Volume v1 = new Volume(6,4);
        Volume v2 = new Volume(4.5f,6.5f);
        Volume v3 = new Volume(7.5f);
    }
}
