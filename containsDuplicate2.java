
public class containsDuplicate2
{
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k=2;

        System.out.print(containDuplicate2(nums,k));
    }
    static boolean containDuplicate2(int[] nums,int k)
    {

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                   int ab = Math.abs(j-i);
                    if(ab<=k)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

/*
 * CONATINS DUPLICATE 2  - BRUTEFORCE - APPROACH 1
 *  TIME COMPLEXITY = O(n^2)
 *  SPACE COMPLEXITY = O(1)  */