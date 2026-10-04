public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target =7;
        System.out.println(minSubArrayLen(target,nums));
    }
   static int minSubArrayLen(int target, int[] nums) {
        int min_Length = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            int sum =0;
            for(int j=i;j<nums.length;j++)
            {
                sum+=nums[j];

                if(sum>=target)
                {
                    int length = j-i+1;
                    min_Length=Math.min(min_Length,length);
                    break;
                }
            }
        }
        return min_Length;
    }
}
