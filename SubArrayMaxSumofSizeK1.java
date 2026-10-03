public class SubArrayMaxSumofSizeK1 {
    public static void main(String[] args) {
        int[] nums = {2,1,5,1,3,2};
        int k =3;
        System.out.println(maxSubArraySum(nums,k));
    }
    static int maxSubArraySum(int[] nums,int k)
    {
        int maxSum=0;
        for (int i = 0; i < nums.length-k+1; i++)  // O(n-k)
        {
          int curSum =0;

            for (int j = i; j <i+k ; j++) {  // O(k)

                curSum += nums[j];
                maxSum = Math.max(maxSum,curSum);

            }
        }
        return maxSum;
    }
}

/*
 *  SUBARRAY MAX SUM OF SIZE K - BRUTE FORCE - APPROACH 1
 *  TIME COMPLEXITY = O(n*k)
 *  SPACE COMPLEXITY = O(1)*/