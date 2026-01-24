public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10,10,5};
        int result = SecondLargestOfArray(arr);
        System.out.println(result);
    }

    public static int SecondLargestOfArray(int[] nums){
        int maxVal = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i =0; i<nums.length; i++){
            if(nums[i] > maxVal){
                secondMax = maxVal;
                maxVal = nums[i];
            }else if(nums[i]>secondMax && nums[i] != maxVal){
                secondMax = nums[i];
            }
        }
        return secondMax;
    }
}
