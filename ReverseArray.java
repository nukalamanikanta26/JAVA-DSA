
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.print(Arrays.toString(reverseArray(arr)));
    }
    static int[] reverseArray(int[] arr)
    {
        int n = arr.length;
        int[] result = new int[arr.length];
        for (int i = n-1; i >=0 ; i--) {
           result[i] = arr[n-i-1];
        }
        return result;
    }
}

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>//

/* Time Complexity is O(n) - Array running up to n terms
*  Space Complexity is O(n)- since new Array is required */
