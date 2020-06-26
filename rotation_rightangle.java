
/**
 * Write a program for a Double Dimensional Array to input numbers
 * in a m*n matrix and rotate the matrix at right angle and 
 * print the rotated matrix.
 */

import java.util.*;
class rotation_rightangle
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j,m,n,a[][],b[][];
        System.out.println("Enter size of matrix");
        m=sc.nextInt();
        n=sc.nextInt();
        a= new int[m][n];
        b= new int[n][m];
        for(i=0;i<m;i++)
        {
            System.out.println("Enter numbers");
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                b[i][j]=a[m-j-1][i];
            }
        }
        System.out.println("Rotated Matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(b[j][i]+"\t");
            }
            System.out.println();
        }
    }
}

