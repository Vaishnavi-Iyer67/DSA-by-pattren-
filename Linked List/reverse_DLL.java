
class Node {
    int data;
    Node next;
    Node prev;
    Node( int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;

    }
 }
class Operations{
    public Node reverse( Node head)
    {
        Node cur=head;
        Node newhead=null;
        while( cur!=null)
        {
            Node temp=cur.next;
            cur.next=cur.prev;
            cur.prev=temp;
            newhead=cur;
            cur=temp;

        }
        return newhead;

        
    

    }
    public void printlist( Node head)
    {
        Node cur=head;
        while( cur!=null)
        {
            System.out.print(cur.data + " ");
            cur=cur.next;
        }
    }
}
public class reverse_DLL {
    public static void main(String[] args) {
        Node head= new Node ( 1);
        head.next=new Node( 2);
        head.next.prev=head;
        head.next.next=new Node( 3);
        head.next.next.prev=head.next;
        Operations op = new Operations();
        System.out.println(" before rverse");

        op.printlist(head);
        System.out.println(" after reverse ");
        head=op.reverse(head);
        op.printlist(head);


                
    }
    
}
