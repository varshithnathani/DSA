public class MoveZeros {
    public void moveZeroes(int[] nums) {

        // using two pointer approach/.
        int slow =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[slow]=nums[i];
                slow++;
            }
        }
        // fill remaining with zeros
        while(slow<nums.length){
            nums[slow]=0;
            slow++;
        }
    }
}
