class MyStack {
    int[] arr;
    int top;

    MyStack(int size)
    {
        arr = new int[size];
        top=-1;
    }

    //CustomStackOperations
    void push(int x) //since it doesnt return any value
    {
      if(top== arr.length-1)
      {
          System.out.println("Stack Overflow");
      }
      top++;
      arr[top]=x;
    }

    int pop()
    {
        if(top==-1)
        {
            System.out.println("StackUnderFlow");
            return -1;
        }
        int value = arr[top];
        top--;
        return value;
    }

    int peek()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty()
    {
        return top==-1;
    }

    int size()
    {
        return top+1;
    }
    
    void display()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}

public class StackMyImplementation {
    public static void main(String[] args) {
        MyStack stack = new MyStack(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        int peek = stack.peek();
        System.out.println(peek);
        System.out.println(stack.size());
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty());
    }
}
