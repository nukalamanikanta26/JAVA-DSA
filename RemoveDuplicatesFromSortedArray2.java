public class RemoveDuplicatesFromSortedArray2 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    static int removeDuplicates(int[] nums)
    {
        int left =0;
        for (int i = left+1; i < nums.length ; i++) {

            if(nums[i]!=nums[left])
            {
                left++;
                nums[left] = nums[i];
            }
        }
        return left+1;
    }
}

/* REMOVE DUPLICATES FROM SORTED ARRAY - TWO POINTER - LEETCODE 26
 *  TIME COMPLEXITY = O(n)
 *  SPACE COMPLEXITY = O(1)
 * */