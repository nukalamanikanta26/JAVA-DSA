import java.util.Arrays;

public class FirstandLastPositionofElementBS2 {
    public static void main(String[] args) {
        int[] nums = {4,7,7,7,7,7,7,8,9,9,9,10};
        int target =7;
       int[] result = searchRange(nums,target);
        System.out.println(Arrays.toString(result));

    }

    static int[] searchRange(int[] nums, int target)
    {
        return new int[]{ findFirst(nums,target),findLast(nums,target) };
    }

     static int findFirst(int[] nums,int target)
    {
        int ans =-1;
        int low =0;
        int high = nums.length-1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;

            if(nums[mid]==target)
            {
                ans=mid;
                high=mid-1;
            }
            else if(nums[mid]>target)
            {
                high=mid-1;
            }else {
                low = mid+1;
            }
        }
        return ans;
    }
    static int findLast(int[] nums,int target)
    {
        int ans =-1;
        int low =0;
        int high = nums.length-1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;

            if(nums[mid]==target)
            {
                ans=mid;
                low = mid+1;
            }
            else if(nums[mid]>target)
            {
                high=mid-1;
            }else {
                low = mid+1;
            }
        }
        return ans;
    }
}

/* FIRST AND LAST POSITION OF ELEMENT IN SORTED ARRAY - BINARY SEARCH - LEETCODE 34 {RETURN 1D ARRAY}
 *  TIME COMPLEXITY = O(log n)
 *  SPACE COMPLEXITY = O(1) */