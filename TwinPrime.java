public class TwinPrime {
    public static void main(String[]args)
    {
        int i,j;
        System.out.println("Twin prime numbers are: ");
        for(i=3,j=i+2;i<=100;++i,j=i+2)
        {
            int flag=0,flag1=0;
            for(int k=2;k<i;k++)
            {
                if(i%k==0)
                flag=1;
            }
            for(int k=2;k<j;k++)
            {
                if(j%k==0)
                flag1=1;
            }
            if(flag==0 && flag1==0)
            System.out.print("{"+i+","+j+"}");
            else 
            continue;

        }
    }
}
