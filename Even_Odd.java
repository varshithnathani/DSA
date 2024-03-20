import java.util.*;
class Even_Odd {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Please Enter a number :");
        int n = SC.nextInt();
        evenOdd(n);
        SC.close();
    }
    public static void evenOdd(int n){
        if(n % 2 == 0){
          System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        
    }
}
