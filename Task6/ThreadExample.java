// question no-1
import java.util.*;
 class CSthread extends Thread
   {   
       public void run(){
     System.out.println("Thread name: CSThread");
     System.out.println("Thread CS is running");
     try
       {
     Thread.sleep(500);
       }
       catch(InterruptedException e)
       {
           System.out.println(e.getMessage());
       }
   }
}
   class ITthread extends Thread
   {
       public void run()
       {
           System.out.println("Thread name: ITThread");
           System.out.println("Thread It is running");
           try{
               Thread.sleep(500);
           }
           catch(InterruptedException e)
           {
               System.out.println(e.getMessage());
           }
       }
   }
class ThreadExample{
public static void main(String[]args)
{
    CSthread c = new CSthread();
    ITthread i = new ITthread();
    c.start();
    i.start();
}
}