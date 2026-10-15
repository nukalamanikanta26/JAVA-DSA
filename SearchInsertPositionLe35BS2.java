public class SearchInsertPositionLe35BS2 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6,7,12,16,21};
        int target = 10;
        System.out.println(searchInsertPosition(nums,target));
    }
    static int searchInsertPosition(int[] nums, int target)
    {
       int low =0;
       int high=nums.length-1;

       while(low<=high)
       {
           int mid = low +(high-low)/2;
           if(nums[mid]==target)
           {
               return mid;
           }
           if(nums[mid]<target)
           {
               low = mid+1;
           }else
           {
               high = mid-1;
           }
       }
       return low;
    }
}

/* SEARCH INSERT POSITION - BINARYSERACH - LEET CODE 35
 *  TIME COMPLEXITY = O(log n)
 *  SPACE COMPLEXITY = O(1)
 * */