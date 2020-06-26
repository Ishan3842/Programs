
/**
 * Write a Program to enter a number by the user and check 
 * whether it is a Kaprekar number or not.
 * HINT:[ A Kaprekar number when squared and the resulted number when
 *        splitted by its digits , obtains the original number.]
 * EXAMPLE: [ 297*297 = 88209 = 88+209 = 297 ]
 */

import java.util.*;
class Kaprekar_number
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int sq=(n*n);          
        int copy=n,c=0,q=0,r=0,s=0; 

        while(copy>0)
        {
            c++;
            copy/=10;
        }

        r= sq%(int)(Math.pow(10,c));
        q= sq/(int)(Math.pow(10,c));
        s=(r+q);            

        if(s==n)
            System.out.println( n +" "+"is a Kaprekar Number");
        else
            System.out.println( n +" "+"is NOT a Kaprekar Number");
    }
}

