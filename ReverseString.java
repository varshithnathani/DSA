public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseString(s)); 

    }

    public static String reverseString(String s){
        char[] ch = s.toCharArray();

        int left = 0;
        int right = s.length()-1;

        while(left< right){
            char ch1 = ch[left];
            ch[left] = ch[right];
            ch[right] = ch1;
            left++;
            right--;
        }

        return new String(ch);

    }
}
