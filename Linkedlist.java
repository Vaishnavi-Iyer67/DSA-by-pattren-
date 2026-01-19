// Creating a linked list in java 
class Node {
    int data;
    Node next;

    Node(int data1 ,Node next1)
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
public class Linkedlist {
    public static void main (String[] args )
    {
        int [] arr = { 1,2,3,4};
        Node a = new Node(arr[0]);
        System.out.println(a);
        System.out.println(a.data);



    }
    
}
