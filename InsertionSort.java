import java.util.Arrays;

public class InsertionSort {

    public static void main(String args[]){

        int[] nums = {74,5,9,73,03};
        System.out.println(Arrays.toString(nums));

        for (int i =1;i<nums.length;i++){

            int key = nums[i]; //5
            int j = i-1;

            while (j>=0&&nums[j]>key){ //74>5
                nums[j+1]= nums[j];//5 gets replaced with 74
                                    //
                j--;
                System.out.println("in while" + Arrays.toString(nums));
            }

            nums[j+1]=key;
            System.out.println("in for" + Arrays.toString(nums));

        }
        System.out.println(Arrays.toString(nums));
    }
}
