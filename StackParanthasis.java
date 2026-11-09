import java.util.Stack;

public class StackParanthasis {
    public static void main(String[] args) {
        String str = "([{()}])";
        System.out.println(validParanthasis(str));
    }
    static boolean validParanthasis(String str)
    {
        int n  = str.length();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            char curr = str.charAt(i);

            if(curr=='('||curr=='{'||curr=='[') {
                stack.push(curr);
            } else if(curr==')'||curr=='}'||curr==']')
            {
                if(stack.isEmpty())
                {
                    return false;
                }

                char top = stack.pop();

                if(top==')' && curr !='(') return false;

                if(top=='}' && curr !='{') return false;

                if(top==']' && curr !='[') return false;
            }
        }
        return stack.isEmpty();
    }
}
