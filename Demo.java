public class Demo {
    public static void main(String[] args) {
        int[] nums = {5,7,9,11,13};
        int[] dum = new int[10000];
        int target = 11;

        int result = linearSearch(nums,target);

        int binResult = binsarySearch(nums,target);

        System.out.println(result + " " + binResult);
    }

    private static int binsarySearch(int[] nums, int target) {

        int left =0;
        int right = nums.length-1;

        while(right>=left){
            int mid = (left+right) /2;

            if(nums[mid] == target){
                return mid;
            }
            else if (target>nums[mid]){
                left=mid + 1;

            }else {
                right=mid -1 ;
            }


        }
        return -1;

    }

    private static int linearSearch(int[] nums, int target) {

        for(int i =0;i<nums.length;i++){
            if(nums[i] == target)
                return i;
        }
        return -1;
    }
}
