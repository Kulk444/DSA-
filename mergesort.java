import java.util.*;

public class mergesort {
    //  time complexity (n logn)
    public static void conquer(int arr[], int first, int mid, int last) {
        int merged[] = new int[last - first + 1];
        int idx1 = first;
        int idx2 = mid + 1;
        int x = 0;

        //o(n) conquer
        while (idx1 <= mid && idx2 <= last) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= last) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = first; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int first, int last) {
        if (first >= last) {
            return;
        }

//o(logn) divide
        int mid = first + (last - first) / 2;

        divide(arr, first, mid);  
        divide(arr, mid + 1, last);
        conquer(arr, first, mid, last);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        divide(arr, 0, n - 1);

        System.out.println("The sorted array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
