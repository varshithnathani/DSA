// https://leetcode.com/problems/sort-array-by-parity/description/
public class SortByParity {
    public static void main(String[] args) {
        SortByParity sbp = new SortByParity();
        int[] arr = {3,1,2,4};
        int[] result = sbp.sortArrayByParity(arr);
        for(int val: result){
            System.out.print(val+" ");
        }
    }
    public int[] sortArrayByParity(int[] nums) {
        int right = nums.length-1;
        int left = 0;

        while(left< right){
            // move until you get odd from left
            while(left < right && nums[left] %2==0){
                left++;
            }

            // move umtil you get even from right
            while(left < right && nums[right] %2 != 0){
                right --;
            }

            // swap
            if(left< right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

        return nums;

    }
}
