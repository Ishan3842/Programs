
/**
 * Write a program to enter a sentence and count the number
 * of times a particular word occurs in it. Display
 * the number of times that particular word occurs.
 */

import java.util.*;
class string_appearence
{
    public void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = sc.nextLine();
        str = str +" ";
        int len=str.length();
        System.out .println("Enter a word to be searched ");
        String word=sc.nextLine();
        char ch;
        int c=0;
        String b="";
        for(int i=0;i<len;i++)
        {
            ch=str.charAt(i);
            if(ch!=' ')
            {
                b=b+ch;
            }
            else
            {
                if(b.equals(word))
                    c++;
                b="";
            }
        }
        System.out.println("Frequency of the word :"+ c);
    }
}