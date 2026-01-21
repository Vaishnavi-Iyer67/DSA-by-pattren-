


// finding middle node in SLL using Tortoise hare algorithm 
class Node {
    int data;
    Node next;
    Node ( int data)
    {
        this.data=data;
        this.next=null;

    }
    Node( int data , Node next)
    {
        this.data=data;
        this.next=next;

    }

}
class Operations{
    public Node find_middle(Node head)
    {
        Node fast=head;
        Node slow=head;
        while( fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;

        }
        return slow ;

    }
    public Node array2SLL( int [] arr )
    {
        Node head=new Node ( arr[0]);
        Node temp=head;
        for( int i=1;i<arr.length;i++)
        {
            temp.next=new Node( arr[i]);
            temp = temp.next;

        }
        return head;

    }
}
public class Middle_node {
    public static void main(String[] args) {
        int [] arr = { 1,2,3,4,5,6};
        Operations op = new Operations();
        Node head = op.array2SLL(arr);
        Node mid = op.find_middle(head);
        System.out.println(mid.data);

        
        
    }
    
}
