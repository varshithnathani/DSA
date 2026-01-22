import java.util.*;
public class ContainsDuplicates {
    // set will not allow duplicate values
    public static void main(String[] args){
        int[] arr = {1,2,3,4,2,5};
        Set<Integer> setVal = new HashSet<>();
        for(int i =0; i<arr.length; i++){
            if(setVal.contains(arr[i])){
                System.out.println(true+", Duplicate value: "+ arr[i]+ " index: "+i);
                return;
            }
            setVal.add(arr[i]);
        }
    }
}
