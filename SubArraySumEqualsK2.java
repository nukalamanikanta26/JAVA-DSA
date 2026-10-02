public class SubArraySumEqualsK2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,7,5};
        int targetSum = 18;
        System.out.println(equalsTargetSum(nums,targetSum));
    }
    static boolean equalsTargetSum(int[] nums,int targetSum){

        int left=0;
        int windowSum=0;
        for (int right = 0; right < nums.length; right++) {  //O(n)

            windowSum+=nums[right];

            if(windowSum>targetSum && left<=right)
            {
                windowSum-=nums[left];
                left++;
            }
            if(windowSum==targetSum)
            {
                return true;
            }
        }
        return false;
    }
}


/*
 * SUB ARRAY SUM EQUALS K - SLIDING WINDOW - OPTIMISED
 *  TIME COMPLEXITY = O(n)
 *  SPACE COMPLEXITY = O(1)*/