import java.util.LinkedHashSet;

public class RemoveDuplicatesFromSortedArray1 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    static int removeDuplicates(int[] nums)
    {
        int[] res = new int[nums.length];
        LinkedHashSet<Integer> set = new LinkedHashSet<>(); // SC = O(N)
        for (int i = 0; i < nums.length; i++) {   //O(n)
            set.add(nums[i]);
        }
        int index=0;
        for(Integer i : set)
        {
            nums[i] = i;
            index++;
        }
        return index;
    }
}


/* REMOVE DUPLICATES FROM SORTED ARRAY - BRUTE FORCE - LEET CODE 26
*  TIME COMPLEXITY = O(n)
*  SPACE COMPLEXITY = O(n)
* */