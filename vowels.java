package Basics;
import java.util.*;
public class vowels 
{
    public static void main(String[] args)
     {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String name=sc.nextLine();
        name = name.toLowerCase();  //  'A'&'a ' are treated as same

          int vowels=0,consonants=0;

        for(int i=0;i<name.length();i++)
        {
            char ch=name.charAt(i);  //assign each char index to each letter 

            if(ch>='a' && ch<='z')  //check only for alphabets
            {
                if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o'|| ch=='u')
                {
                    vowels++;
                }
                else
                {
                    consonants++;
                }
            }
    }
    System.out.println("vowels"+vowels);
    System.out.println("consonants"+consonants);
}
}
