public class TwoSum1 {
    public static void main(String[] args) {
        int[] arr = {2,7,9,3,8};
        int target = 10;
        System.out.println(twoSum(arr,target));
    }
    static boolean twoSum(int[] arr,int target)
    {
        int n = arr.length-1;
        for (int i = 0; i < n-1; i++) {  // O(n)
            for (int j = i+1; j < n; j++) { // O(n)
                if(arr[i]+arr[j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}


/* TWO SUM - BRUTE FORCE - APPROACH 1
*  TIME COMPLEXITY = O(n^2)
*  SPACE COMPLEXITY = O(1)*/