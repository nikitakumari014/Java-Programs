//question no-3(b)
import java.util.*;
class account
{
    private int bal;
    public account(int bal)
    {
        this.bal = bal;
       
    }
    public boolean isSufficientbalance(int amt)
    {
      if(bal > amt)
      return true;
      else return false; 
    }
    public void withdraw(int amt)
    {
        bal = bal-amt;
        System.out.println("Withdrawl money is: "+amt);
        System.out.println("Current balance is: "+bal);
    }

    }
  class customer extends Thread
{
    private account acc;
    private String name;
    public customer(account acc,String name)
    {
        this.acc = acc;
        this.name = name;
    }
   synchronized public void run() //synchronized method.
    {
        Scanner ob = new Scanner(System.in);
        System.out.println(name +","+ "Enter amount to withdraw: ");
        int amt;
        amt = ob.nextInt();
        if(acc.isSufficientbalance(amt))
        {
            System.out.println(name);
            acc.withdraw(amt);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}
public class example3{
    public static void main(String[]args)
    {
        account a1 = new account(1000);
        customer c1 = new customer(a1,"Rohan");
        customer c2 = new customer(a1,"Mohan");
        Thread t1 = new Thread(c1) ;
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}
