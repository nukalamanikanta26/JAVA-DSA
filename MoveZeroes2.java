import java.util.Arrays;

public class MoveZeroes2 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(arr)));
    }
    static int[] moveZeroes(int[] arr )
    {
        int left =0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]!=0)
            {
                int temp = arr[i];
                arr[i]=arr[left];
                arr[left]=temp;

                left++;
            }
        }
        return arr;
    }
}


/* MOVE ZEROES - LEETCODE 283 - TWO POINTER - APPROACH 2
 *  TIME COMPLEXITY = O(n)
 *  SPACE COMPLEXITY = O(1)
 * */