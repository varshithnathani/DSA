/*
 * Implementing Largest number in the given three numbers   
 */

import java.util.*;
class Largestof3 {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("Please Enter numbers :");
        int[] arr = new int[3];
        for(int i = 0; i < 3; i++){
            arr[i] = SC.nextInt();
        }
        longest(arr);
        SC.close();

    }
    public static void longest(int[] arr){
        int maxNum = arr[0]; // assuming arr[0] is the highest 
        if(arr[1]> maxNum){
            maxNum = arr[1];
        }
        if(arr[2] > maxNum){
            maxNum = arr[2];
        }
        System.out.println("Longest number :"+maxNum);
    }
}
