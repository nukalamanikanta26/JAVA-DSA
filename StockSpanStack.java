import java.util.ArrayList;
import java.util.Stack;

public class StockSpanStack {
    public static void main(String[] args) {
        int[] arr = {10,30,70,23,90,220};
        System.out.println(stockSpan(arr));
    }
    static ArrayList<Integer> stockSpan(int[] arr)
    {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        for (int i = 1; i <n; i++) {

            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                list.add(i+1);
            }
            else {
                list.add(i-stack.peek());
            }
            stack.push(i);
        }
        return list;
    }
}
