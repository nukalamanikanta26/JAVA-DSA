import java.util.HashSet;

public class LongestSubStringLeetcode3 {
    public static void main(String[] args) {
        String s = "ab";
        System.out.println(longestSubstringLength(s));
    }
    static int longestSubstringLength(String s)
    {
        int maxLength = Integer.MIN_VALUE;
        for (int i = 0; i < s.length() ; i++) {

            HashSet<Character> set = new HashSet<>();

            for (int j = i; j <s.length() ; j++) {

                char c = s.charAt(j);
                if(set.contains(c))
                {
                    break;
                }
                set.add(c);
                maxLength = Math.max(maxLength,j-i+1);
            }
        }
        return maxLength;
    }
}

/*
 * LONGEST SUB STRING WITHOUT REPEATINGS CHARS - LEETCODE 3- BRUTE FORCE - APPROACH 1
 *  TIME COMPLEXITY = O(n^2)
 *  SPACE COMPLEXITY = O(1) : since, in set only 26 eleemnts added irrespective of input*/