import java.util.Arrays;
public class ArrayDemo
{
    public void arrayfunc(int a[],int key)
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i] + a[j] ==key)
                System.out.println(a[i]+"+"+a[j]+"="+key);
            }
        }
    }
    public void arrayfunc(int a[],int p,int b[],int q)
    {
        int w =p+q;
        int m=0,l=0;
        int c[]=new int[w];
        for(int i=0;i<p;i++){
        c[m]=a[i];
        m++;
    }
    for(int j=0;j<q;j++)
    {
        c[m]=b[j];
        m++;
    }
    for(int k=0;k<m-1;k++)
    {
       for(int z=k+1;z<m;z++)
       {
           if(c[k]>c[z]) {
            int temp=c[k];
            c[k]=c[z];
            c[z]=temp;
           }
        }
       
    }
    for(int i=0;i<p;i++)
    {
        a[i]=c[l];
        l++;
    }
    for(int j=0;j<q;j++)
    {
        b[j]=c[l];
        l++;
    }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
    public static void main(String[]args)
    {
        int a[]=new int[]{4,6,5,-10,8,5,20};
        int arr[]=new int[]{1,5,6,7,8,10};
        int b[]=new int[]{2,4,9};
        ArrayDemo ad = new ArrayDemo();
        ad.arrayfunc(a, 10);
        ad.arrayfunc(arr, 6,b,3);
    }
}