// finding starting point in a looped Singly linked list 
// can be solved using tortoise and hare algorithm 
// also called floyd's algorithm 
class Node {
    int data;
    Node next;
    
    Node( int data)
    {
        this.data= data;
        this.next=null;

    }
}
class Operations{
    public Node detect( Node head)
    {
        Node fast= head;
        Node slow = head ;
        while( fast!=null && fast.next!= null)
        {
            fast= fast.next.next;
            slow = slow.next;
            if( slow ==fast )
            {
                slow = head;
                while( slow!=fast )
                {
                    slow=slow.next;
                    fast=fast.next;

                }
                return slow ;

            }

        }
        return null;
    }

}
public class start_point{
    public static void main(String[] args) {
        Node head = new Node ( 1);
        head.next = new Node ( 2);
        head .next.next= new Node ( 3);
        head.next.next.next = new Node(-4);
        head.next.next.next.next = head.next;
        Operations op = new Operations();
        Node result = op.detect(head);
        if( result!=null)
        {
            System.out.println(" The start is " + result.data);


        }
        else {
            System.out.println(" it has no loop ");
        }

    }
}