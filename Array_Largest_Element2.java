// We are using the Inbuilt function to get the longest/ highest in the array

import java.util.*;
class Array_Largest_Element2 {
    public static void main(String[] args) {
       Scanner SC = new Scanner(System.in);
       System.out.println("Enter the Size if the Array :");
       int n = SC.nextInt(); 
       System.out.println("Enter Array Details :");
       int[] arr = new int[n];
       for(int i = 0; i<n; i++){
        arr[i] = SC.nextInt();
       }
       longestArray(arr);
       SC.close();        
    }
    public static void longestArray(int[] arr){
        Arrays.sort(arr);
        System.out.println("Largest Element : "+arr[arr.length-1]);
    }
}
