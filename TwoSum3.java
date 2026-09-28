import java.util.HashSet;

public class TwoSum3 {
    public static void main(String[] args) {
        int[] arr = {2,7,9,3,8};
        int target = 10;
        System.out.println(twoSum3(arr,target));
    }

    static boolean twoSum3(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            int need = target - arr[i];

            if(set.contains(need))
            {
               return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}
/* TWO SUM - HASH SET - APPROACH 3
 *  TIME COMPLEXITY = O(n)
 *  SPACE COMPLEXITY = O(n)*/