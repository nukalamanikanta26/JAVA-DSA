public class AddTwoNumbers {
    public static void main(String[] args) {

    }
    static Node addTwonums(Node list1, Node list2)
    {
        Node dummy = new Node(10);
        Node temp = dummy;

        int carry =0;
        while(list1!=null || list2!=null || carry!=0)
        {
            int sum = carry;

            if(list1!=null)
            {
                sum =  sum + list1.data;
                list1 = list1.next;
            }
            if(list2!=null)
            {
                sum =  sum + list2.data;
                list2= list2.next;
            }

            temp.next = new Node(sum%10);
            temp = temp.next;

            carry = sum/10;
        }
        return dummy.next;
    }
}
