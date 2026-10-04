public class MaximumSizeSubArraySum1 {
    public static void main(String[] args) {
    int[] nums ={1, 2, 3, 1, 1, 1, 1};
    int k = 3;
        MaximumSizeSubArraySum1 obj = new MaximumSizeSubArraySum1();
        System.out.println(obj.maxSubArrayLen(k,nums));
    }
    public  int maxSubArrayLen(int target, int[] nums) {
        int max_Length = 0;

        for(int i=0;i<nums.length;i++)
        {
            int sum =0;
            for(int j=i;j<nums.length;j++)
            {
                sum+=nums[j];

                if(sum==target)
                {
                    int length = j-i+1;
                    max_Length=Math.max(max_Length,length);
                    break;
                }
            }
        }
        return max_Length;
    }
}

/*
 * MAXIMUM SIZE SUB ARRAY SUM - BRUTEFORCE - APPROACH 1
 *  TIME COMPLEXITY = O(n^2)
 *  SPACE COMPLEXITY = O(1)*/