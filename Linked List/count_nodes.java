class Node {
    int data;
    Node next;

    Node ( int data1)
    {
        data= data1;
        next=null;

    }
}
class Operations{
    public int count_nodes ( Node head )

    {
        int count=0;
        Node temp=head;
        while( temp!=null)
        {
            count++;
            temp=temp.next;

        }
        return count;

    }
}

public class count_nodes {
    public static void main(String[] args) {
        Node head= new Node ( 1);
        head.next = new Node( 2);
        head.next.next= new Node( 3);
        Operations c = new Operations();
        System.out.println(" Number of nodes ( count)= "+ c.count_nodes(head));


    }
    
}
