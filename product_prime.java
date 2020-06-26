
/**
 * Write a program to print all the composite numbers
 * in between range of two numbers entered by the user
 * which are made by the PRODUCT OF TWO PRIME NUMBERS.
 * EXAMPLE :   RANGE --- 10 TO 100
 * OUTPUT  :   33(11*3) 34(17*2) 35(7*5) 
 */

import java.util.*;
class product_prime
{
    Scanner sc = new Scanner(System.in);
    boolean prime(int n)
    {
        int i;
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }

    boolean composite (int n)
    {
        int i;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                if(prime(i) && prime (n/i))
                    return true;
            }
        }
        return false;
    }

    public void main()
    {
        int m,a;
        System.out.println("Enter range of numbers");
        m=sc.nextInt();
        a=sc.nextInt();
        System.out.println("\n\n");
        for(int i=m+1;i<a;i++)
        {
            if (!prime(i) && composite(i))
            {
                if (composite(i) && composite(i+1) && composite(i+2))
                {
                    System.out.println (i + " "+ (i+1) + " " + (i+2));
                }
            }
        }
    }
}

     