package Basics;
import java.util.*;
public class primeno 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
     
        if(n<=1)
        {
            System.out.println("Not a prime:");
            return;
        }
        
        for(int i=2;i<=Math.sqrt(n);i++)
         
        {
            if(n%i==0)
            {
                System.out.println( n + " Not a prime no");
                return;
            }
        }

       System.out.println( n + " is a prime no");












    }
}
