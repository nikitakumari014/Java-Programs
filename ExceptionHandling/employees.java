import java.util.*;
class myexception extends Exception{
myexception(String str)
{
    super(str);
}
}
class employees
{
    private int employee_id;
    private String name;
    private int dept_id;
    public static int flag=0;
  public void get_details()
  {
      Scanner s = new Scanner(System.in);
      try{
      System.out.println("Enter Name: ");
      name = s.nextLine();
      if(!(name.charAt(0)>='A' && name.charAt(0) <='Z'))
      throw new myexception("First letter must be capital");
      for(int i=1;i<name.length();i++)
          {
              if(!(name.charAt(i)>=97 && name.charAt(i)<=122 || name.charAt(i)==' '))
              throw new myexception("This name type is invalid");
          }
      }
      catch(myexception e)
      {
          System.out.println(e.getMessage());
          flag=1;
      }
      try{
      System.out.println("Enter Employee id: ");
      employee_id = s.nextInt();
    if(!(employee_id >=2001 && employee_id<=5001))
    throw new myexception("Invalid employee id");
      }
      catch(myexception e)
      { System.out.println(e.getMessage());
        flag=1;
      }
      try{
      System.out.println("Enter Department id: ");
      dept_id = s.nextInt();
      if(!(dept_id >=1 && dept_id<=5))
      throw new myexception("Invalid department id");
      }
      catch(myexception e)
      {
        System.out.println(e.getMessage());
        flag=1;
        
      }
  }
  public void show_details()
  {
      System.out.println("Name of the employee: "+name);
      System.out.println("Employee id: "+employee_id);
      System.out.println("Department id: "+dept_id);
  }
  public static void main(String[]args)
  {
      employees e = new employees();
      e.get_details();
      if(flag==0)
      e.show_details();
      else System.out.println("Try again, and enter the information correctly.");
  }
}