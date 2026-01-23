public class MinimumSwapsEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int result = swap(arr);
        System.out.println(result);
    }

    public static int swap(int[] arr){
        int minSwaps = 0;
        int right = arr.length -1;
        int left = 0;

        while(left<right){

            // move left until odd found
            while(left < right && arr[left] %2 ==0){
                left++;
            }
            // move right until even found
            while(left < right && arr[right] %2 !=0){
                right--;
            }

            // swap left with right (odd with even)
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
                minSwaps++;
            }
        }

        return minSwaps;
    }
}
