class Node {
    int data;
    Node next;
    Node prev;

    Node( int data1)
    {
        data=data1;
        next=null;
        prev=null;

    }

}
class Operations{
    public Node delete_Node( Node head)
    {
        Node cur=head;
        if(head==null)return null;
        if(head.next==null) return null;

        
        while( cur.next!=null)
        {
            
            cur=cur.next;
            
        }
        cur.prev.next=null;
        return head;
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

public class delete_node_DLL {
    public static void main(String[] args) {
        Node head=new Node( 1) ;
        head.next=new Node( 2);
        head.next.prev=head;
        head.next.next=new Node(3);
        head.next.next.prev=head.next;
        Operations op = new Operations();
        System.out.println("before deletion ");
        op.printlist(head);
        System.out.println(" after deletion ");
        op.delete_Node(head);
        op.printlist(head);

        



       }
}
