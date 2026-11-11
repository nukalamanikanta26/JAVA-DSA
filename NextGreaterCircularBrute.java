import java.util.Arrays;

public class NextGreaterCircularBrute {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        System.out.println(Arrays.toString(nextGreaterCircular(arr)));
    }
    static int[] nextGreaterCircular(int[] arr)
    {
        int n = arr.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {

            res[i]=-1;
            for (int j = 1; j <n ; j++) {
                int k = (i+j)%n;

                if(arr[k]>arr[i])
                {
                    res[i]=arr[k];
                    break;
                }
            }
        }
        return res;
    }
}
