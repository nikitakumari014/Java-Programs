import java.util.*;
class nonnegative extends Exception{
    nonnegative(String str)
    {
        super(str);
    }
}
public class Mycalculator {
    public void power(int n, int p)
    {
        try{
            int ans=1;
            if(n<=0 || p<0)
            throw new nonnegative("n and p should be non-negative and not equal to 0");
            if(p==0)
            System.out.println("Answer: "+ans);
            for(int i=1;i<=p;i++)
            {
                ans = ans*n;
            }
            System.out.println("Answer: "+ans);
        }
        catch(nonnegative np)
        {
            System.out.println(np.getMessage());
        }

    }
    public static void main(String[]args)
    {
        Mycalculator m = new Mycalculator();
        System.out.println("Enter a number and a power: ");
        int a,b;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        m.power(a, b);
    }
}
