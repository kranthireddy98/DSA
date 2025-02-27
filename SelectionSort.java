import java.util.Arrays;

public class SelectionSort {

    public  static  void main(String args[]){

        //Reduce the Number of Swapping as compared to Bubble Sort
        // move minimum value to start
        int nums[] = {6,4,9,7,20,1};
        int size = nums.length;
        int  minIndex = -1;
        int temp;
        for (int i= 0;i<size-1;i++){
              minIndex = i;
            for (int j = i+1;j<size;j++){
                if(nums[minIndex] > nums[j]){
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] =temp;
            System.out.println(Arrays.toString(nums));
        }

        System.out.println(Arrays.toString(nums));
    }
}
