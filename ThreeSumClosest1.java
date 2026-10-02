import java.util.Arrays;
public class ThreeSumClosest1 {
    public static void main(String[] args) {
        int[] arr = {-1,2,1,-4};
        int target =1;
        System.out.println(threeSumClosest(arr,target));
    }
    static int threeSumClosest(int[] arr, int target)
    {
        Arrays.sort(arr); // O(nlogn)
        int closestSum = arr[0]+arr[1]+arr[2];

        for (int i = 0; i < arr.length-2; i++) {   //O(n)

            int left = i+1;
            int right = arr.length-1;

            while(left<right)                     // O(n)
            {
                int sum = arr[i]+arr[left]+arr[right];
                if(Math.abs(sum-target)<Math.abs(closestSum-target))
                {
                    closestSum=sum;
                }

                if(sum<target)
                {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return closestSum;
    }
}
/*
*   THREE SUM CLOSEST - LEETCODE 11
*   TIME COMPLEXITY : O(n^2)
*   SPACE COMPLEXITY: O(1)*/