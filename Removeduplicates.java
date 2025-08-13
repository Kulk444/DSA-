package Basics;
import java.util.*;
public class Removeduplicates
 {
    public static void main(String[] args) 
    {
        //two pointer method means use of(i and j)
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();

        int arr[]=new int[n];
       System.out.println("Enter the array");
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
         //int j=0;

        // //if array is sorted use two pointer method
        // for(int i=0;i<arr.length-1;i++)
        // {
        //     if(arr[i]!=arr[i+1])
        //     {
        //         arr[j++]=arr[i];
        //     }
        // }
        // arr[j++]=arr[arr.length-1];

        // System.out.println("print the array without duplicates");
        // for(int i=0;i<j;i++)
        // {
        //     System.out.println(arr[i]+" ");
        // }

        

        //if array are unsorted the use Hashset
         Set<Integer>set=new LinkedHashSet<>();
          
         for(int i=0;i<arr.length;i++)
         {
            set.add(arr[i]);
         }
            System.out.println("array without duplicates: "+set);
    }
    
}

