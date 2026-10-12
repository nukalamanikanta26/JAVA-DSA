public class LongestRepeatingCharReplacement2 {
    public static void main(String[] args) {
        String s = "AABABB";
        int k =1;
        System.out.println(longestRepeatingCharReplacement(s,k));
    }
    static int longestRepeatingCharReplacement(String s, int k) {
        int[] count = new int[26];
        int maxlen = 0;
        int maxFreq = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, count[s.charAt(right) - 'A']);

            while ((right - left + 1) - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            maxlen = Math.max(maxlen, right - left + 1);
        }
        return maxlen;
    }
}

/*
 * LONGEST REPEATING CHARACTER REPLACEMENT - SLIDING WINDOW - APPROACH 2
 *  TIME COMPLEXITY = O(n)
 *  SPACE COMPLEXITY = O(26) : since, in count stores  only 26 elements added irrespective of input */