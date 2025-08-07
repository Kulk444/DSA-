import java.util.*;
public class selectionsort {
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
    // time complexity=o(n^2)
      //selection sort

      for(int i=0;i<size-1;i++)
      {
        int smallest=i;
        for(int j=i+1;j<size;j++)
        {
        if(arr[smallest]>arr[j])
        {
            smallest=j;
        }
    }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        
        
      }
    
      printarray(arr);
    }
}
