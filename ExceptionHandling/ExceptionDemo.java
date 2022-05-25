// demonstrating the four options for exception handling
import java.util.*;
class Default // default throw and deafult catch mechanism
{
    public void printThis()
    {
        System.out.println("Value: "+3/0);
        System.out.println("Next line."); // this line of code will not work.
    }  
}
class DefaultandUser // default throw and user catch mechanism
{
    public void show()
    {
        try{
            int n;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a number (except 0)");
            n = s.nextInt();
            System.out.println("Value = "+ 4/n);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception = "+ e.getMessage());
        }
        System.out.println("Please don't enter 0!");
    }
}
class userThrowandDefault // user throw and default catch mechanism
{
  public void display()
  {
      int a[] = new int[4];
      int n;
      Scanner s = new Scanner(System.in);
      System.out.print("enter the index: ");
      n = s.nextInt();
      try{
         int i = a[n];
          throw new ArrayIndexOutOfBoundsException("Out of bound");
      }
      catch(NullPointerException e) { 
          e.getStackTrace();
      }
  }
}
class userthrowAndusercatch //user throw and user catch mechanism
{
    class Myexception extends Exception
    {
        Myexception(String str)
        {
            super(str);
        }
    }
    public void showthis()
    {
        try{
           int amount = 10000;
            int bal;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter an amount to withdraw");
            bal = s.nextInt();
                  if(bal>10000)
                  throw new Myexception("Insufficient balance!");  
                  System.out.println("new balance = "+ (amount-bal));
        }
          catch(Myexception e)
            {
                System.out.println(e.getMessage());
                System.out.println("Try again!");
            }
        }
}
class ExceptionDemo extends Default
{
    public static void main(String[]args)
    {
        Default d = new Default();
        d.printThis();
        DefaultandUser du = new DefaultandUser();
        du.show();
        userThrowandDefault ud = new userThrowandDefault();
        ud.display();
        userthrowAndusercatch uc = new userthrowAndusercatch();
        uc.showthis();
    }
}