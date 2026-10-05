public class MaximumAverageSubArray2 {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k =4;
        System.out.println(maxAverage(nums,k));
    }
    static double maxAverage(int[] nums, int k)
    {
        int sum =0;
        for (int i = 0; i < k; i++) {
            sum+=nums[i];
        }
         double maxAvg = (double) sum/k;
        for (int j = k; j < nums.length; j++)
        {
          sum = sum -nums[j-k] + nums[j];
          maxAvg = Math.max((double) sum/k,maxAvg);
        }
        return maxAvg;
    }
}
