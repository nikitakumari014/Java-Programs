import java.util.Scanner;
class ElectricBill
{
   private int cust_no,units;
   private String cust_name;

   public void getdata(int n,String name,int units)
   {
       cust_no = n;
       cust_name = name;
       this.units= units;
   }
   public void calcbill()
   {
       if(units<=100)
       units= units*1;
       else if(units>100 && units<=200)
       units = (units-100)*2 + 100;
      else if(units>200 && units<=400)
      units = (units-200)*3 + (units-100)*2 + 100;
      else 
      units = (units-400)*5+(units-200)*3 + (units-100)*2 + 100;
    
   }
   public void show()
   {
       System.out.println("Total bill= "+units);
   }
}
public class electricity
{
    public static void main(String[]args)
    {
        ElectricBill e = new ElectricBill();
        System.out.println("Enter number of users: ");
        Scanner s = new Scanner(System.in);
        String name;
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter details: ");
        for(int i=0;i<n;i++)
        {
            System.out.print((i+1)+":"+"Number= ");
            int no = s.nextInt();
            s.nextLine();
            System.out.print((i+1)+":"+"Name= ");
            name = s.nextLine();
            System.out.print((i+1)+":"+"Units= ");
            int u = s.nextInt();
            e.getdata(no, name, u);
            e.calcbill();
            e.show();
        }
    }
}