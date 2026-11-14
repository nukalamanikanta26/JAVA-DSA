
public class LinkedListCycle2 {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head.next;
        System.out.println(linkedList2(head));
    }

    //return Node where cycle starts

    static Node linkedList2(Node head)
    {
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast= fast.next.next;

            if(slow==fast)

            {
                slow = head;
                while(slow!=fast)
                {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
