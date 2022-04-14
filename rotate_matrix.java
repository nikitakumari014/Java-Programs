import java.util.*;
public class rotate_matrix {
    public static void main(String[]args){
    int m;
    Scanner ob = new Scanner(System.in);
    Scanner ob1 = new Scanner(System.in);
    Scanner ob2 = new Scanner(System.in);
    System.out.println("Enter number of rows/columns");
    m = ob.nextInt();
    while(m<=2 || m>10){
    System.out.println("Invalid Input,Enter Again.");
    }
    int A[][] = new int [m][m];
    System.out.println("Enter matrix of "+m+"*"+m);
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<m;j++)
        {
            A[i][j] = ob1.nextInt();
        }
    }
    System.out.println("Original Matrix: ");
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<m;j++)
        {
            System.out.print(A[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("Matrix after rotation: ");
    for(int j=0;j<m;j++)
    {
        for(int i=m-1;i>=0;i--)
        {
            System.out.print(A[i][j]+" ");
        }
        System.out.println();
    }
    int add=0;
    add = A[0][0] + A[0][m-1] + A[m-1][0] + A[m-1][m-1];
    System.out.println("Sum of corner elements: "+add);
}

}
