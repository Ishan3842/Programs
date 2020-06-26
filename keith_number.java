
/**
 * Write a program to enter a number from the user
 * and check whether it is KEITH number or not.
 * HINT : [A KEITH Number is a number whose digits 
 *         when added and if the resulting number is 
 *         less than the number entered, then we add 
 *         the resulting number to the digits always
 *         exluding the 1st digit]
 * EXAMPLE : [ 197 is a KEITH Number.
 *             1+9+7=17
 *             9+7+17=33
 *             7+17+33=57
 *             17+33+57=107
 *             33+57+107=197]
 */

import java.util.*;
class keith_number
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int c=0,copy,s=0,i;
        copy=n;
        while(copy!=0)
        {
            copy=copy/10;
            c++;
        }
        int a[]=new int[c];
        copy=n;
        for(i=c-1;i>=0;i--)
        {
            a[i]=copy%10;
            copy=copy/10;
        }
        while(s<n)
        {
            s=0;
            for(i=0;i<c;i++)
            {
                s=s+a[i];
            }
            if(s!=n)
            {
                for(i=0;i<c-1;i++)
                {
                    a[i]=a[i+1];
                }
            }
            a[c-1]=s;
        }
        if(s==n)
            System.out.println( n +" "+ "is a Keith Number");
        else
            System.out.println( n +" "+ "is not a Keith Number");
    }
}

