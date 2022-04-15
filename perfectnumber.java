public class perfectnumber {
    public static void main(String[]args)
    {
      // to find the perfect numbers between 1 to 100.
      System.out.println("Perfect numbers are: ");
        for(int num=6;num<=100;num++)
        {
            int sum=0;
            for(int i=1;i<num;i++)
            {
              if((num%i)==0)
              sum = sum + i;
            }
            if(sum==num)
            System.out.print(num +" ");
        }
    }
}
