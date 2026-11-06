import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack : "+stack);
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: "+stack.pop());
        System.out.println("Stack after pop : "+stack);
        System.out.println("Pop: "+stack.pop());
        System.out.println("Pop: "+stack.pop());
        System.out.println("Empty? "+stack.isEmpty());

    }
}
