
/**
 * Write a program for a Double - Dimensional Array to input numbers
 * in a m*n matrix. Calculate and Print the sum of the numbers in 
 * each row and product of the numbers in each column. 
 */

import java.util.*;
class sum_product
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j,m,n,s=0,p=1,a[][];
        System.out.println("Enter size of matrix");
        m=sc.nextInt();
        n=sc.nextInt();
        a =  new int [m][n];
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
            s=0;
            for(j=0;j<n;j++)
            {
                s=s+a[i][j];
            }
            System.out.println("Sum of each row"+" "+(i+1)+"-"+s);
        }
        for(j=0;j<n;j++)
        {
            p=1;
            for(i=0;i<m;i++)
            {
                p=p*a[i][j];
            }
            System.out.println("Product of column"+ " "+(j+1)+"-"+p);
        }
    }
}
 