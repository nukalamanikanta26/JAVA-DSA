import java.util.Arrays;

public class MaximumProductPairWithTargetSum1 {
    public static void main(String[] args) {
    int[] nums ={1,2,3,4};
    int target = 5;
        System.out.println(Arrays.toString(maxProductPair(nums,target)));
    }
    static int[] maxProductPair(int[] nums,int target)
    {
        int[] res = {-1,-1};
        int maxProduct=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = 0; j < nums.length; j++)
            {
                if(i!=j && nums[i]+nums[j]==target && nums[i]>nums[j])
                {
                    int product = nums[i]*nums[j];

                    if(product>maxProduct)
                    {
                        maxProduct=product;
                        res[0]=i;
                        res[1]=j;
                    }
                }
            }
        }
        return res;
    }
}


/* MAXIMUM PRODUCT PAIR WITH TARGET SUM - BRUTE FORCE - LEETCODE 4074{RETURN 1D ARRAY}
 *  TIME COMPLEXITY = O(n^2)
 *  SPACE COMPLEXITY = O(1) */