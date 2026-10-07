import java.util.HashMap;

public class LongestSubStringKDistinctChars2 {
    public static void main(String[] args) {
        String s = "krruppa";
        int k =2;
        System.out.println(longestSubStringLenKchars(s,k));
    }
    static int longestSubStringLenKchars(String s,int k)
    {
        int maxLen =0;
        int left =0;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++)
        {

            char c = s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);

            while(map.size()>k)
            {
             char ch = s.charAt(left);
             map.put(ch,map.get(ch)-1);

             if(map.get(ch)==0)
             {
                 map.remove(ch);
             }
             left++;
            }

            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }

}

/*
 * LONGEST SUB STRING LEN WITH ATMOST K DISTINCT CHARS - SLIDING WINDOW - APPROACH 2
 *  TIME COMPLEXITY = O(n)
 *  SPACE COMPLEXITY = O(1) : since, in set only 26 eleemnts added irrespective of input*/