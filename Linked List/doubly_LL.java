class Node{
    int data;
    Node next;
    Node prev ;

    Node( int data1, Node next1, Node prev1)
    {
        data= data1;
        next= next1;
        prev= prev1;



    }
    Node ( int data2)

    {
        data = data2;
        next=null;
        prev=null;

    }

}


public class doubly_LL {
    public static void main(String[] args) {
        Node head= new Node( 1);
        head.next=new Node ( 2);
        System.out.println(head);
        System.out.println(head.data);
        
    }
    
}
