

public class LinearSearch {


    public  static void main(String args[]){

        int sortedArray[] = {5,6,7,8,9,11,98,126,755};

        int target = 8;

        int result = linearSearch(sortedArray,target);
        System.out.println(result);
    }

    public static  int linearSearch(int[] nums, int target){
        int steps = 0;
        for (int i=0;i<nums.length;i++){
            steps++;
            if (nums[i] == target){

                System.out.println("Steps : " + steps);
                return i;
            }
        }
        System.out.println("Steps : " + steps);
        return  -1;

    }
}
