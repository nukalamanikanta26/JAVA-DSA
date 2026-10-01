public class StringPalindrome2 {
    public static void main(String[] args) {
        String s ="madam";
        System.out.println(isStringPalindrome(s));
    }
    static boolean isStringPalindrome(String s)
    {
       int left = 0;
       int right = s.length()-1;

       while (left <right)
       {
           if(s.charAt(left)==s.charAt(right))
           {
               left++;
               right--;
           }
           else
               return false;
       }
       return true;
    }
}

//TWO_POINTER
/* Time Complexity is O(n)
 *  Space Complexity is O(1) since no extra String is used*/