public class MinimumInRotatedArrayBS1 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(minInRotatedArray(nums));
    }
    static int minInRotatedArray(int[] nums)
    {
        int res = nums[0];
        int low =0;
        int high = nums.length-1;

        while(low<=high)
        {
            int mid = low + (high-low)/2;
            res = Math.min(res,nums[mid]);
            if(nums[mid]<nums[high])
            {
                high = mid-1;

            } else {
                low = mid+1;
            }
        }
        return res;
    }
}

/* MINIMUM NUMBER IN ROTATED ARRAY  - BRUTE FORCE - LEET CODE 153
 *  TIME COMPLEXITY = O(Log n )
 *  SPACE COMPLEXITY = O(1)
 * */