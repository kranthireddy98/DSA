public class binarySearch {
    public  static void main(String args[]){

        int sortedArray[] = {5,6,7,8,9};

        int target = 9;

        int result = BinarySearch(sortedArray,target);
        System.out.println(result);
    }

    public static  int BinarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int steps = 0;
        while(left<=right){
            steps++;
            int mid = (left+right)/2;
            if (nums[mid] == target){
                System.out.println("Steps : " + steps);
                return mid;

            }else if (target > nums[mid]  ){

                left = mid+1;
            }else if (target < nums[mid]){

                right = mid-1;
            }
        }
        System.out.println("Steps : " + steps);
        return  -1;
    }
}
