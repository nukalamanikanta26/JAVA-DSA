import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class MaximumProductPairWithTargetSum2 {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4};
        int target = 5;
        System.out.println(Arrays.toString(maxProductPair(nums,target)));
    }
    static int[] maxProductPair(int[] nums,int target)
    {
        int[] res = {-1,-1};
        int maxProduct=Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            int need = target-nums[i];

            if(map.containsKey(need))
            {
              int j = map.get(need);
              if(nums[i]>nums[j]) {
                  int product = nums[i] * nums[j];

                  if (product > maxProduct) {
                      maxProduct = product;
                      res[0] = i;
                      res[1] = j;
                  }
              }
            }
            map.put(nums[i],i);
        }
        return res;
    }
}

/* MAXIMUM PRODUCT PAIR WITH TARGET SUM - HASH MAP - LEETCODE 4074{RETURN 1D ARRAY}
 *  TIME COMPLEXITY = O(n)
 *  SPACE COMPLEXITY = O(N) */