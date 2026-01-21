// insert end in a DLL~
class Node {
    int data;
    Node next;
    Node prev;

    Node ( int data1)
    {
        data=data1;
        next=null;
        prev=null;

    }
    Node( int data2,Node next2,Node prev2)
    {
        data=data2;
        next=next2;
        prev=prev2;
    }
}
class Operations{
    public Node convertArr2DLL( int[] arr)
    {
        Node head = new Node ( arr[0]);
        Node back=head;
        for( int i=1;i< arr.length;i++)
        {
            Node temp = new Node( arr[i],null, back);
            back.next=temp;
            back=temp;

        }
        return head;
    }

    public  Node insert_node( Node head, int val)
    {
        Node newnode= new Node(val);
        if ( head==null)
        {
            return newnode;
        }
        Node temp=head;
        while( temp.next!=null)
        {
            temp=temp.next;

        }
        temp.next=newnode;
        newnode.prev=temp;
        return head;


    }
    public void printlist( Node head)
    {
        Node cur=head;
        while( cur!=null)
        {
            System.out.println(cur.data + " ");
            cur=cur.next;

        }
    }
}

public class insert_node_DLL {
    public static void main(String[] args) {
        int [] arr= { 1,2,3,4,};
        Operations op = new Operations();
        Node head = op.convertArr2DLL(arr);
        System.out.println(" Dll before insert end ");
        op.printlist(head);
        System.out.println(" after insertion ");
        op.insert_node(head,10);
        op.printlist( head);



    }
    
}
