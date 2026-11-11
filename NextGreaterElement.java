import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
        System.out.println(nextGreaterElement(arr));
    }
    static ArrayList<Integer> nextGreaterElement(int[] arr)
    {
        int n = arr.length;

        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        result.add(-1);
        stack.push(n-1);

        for (int i = n-2; i >=0 ; i--)
        {
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i])
            {
                stack.pop();
            }

            if(stack.isEmpty())
            {
                result.add(-1);
            }else {
                result.add(arr[stack.peek()]);
            }
            stack.push(i);
        }
        Collections.reverse(result);
        return result;
    }
}
