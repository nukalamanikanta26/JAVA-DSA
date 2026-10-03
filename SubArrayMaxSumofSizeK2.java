    public class SubArrayMaxSumofSizeK2 {
    public static void main(String[] args) {
        int[] nums = {2,1,5,1,3,2};
        int k =3;
        System.out.println(maxSubArraySum(nums,k));
    }
    static int maxSubArraySum(int[] nums,int k)
    {
        int maxSum=0;
        for (int i = 0; i < k; i++) {  //O(K)
            maxSum += nums[i];
        }
        int curSum =maxSum;
        for (int i = k; i < nums.length; i++) { //O(N)
            curSum = curSum - nums[i-k] + nums[i];

            maxSum = Math.max(curSum,maxSum);
        }
        return maxSum;
    }
}


    /*
     *  SUBARRAY MAX SUM OF SIZE K - SLIDING WINDOW - APPROACH 2
     *  TIME COMPLEXITY = O(n)
     *  SPACE COMPLEXITY = O(1)*/