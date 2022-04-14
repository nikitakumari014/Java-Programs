import java.util.*;  
public class zigzagarray 
{   
public static void zigZag(int arr[])  
{  
boolean flag = true;  
int temp =0;   
for (int i=0; i<=arr.length-2; i++)  
{  
if (flag)  
{  
if (arr[i] > arr[i+1])  
{   
temp = arr[i];  
arr[i] = arr[i+1];  
arr[i+1] = temp;  
}  
}  
else  
{  
if (arr[i] < arr[i+1])  
{  
temp = arr[i];  
arr[i] = arr[i+1];  
arr[i+1] = temp;  
}  
}  
if(flag==true)  
flag=false;  
else  
flag=true;  
}  
}  
public static void main(String args[])  
{  
    int m;
    Scanner s = new Scanner(System.in);
    m = s.nextInt();
int arr[] = new int[m];
for(int i=0;i<m;i++)
arr[i] = s.nextInt();  
zigZag(arr); 
for(int i=0;i<m;i++)
System.out.print(arr[i] + " ") ;

 
}  
}  