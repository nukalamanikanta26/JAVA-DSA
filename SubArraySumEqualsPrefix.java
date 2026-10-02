import java.util.HashSet;

/* There is a problem; our assumption is we are thinking that
   removing an element from front nums[left] may decrease the sum.
   It is not correct all the time. when negative numbers are involved.
   sometimes removing a number doest decreases the sum, it increases the sum

   for this we use : PREFIX SUM
*/
public class SubArraySumEqualsPrefix {
    public static void main(String[] args) {
        int[] nums = {1,-2,3,7,-5};
        int targetSum = 10;
        System.out.println(equalsTarget(nums,targetSum));
    }
    static boolean equalsTarget(int[] nums,int target)
    {

        HashSet<Integer> set = new HashSet<>();
        int sum=0;

        for (int i = 0; i < nums.length; i++)
        {
          sum += nums[i];

          if(sum==target)
          {
              return true;
          }
          int need = sum - target;

          if(set.contains(need))
          {
              return true;
          }
          set.add(sum);
        }
        return false;
    }
}
