public class Armstrong {
    public static void main(String[]args)
    {
      int rem,temp;
      System.out.println("Armstrong numbers are: ");
      for(int i=1;i<=1000;i++)
      {
          temp=i;
          int sum=0;
          while(temp!=0)
          {
              rem = temp%10;
              sum+=rem*rem*rem;
              temp=temp/10;
          }
          if(sum==i)
          System.out.print(i+" ");
      }
    }
}
