public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next= new Node(40);
        head=reverseLinkedList(head);

        while(head!=null)
        {
            System.out.print(head.data+"->");
            head=head.next;
        }
    }
    static Node reverseLinkedList(Node head)
    {
        Node curr = head;
        Node prev = null;
        Node next = null;

        while(curr!=null)
        {
            next= curr.next;
            curr.next = prev;
            prev = curr;
            curr=next;


        }
        head = prev;
        return head;
    }
}
