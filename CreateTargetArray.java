import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/create-target-array-in-the-given-order/
public class CreateTargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<nums.length; i++){
            list.add(index[i], nums[i]);
        }

        int[] newArr = new int[nums.length];
        for(int i =0; i<newArr.length; i++){
            newArr[i]= list.get(i);
        }

        return newArr;
    }
}

