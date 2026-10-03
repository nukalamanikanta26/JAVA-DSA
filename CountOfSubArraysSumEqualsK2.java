import java.util.HashMap;

public class CountOfSubArraysSumEqualsK2 {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int K =2;                   //Output:2
        System.out.println(sumCountEqualsK(nums,K));
    }
    static int sumCountEqualsK(int[] nums,int K)
    {
        int sum=0;
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        int count =0;

        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];

            int need = sum-K;

            if(map.containsKey(need))
            {
                count+=map.get(need);
            }

            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }

}
/*
 * TOTAL COUNT OF SUBARRAY SUM EQUALS K - HASHMAP - APPROACH 2
 *  TIME COMPLEXITY = O(n)
 *  SPACE COMPLEXITY = O(N)*/