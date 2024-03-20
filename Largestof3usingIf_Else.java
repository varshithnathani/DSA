/*
    Implementing Largest number in the given three numbers  
    
    Approach: If- else
 */
import java.util.*;
class Largestof3usingIf_Else {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Number 1: ");
        int num1 = SC.nextInt();
        System.out.println("Number 2 :");
        int num2 = SC.nextInt();
        System.out.println("Number 3");
        int num3 = SC.nextInt();
        longest(num1, num2, num3);
        SC.close();
    }
    public static void longest(int num1, int num2, int num3){
        // Comparing num1 with num2 and num3
        if(num1 >= num2 && num1 >= num3 ){
            System.out.println("Longest number is "+num1);
        }
        // comparing num2 with num 1 and num3
        else if(num2 >= num1 && num2 >= num3){
            System.out.println("Longest number is "+num2);
        }else{
            // in this after comparing num1 and num2 with other 
            // and if it not there in num1 and num2 then Ans = num3
            System.out.println("Longest number is "+num3);
        }
    }
}
