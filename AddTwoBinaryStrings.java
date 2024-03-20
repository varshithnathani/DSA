import java.util.*;
class AddTwoBinaryStrings {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Please Enter the Binary String-1: ");
        String s1 = SC.next();
        System.out.println("Please Enter the Binary String-2: ");
        String s2 = SC.next();
        add_two_binary(s1, s2);
        SC.close();

    }
    public static void add_two_binary(String s1, String s2){
        int num1 = Integer.parseInt(s1, 2); // s1 is a binary string and 2 is radix as binary
        int num2 = Integer.parseInt(s2, 2); // s2 is a binary string and 2 is radix as binary
        int sum = num1 + num2;
        //System.out.println(sum);
        String total = Integer.toBinaryString(sum); // converting sum into binary string 
        System.out.println(total);

    }
}
