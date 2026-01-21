class Node {
    int data;
    Node next;
    Node( int data)
    {
        this.data=data;
        this.next=null;

    }
}
class Operations{
    public Node reverse_SLL( Node head){
        Node temp=head;
        Node prev = null;


      
        while( temp!=null)
        {
        Node front=temp.next;
        temp.next=prev;
        prev=temp;
        temp=front;

            
        }
        return prev;
        

    }
    public void printlist( Node head)
    {
        Node temp = head;
        while( temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;

        }
    }
}
public class reverse_SLL {
    public static void main(String[] args) {
        Node head= new Node( 1);
        head.next=new Node ( 2);
        head.next.next=new Node( 3);
        head.next.next.next=new Node (4);
        head.next.next.next.next=new Node( 5);
        Operations op = new Operations();
        System.out.println(" before reverse ");
        op.printlist(head);
        System.out.println(" after reverse ");
        head= op.reverse_SLL(head);
        op.printlist(head);

        
    
    }
    
}
