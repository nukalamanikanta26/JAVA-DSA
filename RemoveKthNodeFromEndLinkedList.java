
public class RemoveKthNodeFromEndLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next= new Node(40);
        int k = 2;
        System.out.println(removeKthNode(head,k));
    }
    static Node removeKthNode(Node head,int k)
    {
        Node fast = head;
        Node slow = head;
        if(head == null)
        {
            return head;
        }
        for (int i = 0; i < k; i++)
        {
          fast = fast.next;
        }
        if(fast==null) {
            return head.next;
        }

        while(fast!=null)
        {
            slow = slow.next;
            fast= fast.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}
