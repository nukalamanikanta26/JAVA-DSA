/* TWOSUM LEETCODE {CONSISTS ATLEAST ONE SOLUTION}
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/

import java.util.Arrays;
import java.util.HashSet;

public class TwoSumLeetCode {
    public static void main(String[] args) {
        int[] arr = {2,7,9,3,8};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    static int[] twoSum(int[] arr, int target)
    {
        int[] res = new int[2];
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {  // O(n)
            int need = target - arr[i];

            if(set.contains(need))
            {
                res[0]=findElement(arr,need);  // O(n) but not every times
                res[1]=i;
            }
            set.add(arr[i]);
        }
        return res;
    }
    static int findElement(int[] arr,int need)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==need)
            {
                return i;
            }
        }
        return -1;
    }
}


/* TWO-SUM LEETCODE {RETURN 1D ARRAY}
*  TIME COMPLEXITY = O(n)
*  SPACE COMPLEXITY = O(n) */