import java.util.Scanner;
class deposit{
    public float termdeposit()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter time period(in years)");
        int n = ob.nextInt();
        System.out.println("Enter principle amount: ");
        float p = ob.nextFloat();
        System.out.println("Enter rate of interest: ");
        float r = ob.nextFloat();
        float f,f1;
        f = (1 + (r/100));
        f1 = f*p*n;
        return f1;
    }
    public float recurringdeposit()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Monthly Installment:");
        float p = ob.nextFloat();
        System.out.println("Enter rate of interest");
        float r = ob.nextFloat();
        System.out.println("Enter time period(in months)");
        int n = ob.nextInt();
        float f2;
        f2 =  (p * n + p * n*(n + 1) / 2 * r / 100 * 1 / 12);
        return f2;
    }
}
public class bankdeposit {
     public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1 for Term deposit\n2 for Recurring deposit");
        int ch = s.nextInt();
        switch(ch)
        {
            case 1: deposit d = new deposit();
           float f= d.termdeposit();
           System.out.println("Term deposit: " + f);
           break;
           case 2: deposit d1 = new deposit();
           float f2 = d1.recurringdeposit();
           System.out.println("Recurring deposit: " + f2);
           break;
           default : System.out.println("Incorrect option!");

        }
    }
}
