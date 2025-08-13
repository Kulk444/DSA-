import java.util.*;
public class Quicksort 
{
    public static int partition (int arr[],int low,int high)
    {
        int pivot=arr[high];
        int i=low-1;

        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i; //pivot index
    }
    public static void quicksort(int arr[],int low,int high)
    {
        if(low<high)
        {

            int pidx=partition(arr,low,high);

            quicksort(arr,low,pidx-1);
            quicksort(arr,pidx+1,high);
            
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the arrays");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        quicksort(arr,0,n-1);

        //print
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println();


    }
}
