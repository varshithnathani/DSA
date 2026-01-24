public class StringPalindrome {
    public static void main(String[] args) {
        String s = "madam";
        System.out.println(palindrome(s));
    }
    public static boolean palindrome(String s){
        int left = 0;
        int right = s.length()-1;

        char[] ch = s.toCharArray();
        while(left < right){
            if(ch[left]!= ch[right]){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
}
