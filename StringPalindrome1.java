public class StringPalindrome1 {
    public static void main(String[] args) {
    String s ="madam";
        System.out.println(isStringPalindrome(s));
    }
    static boolean isStringPalindrome(String s)
    {
       int n = s.length();
        char[] rev = new char[s.length()];
        for (int i =n-1; i >=0 ; i--) {
        rev[i] = s.charAt(n-i-1);
        }
        String s2 = new String(rev);


        return s2.equals(s);
    }
}

    //BRUTE-FORCE
/* Time Complexity is O(n)
*  Space Complexity is O(n) since new char[] array is taken*/