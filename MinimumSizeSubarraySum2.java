public class MinimumSizeSubarraySum2 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target =7;
        System.out.println(minSubArrayLen(nums,target));
    }
    static int  minSubArrayLen(int[] nums,int target)
    {
        int sum =0;
        int minLength=Integer.MAX_VALUE;
        int left=0;
        for (int right = 0; right < nums.length; right++) {
            sum+= nums[right];
            while(sum>=target)
            {
                minLength=Math.min(minLength,right-left+1);
                sum -=nums[left];
                left++;
            }
        }
        return minLength;
    }
}

/*
 * MINIMUM SIZE SUB ARRAY SUM - SLIDING WINDOW - APPROACH 2
 *  TIME COMPLEXITY = O(n)
 *  SPACE COMPLEXITY = O(1)*/