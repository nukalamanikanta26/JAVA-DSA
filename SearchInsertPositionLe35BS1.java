/*Input arr: [1,3,5,6] , target = 2
* Output : 1*/
public class SearchInsertPositionLe35BS1 {
    public static void main(String[] args) {
    int[] nums = {1,3,5,6,7,12,16,21};
    int target = 10;
        System.out.println(searchInsertPosition(nums,target));
    }
    static int searchInsertPosition(int[] nums, int target)
    {
        int i=0;
        for ( i = 0; i < nums.length; i++)
        {
          if(nums[i]>target)
          {
              break;
          }
        }
        return i;
    }
}

/* SEARCH INSERT POSITION - BRUTE FORCE - LEET CODE 35
 *  TIME COMPLEXITY = O(N)
 *  SPACE COMPLEXITY = O(1)
 * */