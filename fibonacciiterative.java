package Basics;
import java.util.*;
public class fibonacciiterative
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
      int n=sc.nextInt();

      int first=0,second=1;
        System.out.print("fb series " + first + " " + second);

      for(int i=2;i<n;i++)
      {
      int next=first+second;
      System.out.print(" "+next);
      first=second;
      second=next;
      }

     //System.out.print("fb series"+ first +" "+second);








    }
}
