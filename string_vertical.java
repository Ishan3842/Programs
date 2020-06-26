
/**
 * Write a program to input N Strings from the user.
 * Print all the string in vertical format.
 * 
 * EXAMPLE:-
 * N=4     home
 *         phone
 *         cutlery
 *         books
 * OUTPUT :-
 *  
 *  h  p  c  b
 *  o  h  u  o
 *  m  o  t  o
 *  e  n  l  k
 *     e  e  s
 *       r 
 *       y 
 */

import java.util.*;
class string_vertical
{ 
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        int i,j,N,ln=0;
        System.out.println("Enter value of N");
        N=sc.nextInt();
        String str[]=new String[N];
        System.out.println("Enter Strings");
        for(i=0;i<N;i++)
        {
            str[i]=sc.next();
            if(str[i].length()>ln)
            {
                ln=str[i].length();
            }
        }
        for(i=0;i<N;i++)
        {
            for(j=str[i].length();j<ln;j++)
            {
                str[i]=str[i] + " ";
            }
        }
        for(i=0;i<ln;i++)
        {
            for(j=0;j<N;j++)
            {
                System.out.print(" "+str[j].charAt(i)+" ");
            }
            System.out.println();
        }
    }
}

