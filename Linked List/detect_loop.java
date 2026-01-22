import java.util.HashMap;

// detecting a loop in SLL 
class Node {
    int data;
    Node next;

    Node ( int data)
    {
        this.data=data;
        this.next=null;

    }
}
class Operations{
    public boolean detect( Node head)
    {
        Node temp = head;
        HashMap < Node ,Integer> nodemap = new HashMap<>();
        while( temp != null)
        {
            if(nodemap.containsKey(temp))
                return true;
            nodemap.put(temp,1);
            temp=temp.next;

        }
        return false ;

    }
}


public class detect_loop {
    public static void main(String[] args) {
        Node head= new Node ( 1);
        Node one = new Node ( 2);
        Node two = new Node( 3);
        Node three= new Node ( 4);
        head.next= one;
        one.next=two;
        two.next=three;
        three.next=two;
        Operations op = new Operations();
        if(op.detect(head))
        {
            System.out.println(" the loop is detected ");

        }
        else {
            System.out.println(" the loop is not detected ");
        }

    }
    
}
