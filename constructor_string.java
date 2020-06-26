
/**
 * Define a class constructor_string to perform thwe following operations :-
 * 
 * DATA MEMBERS:-
 * String text;
 * int countand,countan,len;
 * 
 * MEMBER METHODS:-
 * 1. constructor_string() - Default constructor to initialize values
 * 2. void accept() - to input sentence from the user
 * 3. void checkandfreq() - to the count the frquency of the word "and" from 
 *                        the sentence "text"
 * 4. void checkandfreq2() - to count the frequency of the word "an" from the 
 *                        sentence "text"
 * 5. void display() - tp print the frequency of the word "and" and the word "an"
 * 6. void main() - to create an object of the class and call the above member methods
 */

import java.util.*;
class constructor_string
{
    String text;
    int countand,countan,len;
    constructor_string()
    {
        text="";
        countand=0;
        countan=0;
        len=0;
    }

    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        text=sc.nextLine();
        text= text.trim()+" ";
        len=text.length();
    }

    void checkandfreq()
    {
        int i;
        char ch;
        String word="";
        for(i=0;i<len;i++)
        {
            ch=text.charAt(i);
            if(ch!=' ')
            {
                word=word+ch;
            }
            else
            {
                if(word.equalsIgnoreCase("and"))
                    countand++;
                word="";
            }
        }
    }

    void checkandfreq2()
    {
        int i;
        char ch;
        String word="";
        for(i=0;i<len;i++)
        {
            ch=text.charAt(i);
            if(ch!=' ')
            {
                word=word+ch;
            }
            else
            {
                if(word.equalsIgnoreCase("an"))
                    countan++;
                word="";
            }
        }
    }

    void display()
    {
        System.out.println("Frequency of and :"+countand);
        System.out.println("Frequency of an :"+countan);
    }

    void main()
    {
        constructor_string obj = new constructor_string();
        obj.accept();
        obj.checkandfreq();
        obj.checkandfreq2();
        obj.display();
    }
}

 