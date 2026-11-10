import java.util.Stack;

public class AdjacentDuplicates1047 {
    public static void main(String[] args) {

        String s = "abbaca";
        System.out.println(adjacentDuplicates(s));
    }
    static String adjacentDuplicates(String s)
    {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++)
        {
           char ch = s.charAt(i);

           if(!stack.isEmpty() && stack.peek()==ch)
           {
               stack.pop();
           }
           else {
               stack.push(ch);
           }
        }
        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        sb.reverse();

        return sb.toString();
    }
}
