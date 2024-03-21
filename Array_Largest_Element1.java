// Largest Element in the Array can be found in diffent ways 
        // In this use Iterative method that means Brute force approach

import java.util.*;
class Array_Largest_Element1 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = SC.nextInt();
        System.out.println("Enter the array: ");
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        longestArray(arr);
        SC.close();

    }
    public static void longestArray(int[] arr){
        int max = arr[0]; // Assuming 
        for(int i =0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max+" is the highest in the given Array");
    }
}
