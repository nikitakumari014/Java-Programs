import java.util.*;
class mutliplecatch{
   private int a[] = {3,5,6,1,9,7,80};
   public void show(int n)
   {
       try{
           if(n<0 && n>7)
           throw new ArithmeticException("Exception raised");
           System.out.println("Value from the array: "+a[n]);
       }
       catch(NullPointerException e)
       {
           System.out.println(e.getMessage());
       }
       catch(ArithmeticException ae)
       {
        System.out.println(ae.getMessage());
       }
       catch(ArrayIndexOutOfBoundsException ai)
       {
        System.out.println(ai.getMessage());
       }
   }
public static void main(String[]args) {
    mutliplecatch m = new mutliplecatch();
    System.out.println("Enter any index from 0 to 6");
    int n;
    Scanner s = new Scanner(System.in);
    n  = s.nextInt();
    m.show(n);
}
}
