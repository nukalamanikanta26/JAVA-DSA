import java.util.Arrays;
public class MoveZeroes1 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(arr)));
    }
    static int[] moveZeroes(int[] arr)
    {
        int[] result = new int[arr.length];
        int index =0;
        for (int i = 0; i < arr.length; i++) {   //O(n)
            if(arr[i]!=0)
            {
                result[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {  //O(n)
            arr[i] = result[i];

        }
        return result;
    }
}

/* MOVE ZEROES - LEETCODE 283 - BRUTE FORCE - APPROACH 1
*  TIME COMPLEXITY = O(n)
*  SPACE COMPLEXITY = O(n)
* */