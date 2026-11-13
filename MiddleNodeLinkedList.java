public class MiddleNodeLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next= new Node(40);
        head=middleNode(head);

        while(head!=null)
        {
            System.out.print(head.data+ " ");
            head = head.next;

        }
    }
    static Node middleNode(Node head)
    {
        Node fast = head;
        Node slow = head;

        while(fast!=null && fast.next!= null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
