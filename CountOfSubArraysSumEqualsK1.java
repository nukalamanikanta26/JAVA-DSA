public class CountOfSubArraysSumEqualsK1 {
    public static void main(String[] args) {
    int[] nums = {1,1,1};
    int K =2;                   //Output:2
        System.out.println(sumCountEqualsK(nums,K));
    }
    static int sumCountEqualsK(int[] nums,int K)
    {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            int curSum=0;
            for (int j = i; j <nums.length ; j++) {

                curSum+=nums[j];

                if(curSum==K)
                {
                    count++;
                }
            }
        }
        return count;
    }

}
/*
 * TOTAL COUNT OF SUBARRAY SUM EQUALS K - BRUTEFORCE - APPROACH 1
 *  TIME COMPLEXITY = O(n^2)
 *  SPACE COMPLEXITY = O(1)*/