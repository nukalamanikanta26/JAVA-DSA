public class ReOrderLinkedList143 {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(20);
        head.next.next.next= new Node(40);
        reorder(head);
    }
    public static void reorder(Node head)
    {
        //3Steps -> Middle Element -> reverse after middle -> merge alterntely

        //Step1

        Node slow = head;
        Node fast = head;

        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node second = slow.next;
        slow.next = null;

        // reverse

        Node curr = second;
        Node prev = null;

        while(curr!=null)
        {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node p1 = head;
        Node p2 = prev;

        while(p2!=null)
        {
            Node n1 = p1.next;
            Node n2 = p2.next;

            p1.next = p2;
            p2.next= n1;

            p1 = n1;
            p2= n2;
        }
    }
}
