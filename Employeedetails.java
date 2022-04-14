class Employee {
    private String name;
    public int id,salary;
    public void displayInfo(String n,int id,int salary)
    {
        name = n;
        this.id = id;
        this.salary = salary;
        System.out.println("Name: "+name);
        System.out.println("Id "+id);
    }
}
class SalaryCalculator extends Employee{
 private int hra,da,pf,grossalary;
 public void grossCal(int h,int d,int p)
 {
     hra = h;
     da = d;
     pf = p;
     grossalary = salary + hra + da + pf;
 }
 public void showSalarySlip()
 {
    System.out.println("Basic Salary: "+salary);
    System.out.println("Hra: "+hra);
    System.out.println("Da: "+da);
    System.out.println("Pf: "+pf);
    System.out.println("Gross Salary: "+ grossalary);
 }
}
public class Employeedetails {
    public static void main(String[]args)
    {
       SalaryCalculator e = new SalaryCalculator();
       e.displayInfo("Rohan Kumar",2002219,98000);
       e.grossCal(3000, 6540, 4500);
       e.showSalarySlip();
       
    }
}
