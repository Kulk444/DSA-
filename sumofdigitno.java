package Basics;
import java.util.*;
public class sumofdigitno
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the number:");
         int n=sc.nextInt();
         

         int sum=0;
       
        while(n>0)
        {
            sum += n % 10;
            n =n/ 10;
        }

        System.out.println("Sum of digits" + sum);

  }
    }
    
