public class SearchInRotatedArrayBS {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2,3};
        int target =0;
        System.out.println(searchInRotatedArray(nums,target));
    }
    static int searchInRotatedArray(int[] nums,int target)
    {
        int low =0;
        int high = nums.length-1;

        while(low<=high)
        {
            int mid = low + (high-low)/2;

            if(nums[mid]==target)
            {
                return mid;
            }

            if(nums[mid]<nums[high])
            {
                if(nums[mid]<target && target<=nums[high])
                {
                    low = mid+1;
                } else {
                    high= mid-1;
                }
            }
            else
            {
                if(nums[low]<=target && target<nums[mid])
                {
                    high = mid-1;
                } else {
                    low = mid+1;
                }
            }
        }
        return -1;
    }
}


/* SEARCH IN ROTATED ARRAY - BINARYSERACH - LEET CODE 33
 *  TIME COMPLEXITY = O(log n)
 *  SPACE COMPLEXITY = O(1) */