import java.util.HashSet;

public class LongestSubString2Leetcode3 {
    public static void main(String[] args) {
    String s ="ababccdbe";
        System.out.println(longestSubstring(s));
    }
    static int longestSubstring(String s)
    {
        int len =0;
        int maxLen=Integer.MIN_VALUE;
        int left=0;
        HashSet<Character> set = new HashSet<>();
        for(int right=0;right<s.length();right++)
        {
            char c = s.charAt(right);

            while(set.contains(c))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            len = right-left+1;
            maxLen=Math.max(maxLen,len);

        }
        return maxLen;
    }
}

/*
 * LONGEST SUB STRING WITHOUT REPEATINGS CHARS - LEETCODE 3- SLIDING WINDOW - APPROACH 2
 *  TIME COMPLEXITY = O(n)
 *  SPACE COMPLEXITY = O(1) : since, in set only 26 eleemnts added irrespective of input*/