import java.util.*;
class Array_Search_Unsorted {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter number size of the array: ");
        int n = SC.nextInt();
        System.out.println("Enter the Array: ");
        int[] arr = new int[n];
        for(int i =0 ; i<n; i++){
            arr[i] = SC.nextInt();
        }
        System.out.println("Enter the search Element :");
        int key = SC.nextInt();
        searchkey(arr, key);
        SC.close();
    }

    public static void searchkey(int[] arr, int key){
        boolean found = false;
        for(int i =0; i<arr.length; i++){
            if(arr[i] == (key)){
                System.out.println(key + " Is in the position: "+ i);
                found = true;
            }

        }
        if(!found){
            System.out.println(key + " is not available");
        }
    }

}
