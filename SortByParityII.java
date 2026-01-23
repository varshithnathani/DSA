public class SortByParityII {
    public static void main(String[] args) {
        SortByParityII sbp2 = new SortByParityII();
        int[] arr = {4,2,5,7};
        int[] result = sbp2.sortArrayByParityII(arr);
        for(int val: result){
            System.out.print(val+" ");
        }
    }

    
    public int[] sortArrayByParityII(int[] nums) {

        int odd =1;
        int even =0;
        int n = nums.length;

        while(odd < n && even < n){

            if(nums[even]%2== 0){
                even+=2;
            }else if(nums[odd] %2 != 0){
                odd+=2;
            }else{
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd]=temp;
                even+=2;
                odd+=2;
            }
        }

        return nums;
        
    }
}

