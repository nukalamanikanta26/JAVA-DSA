import java.util.Arrays;

public class FirstandLastPositionofElementBS1 {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int target =7;
        System.out.println(Arrays.toString(firstAndLastPosition(arr,target)) );
    }
    static int[] firstAndLastPosition(int[] arr,int target)
    {
        int first =-1;
        int last =-1;

        for (int i = 0; i < arr.length; i++)
        {
          if(arr[i]==target)
          {
              if(first==-1)
              {
                  first=i;
              }
              last=i;
          }
        }
        return new int[] {first,last};
    }
}


/* FIRST AND LAST POSITION OF ELEMENT IN SORTED ARRAY - BRUTE FORCE - LEETCODE 34 {RETURN 1D ARRAY}
 *  TIME COMPLEXITY = O(n)
 *  SPACE COMPLEXITY = O(1) */