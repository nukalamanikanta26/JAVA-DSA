import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement1LeetCode {
    public static void main(String[] args) {
        int[] arr1 = {4,1,3,2};
        int[] arr2 ={5,9,6,4,7,3,2,14,1,11};
        System.out.println(Arrays.toString(nextGreater(arr1,arr2)));
    }
    static int[] nextGreater(int[] arr1,int[] arr2)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = arr2.length-1; i >=0 ; i--)
        {
            while(!stack.isEmpty() && stack.peek()<=arr2[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                map.put(arr2[i],-1);
            }
            else {
                map.put(arr2[i],stack.peek());
            }
            stack.push(arr2[i]);
        }

        int[] res = new int[arr1.length];
        for (int k = 0; k < arr1.length; k++) {
            res[k] = map.get(arr1[k]);
        }
        return res;
    }
}
