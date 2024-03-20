// Bubble Sort ==> It iterate to the array and arrange them in the sequence order


import java.util.*;
class BubbleSort{
    public static void main(String[] args){
        // Scanner for user input
        Scanner SC = new Scanner(System.in);
        System.out.println("Please Enter the Size of the Array :");
        // n for size of the Array
        int n = SC.nextInt();
        System.out.println("Please Enter the Array :");
        int[] arr = new int[n];
        // Taking the Array details
        for(int i =0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        bubbleSort(arr);;
        SC.close();

    }

    public static void bubbleSort(int[] arr){
        for(int i =0; i<arr.length-1; i++){
            for(int j =0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        display(arr);

    }
    public static void display(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}