import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
class TwoSum{
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result= solution(nums, target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] solution(int[] nums, int target){
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            int need = target - nums[i];
            if(mp.containsKey(need)){
                return new int[]{mp.get(need), i};
            }
            mp.put(nums[i],i);
        }

        return new int[]{};
    }
}