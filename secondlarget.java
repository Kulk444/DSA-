package Basics;
import java.util.*;
public class secondlarget
 {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("the arrays are:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!= largest)
            {
                secondlargest=arr[i];
            }
        }
        System.out.println("second largest"+secondlargest);

    }
}
