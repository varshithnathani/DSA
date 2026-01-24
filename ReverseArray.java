public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverseArray(array);
        
        // Print reversed array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

   public static void reverseArray(int[] nums){
    int left = 0;
    int right = nums.length - 1;
    while(left < right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right--;
    }
   }
}