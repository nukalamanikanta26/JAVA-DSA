public class MaximumAverageSubArray1 {
    public static void main(String[] args) {
    int[] nums = {1,12,-5,-6,50,3};

    int k =4;
        System.out.println(findMaxAverage(nums,k));
    }
    static double findMaxAverage(int[] nums,int k)
    {
        double maxAvg =0;
        for (int i = 0; i < nums.length-k+1; i++)
        {
            int curSum =0;
            double curAvg = 0;

            for (int j = i; j < i+k ; j++)
            {
                curSum+=nums[j];
                maxAvg = Math.max((double) curSum/k,maxAvg);
            }
        }
        return  maxAvg;
    }
}

/* MAXIMUM AVERAGE SUB ARRAY 1 - LEETCODE 643 - BRUTE FORCE
 *  TIME COMPLEXITY : O(n*k)
 *  SPACE COMPLEXITY : O(1)  */