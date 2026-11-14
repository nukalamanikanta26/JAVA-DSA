public class LinkedListCycle1 {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head.next;
        System.out.println(linkedListCycle1(head));
    }

    //return true if cycle exists
    static boolean linkedListCycle1(Node head)
    {
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast= fast.next;

            if(slow==fast)
                return true;
        }
        return false;
    }
}

//Optimised; -> O(n)