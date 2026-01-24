// https://leetcode.com/problems/concatenation-of-array/description/
import java.util.*;
public class ConcatinationOfArray {

    public static void main(String[] args) {
        int[] arr = {1,2,2};

        List<Integer> list = new ArrayList<>();
        for(int num: arr) list.add(num);
        for(int num: arr) list.add(num);

        int[] newArr = new int[list.size()];
        for(int i =0; i<newArr.length; i++){
            newArr[i]= list.get(i);
        }

        System.out.println(Arrays.toString(newArr));
    }    
}
