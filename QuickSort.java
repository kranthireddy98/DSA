import java.util.Arrays;
import java.util.concurrent.ExecutorService;
public class QuickSort {

public static void main(String[] args){
        // Worst case it goes to n(log(n))
        // Divide and conquer -- Recursion
    //Pivot -- in most cases last value in the Array considered as Pivot
    //i -- positioning
    //j Tracking
    //low and high
    int arr[] = {1,5,9,2,4,5};

    quickSort(arr,0,arr.length-1);

    System.out.println(Arrays.toString(arr));


}

    private static void quickSort(int[] arr, int low, int high)
    {
        if (low<high)
        {
            int pi = partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);

        }
    }

    private static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = low-1;

        for (int j =low;j<high;j++)
        {
            if(arr[j] <= pivot)
            {
            i++;
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j] = temp;

            }
        }
        int temp = arr[i + 1];
        arr[i+1]=arr[high];
        arr[high] = temp;

        return i+1;
    }


}
