import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.print(Arrays.toString(reverseArray(arr)));
    }
    static int[] reverseArray(int[] arr)
    {
        int left =0;
        int right = arr.length-1;

        while (left < right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return arr;
    }
}

/* Time Complexity is n/2 ignore divison , so O(n)
*  Space Complexity is O(1) - No extra space is needed */