import java.util.HashMap;

public class containsDuplicate22 {
    public static void main(String[] args) {
        
    }
    static boolean validDuplicate(int[] nums,int k)
    {
        HashMap<Integer,Integer>map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
        {
          if(map.containsKey(nums[i]))
          {
              if(i - map.get(nums[i])<=k)
              {
                  return true;
              }
          }
          map.put(nums[i],i);
        }
        return false;
    }
}

/*
 * CONATINS DUPLICATE 2  - HASH MAP - APPROACH 2
 *  TIME COMPLEXITY = O(n)
 *  SPACE COMPLEXITY = O(N)  */