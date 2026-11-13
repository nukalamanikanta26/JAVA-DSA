class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class LinkedListBasic {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next= new Node(40);
        int x = 5;
        int y = 50;

        head = insertBeginning(head, x);
        traverseLL(head);

        System.out.println();

        head = insertEnding(head, y);
        traverseLL(head);
    }

    //Traverse LinkedList
    public static void traverseLL(Node head)
    {
        Node curr = head;

        while(curr!=null)
        {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.print("null");
    }

    //Count Nodes

    static int countNodes(Node head)
    {
        int count=0;
        Node curr = head;
        if(head==null)
            return 0;
        if(head.next==null)
            return 1;
        while(curr!=null)
        {
            count++;
            curr= curr.next;
        }
        return count;
    }

    static Node insertBeginning(Node head, int x)
    {
        Node newNode = new Node(x);

        newNode.next = head;

        return newNode;
    }
    static Node insertEnding(Node head,int y)
    {
        Node newNode = new Node(y);
        Node curr = head;
        if(head == null)
            return newNode;
        while (curr.next!=null)
        {
            curr = curr.next;
        }

        curr.next=newNode;

        return head;

    }
}
