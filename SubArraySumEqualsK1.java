public class SubArraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {1,2,3,7,5};
        int targetSum = 19;
        System.out.println(equalsTarget(nums,targetSum));
    }
    static boolean equalsTarget(int[] nums,int targetSum)
    {
        for (int i = 0; i < nums.length; i++) { //O(n)

            int windowSum=0;

            for (int j = i; j < nums.length ; j++) { //O(n)

                windowSum += nums[j];

                if (windowSum == targetSum) {
                    return true;
                }
            }
        }
        return false;
    }
}

/*
* SUB ARRAY SUM EQUALS K - SLIDING WINDOW - BRUTEFORCE
*  TIME COMPLEXITY = O(n^2)
*  SPACE COMPLEXITY = O(1)*/