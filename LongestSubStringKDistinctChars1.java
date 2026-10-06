import java.util.HashSet;

public class LongestSubStringKDistinctChars1 {
    public static void main(String[] args) {
        String s = "araaci";
        int k =2;
        System.out.println(longestSubstringLenKchars(s,k));
    }
    static int longestSubstringLenKchars(String s,int k)
    {
        int maxLen= Integer.MIN_VALUE;

        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = i; j <s.length() ; j++)
            {
                set.add(s.charAt(j));
                if(set.size()>k)
                {
                    break;
                }
                maxLen=Math.max(maxLen,j-i+1);
            }
        }
        return maxLen;
    }
}

/*
 * LONGEST SUB STRING LEN WITH ATMOST K DISTINCT CHARS - BRUTE FORCE - APPROACH 1
 *  TIME COMPLEXITY = O(n^2)
 *  SPACE COMPLEXITY = O(1) : since, in set only 26 eleemnts added irrespective of input*/