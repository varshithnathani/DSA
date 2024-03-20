import java.util.*;
class PrimeNumber {
    static int num = 2;
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        int n = SC.nextInt();
        isprime(n);
        if(isprime(n)){
            System.out.println("Prime");
        }else{
            System.out.println("Not a prime number");
        }
        SC.close();
    }
    public static boolean isprime(int n){
        if(n == 0 || n ==1){
            return false;
        }
        if(n == num){
            return true;
        }
        if(n % num == 0){
            return false;
        }
        num++;
        return isprime(n);
    }
}
