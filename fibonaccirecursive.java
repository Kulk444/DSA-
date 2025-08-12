package Basics;
import java.util.*;
public class fibonaccirecursive
 {
    public static int recursive(int no)
    {
      if(no==0 )
      {
        return 0;
      }
      else if(no==1)
      {
        return 1;
      }
      else
      {
      return  recursive (no-1) + recursive(no-2);
      }
      


    }


    public static void main(String[] args) 
    {
        
     Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter a number");
      int no=sc.nextInt();

System.out.print("Fibonacci series: ");
        for (int i = 0; i < no; i++) {
            System.out.print(recursive(i) + " ");
        }
    }
    
}
