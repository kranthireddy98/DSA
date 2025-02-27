import java.util.Arrays;

public class BubbleSort {


    public static  void main(String args[]){

        int nums[] = {6,4,4,9,7,20,1};

        //compare two values and swap values

        for (int i =0;i<nums.length;i++){
            for (int j =0;j<nums.length-i-1;j++){
                if(nums[j] > nums[j+1] ){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] =temp;
                }
            }
        }

        System.out.println(Arrays.toString(nums));

    }
}
