public class MergeSortedLinkedList {
    public static void main(String[] args) {

    }
    static Node MergeSortedLL(Node List1,Node List2)
    {
        Node dummy = new Node(0);
        Node temp = dummy;
        Node p1 = List1;
        Node p2 = List2;

        while(p1!=null && p2!=null)
        {
            if(p1.data<p2.data)
            {
                temp.next=p1;
                p1=p1.next;
            }else {
                temp.next=p2;
                p2=p2.next;
            }
            temp = temp.next;
        }
        if(p1!=null) {
            temp.next = p1;
        }

        if(p2!=null)
        {
            temp.next=p2;
        }
        return dummy.next;
    }
}
