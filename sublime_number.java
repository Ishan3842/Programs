
/**
 * Write a program to print all the SUBLIME numbers 
 * in between a given range of numbers. 
 * HINT : [ A Sublime number is a number whose number 
 *          of factors and sum of factors, both are 
 *          a perfect number]
 * EXAMPLE : [  12 is a SUBLIME number.
 *              No. OF FACTORS = 6
 *              SUM OF FACTORS = 28
 *              NOW, 6 & 28 are perfect numbers.
 *              So,12 is a sublime number,]
 **/

import java.util.*;
class sublime_number
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range of numbers");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int i,j,c=0,s=0, count=0;
        for(i=m;i<=n;i++)
        {
            c=0;
            s=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                    s=s+j;
                }
            }
            if( perfect(c) && perfect(s) )
            {
                count ++;
                System.out.println( i + " " +"is a sublime number");
            }
        }
        if (count == 0)
            System.out.println("No sublime Numbers are present in this range");
    }

    boolean perfect(int a)
    {
        int s=0;
        for(int i=1;i<=a/2;i++)
        {
            if(a%i==0)
                s=s+i;
        }
        if(s==a)
            return true;
        return false;
    }
}

