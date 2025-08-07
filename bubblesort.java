import java.util.*;
public class bubblesort {

    public static void printarray(int arr[])
    {
        System.out.println("The sorted array are:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of an ele");
      int size=sc.nextInt();

       int arr[]= new int[size];
      System.out.println("The arrays are");
      for(int i=0;i<size;i++)
      {
        arr[i]=sc.nextInt();
      }
     //time complexity= o(n^2)
      //bubble sort
      for(int i=0;i<size-1;i++)
      {
         for(int j=0;j<size-i-1;i++)
         {
            if(arr[j]>arr[j+1])
            {
                  //swap
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;

            }
         }
      }

           printarray(arr);
    }
    }
