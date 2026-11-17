public class RemoveDuplicatesSortedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(20);
        head.next.next.next= new Node(40);
        System.out.println(removeDuplicates(head));
    }
    static Node removeDuplicates(Node head)
    {
        Node curr = head;

        while(curr!=null && curr.next!=null)
        {
            if(curr.data == curr.next.data)
            {
                curr.next = curr.next.next;
            }
            else {
                curr = curr.next;
            }
        }
        return head;
    }
}
