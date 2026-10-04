public class MaximumSizeSubArraySum2 {
    public static void main(String[] args) {
        int[] nums ={1, 2, 3, 1, 1, 1, 1};
        int k = 3;
        MaximumSizeSubArraySum1 obj = new MaximumSizeSubArraySum1();
        System.out.println(obj.maxSubArrayLen(k,nums));
    }
    public int  maxSubArrayLen(int[] nums,int target)
    {
        int sum =0;
        int maxLength=Integer.MIN_VALUE;
        int left=0;
        for (int right = 0; right < nums.length; right++) {
            sum+= nums[right];
            while(sum>=target)
            {
                maxLength=Math.max(maxLength,right-left+1);
                sum -=nums[left];
                left++;
            }
        }
        return maxLength;
    }
}

/*
 * MAXIMUM SIZE SUB ARRAY SUM - SLIDING WINDOW - APPROACH 2
 *  TIME COMPLEXITY = O(n)
 *  SPACE COMPLEXITY = O(1)*/