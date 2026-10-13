public class CountOccurencesOfNumberInSortedArrayBS {
    public static void main(String[] args) {
    int[] nums={1,2,3,3,3,3,3,3,3,4,6,6};
    int target = 3;
        System.out.println(coutOccurences(nums,target));
    }
    static int coutOccurences(int[] nums,int target)
    {
        int first = findFirst(nums, target);

        if(first==-1)
        {
            return 0;
        }
        int last = findLast(nums, target);

        return last-first+1;
    }
    static int findFirst(int[] nums,int target) //TC : log n
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
    static int findLast(int[] nums,int target)  //TC: log n
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

/* OCCURENCES OF NUMBER IN SORTED ARRAY - BINARY SEARCH
 *  TIME COMPLEXITY = O(log n)
 *  SPACE COMPLEXITY = O(1) */