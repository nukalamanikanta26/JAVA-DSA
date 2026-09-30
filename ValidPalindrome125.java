public class ValidPalindrome125 {
    public static void main(String[] args) {
    String s = "Amanapl,anacanalP*anama";
        System.out.println(validPalindrome(s));
    }
    static boolean validPalindrome(String s)
    {
        s=s.toLowerCase();
        int left =0;
        int right = s.length()-1;

        while(left<right)
        {
            if(Character.isLetterOrDigit(s.charAt(left)))
            {
                left++;
            } else if(Character.isLetterOrDigit(s.charAt(right)))
            {
                right--;
            }
            else if (s.charAt(left)!=s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


/*
*  VALID PALINDROME - LEETCODE 125
*  TIME COMPLEXITY = O(n)
*  SPACE COMPLEXITY =O(n) beacause .tolowercase()*/