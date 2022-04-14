import java.util.Scanner;
public class replace {
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int m;
        System.out.println("Enter a number");
        m= s.nextInt();
        String s1 = Integer.toString(m);
        String s2="";
       for(int i=0;i<s1.length();i++)
       {
           char ch = s1.charAt(i);
           if(ch=='0')
           s2 = s2 + '1';
           else 
           s2 = s2 +ch;   
       }
       int s3 = Integer.parseInt(s2);
       System.out.println("Output: "+s3);
    }
}
