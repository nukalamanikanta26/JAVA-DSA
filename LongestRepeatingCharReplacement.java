/*
Longest Repeating Character Replacement -- leetcode 424

 Given a string s (uppercase English letters) and an integer k, you can replace at most k characters
 in the string with any other uppercase letter. Return the length of the longest substring
 containing the same letter after performing at most k replacements.
* */

public class LongestRepeatingCharReplacement {
    public static void main(String[] args) {
    String s = "AABABB";
    int k =1;
        System.out.println(longestRepeatingCharReplacement(s,k));
    }
    static int longestRepeatingCharReplacement(String s,int k)
    {
        int maxLen =0;
        for (int i = 0; i < s.length(); i++)
        {
          int[] count = new int[26];
          int maxfreq =0;
            for (int j = i; j < s.length(); j++)
            {
              int index = s.charAt(j)-'A';
              count[index]+=1;

              maxfreq = Math.max(maxfreq,count[index]);
              int replacement = (j-i+1) - maxfreq;

              if(replacement>k)
              {
                  break;
              }
              maxLen = Math.max(maxLen,j-i+1);
            }
        }
        return maxLen;
    }
}


/*
 * LONGEST REPEATING CHARACTER REPLACEMENT - BRUTEFORCE - APPROACH 1
 *  TIME COMPLEXITY = O(n^2)
 *  SPACE COMPLEXITY = O(26) : since, in count stores  only 26 elements added irrespective of input */