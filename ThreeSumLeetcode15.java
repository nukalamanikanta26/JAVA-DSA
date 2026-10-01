import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumLeetcode15 {
    public static void main(String[] args) {
    int[] nums = {-1,0,1,2,-1,-4};
    int target =0;
        System.out.println(threeSum(nums,target));
    }
    static List<List<Integer>> threeSum(int[] nums,int target)
    {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }

            int left=i+1;
            int right = nums.length-1;

            while(left<right)
            {
                int sum = nums[i]+nums[left]+nums[right];

                if(sum==0)
                {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);

                    res.add(temp);

                    while(left<right && nums[left]==nums[left+1])
                    {
                        left++;
                    }
                    while(left<right && nums[right]==nums[right-1])
                    {
                        right--;
                    }
                }

                if(sum<target)
                {
                    left++;
                } else
                {
                    right--;
                }
            }
        }
        return res;
    }
}

/*
* THREE SUM - LEETCODE 15
*  TIME COMPLEXITY = O(nlogn)
*  SPACE COMPLEXITY = O(1) */