abstract class Temperature
{
   public double temp;
   void setTempData(double t)
   {
       temp = t;
   }
   abstract void changeTemp();
}
class fahrenheit extends Temperature
{
    public double ctemp;
    void changeTemp()
    {
        ctemp = (temp-32)*5/9;
    } 
    void display()
    {
        System.out.println("Converted temperature C= "+ctemp);
    }
}
class celsius extends Temperature
{
 public double ftemp;
void changeTemp()
{
  ftemp = (9*temp/5)+32;
}
void display()
{
    System.out.println("Converted temperature F= "+ftemp);
}
}
public class ConvertTemp
{
 public static void main(String[]args)
 {
     celsius c = new celsius();
     c.setTempData(0);
     c.changeTemp();
     c.display();
     fahrenheit f = new fahrenheit();
     f.setTempData(114);
     f.changeTemp();
     f.display();
 }
}
