package Basics;
import java.util.*;
public class factorialrecursive 
{
  public static int recursive(int n)
  {
    if(n==0 || n==1)  //0!=1  ,  1!=1
    {
        return 1;  
    }
    else
    {
          return n * recursive(n-1);//recursive method
    }//here nis greater than 1
  }

 public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int no=sc.nextInt();
    
    

    int result=recursive(no);
    System.out.println("Factorial:"+result);
    
     }
}
