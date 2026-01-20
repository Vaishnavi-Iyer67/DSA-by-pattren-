
//insert front 
class Node{
    int data;
    Node next;

    Node( int data1 , Node next1)
    {
        data=data1;
        next=next1;
    }
    Node( int data2)
    {
        data=data2;
        next=null;


    }
}
class Operations{
    public Node inserthead( Node head,int newdata)
    {
        Node newNode = new Node( newdata, head);
        return newNode;

    }
    public void printlist( Node head)
    {
        Node temp=head;
        while( temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }

    }
}

public class Linkedlistop {
    public static void main ( String[] args )
    {
        Operations a = new Operations();
        Node head= new Node( 1);
        head.next=new Node( 2);
        System.out.println(" list before insertion " );
        a.printlist(head);
        System.out.println();
        System.out.println("list after insertion ");
        head=  a.inserthead(head, 0);
        a.printlist(head);

    }

    
}
