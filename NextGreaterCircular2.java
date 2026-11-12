import java.util.Arrays;
import java.util.Stack;

public class NextGreaterCircular2 {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        System.out.println(Arrays.toString(nextGreaterCircular2(arr)));
    }
    static int[] nextGreaterCircular2(int[] arr)
    {
       int n = arr.length;
       int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 2*n-1; i >=0 ; i--) {

            int x = arr[i%n];
            while(!stack.isEmpty() && stack.peek()<=x)
            {
                stack.pop();
            }

            if(i<n)
            {
                if(stack.isEmpty())
                {
                    res[i]=-1;
                }
                else {
                    res[i]=stack.peek();
                }
            }
            stack.push(x);
        }
        return res;
    }
}
