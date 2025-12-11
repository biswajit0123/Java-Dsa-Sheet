public class LinkedList {
    class Node{
     int data ;
     Node next;
     Node(int data){
        this.data = data;
        this.next =null;
     }
    }

    public static Node head;
    public static Node tail;


    public void display(){
        Node cur = head;
        while (cur != null) {
            System.out.print(  "->"+ cur.data);
            cur = cur.next;
        }
        System.out.println();
    }
    public void addFirst(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next =  head;
            head = newNode;
        }
    }
   public void addLast(int data){
    Node newNode = new Node(data);

    if(head == null){
       head = tail = newNode;
    }else{
  tail.next = newNode;
        tail = newNode;
    }
   }


   public void reverse(){
    Node prev = null;
    Node cur = tail = head;
    Node nxt;

    while(cur != null){
         nxt = cur.next;
        cur.next = prev;
        prev = cur;
        cur = nxt;
    }
    head = prev;

   }

    
    public static void main(String[] a){
        LinkedList l = new LinkedList();
        l.addFirst(1);
        l.addFirst(2);

        l.addLast(3);
       l.addLast(4);
        l.display();
        l.reverse();
        l.display();
    }
}
