package Basics;
import java.util.*;
public class Stringpalindrome
 {
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string");
        String name=sc.nextLine();

        for(int i=0;i<name.length()/2;i++)
        {
            if(name.charAt(i)!=name.charAt(name.length()-1-i))
            {
                System.out.println("Not palindrome:");
                return;
            }
        }
        System.out.println("Palindrome");

    }
}
