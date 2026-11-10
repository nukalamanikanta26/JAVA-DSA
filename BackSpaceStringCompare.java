import java.util.Stack;

public class BackSpaceStringCompare {
    public static void main(String[] args) {
        String s = "ac##c";
        String t = "de##c";
        System.out.println(backSpaceStringCompare(s,t));
    }
    static boolean backSpaceStringCompare(String s,String t)
    {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (int i = 0; i < s.length(); i++)
        {
            if(stack1.isEmpty() && s.charAt(i)=='#')
            {
                continue;
            }

            if(!stack1.isEmpty() && s.charAt(i)=='#')
            {
                stack1.pop();
            }
            else {
                stack1.push(s.charAt(i));
            }
        }
        for (int i = 0; i < t.length(); i++)
        {
            if(stack2.isEmpty() && t.charAt(i)=='#')
            {
                continue;
            }
            if(!stack2.isEmpty() && t.charAt(i)=='#')
            {
                stack2.pop();
            }
            else {
                stack2.push(t.charAt(i));
            }
        }

        return stack1.equals(stack2);
    }
}
