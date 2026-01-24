import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/shuffle-the-array/
public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        // using ArrayList
        
        List<Integer> list = new ArrayList<>();

        for(int i =0; i<n; i++){
            list.add(nums[i]);
            list.add(nums[i+n]);
        }
        int[] newArr = new int[nums.length];
        for(int i =0; i<newArr.length; i++){
            newArr[i]= list.get(i);
        }

        return newArr;
    }

}
