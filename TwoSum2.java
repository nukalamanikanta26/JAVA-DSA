import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = {2,7,9,3,8};
        int target = 10;
        System.out.println(twoSum2(arr,target));
    }

     static boolean twoSum2(int[] arr, int target) {
         Arrays.sort(arr); // O(nlogn)
         int left = 0;
         int right = arr.length-1;
         while(left<right) // O(n)
         {
            if(arr[left]+arr[right]==target)
            {
                return true;
            } else if (arr[left]+arr[right]<target) {
                left++;
            }
            else {
                right--;
            }
         }
         return false;
    }
}

/* TWO SUM - TWO-POINTER - APPROACH 2
 *  TIME COMPLEXITY = O(nlogn)
 *  SPACE COMPLEXITY = O(1)*/
