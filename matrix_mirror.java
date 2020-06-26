
/**
 * Write a program for a Double Dimensional Array to input numbers
 * in a m*n matrix and print the mirror reflection of the matrix 
 * horizontally.
 */

import java.util.*;
class matrix_mirror
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j,m,n,temp,a[][];
        System.out.println("Enter size of matrix");
        m=sc.nextInt();
        n=sc.nextInt();
        a=new int[m][n];
        for(i=0;i<m;i++)
        {
            System.out.println("Enter numbers");
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n/2;j++)
            {
                temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        System.out.println("Mirror Reflection:-");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

