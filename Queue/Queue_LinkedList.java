
public class Queue_LinkedList {
    
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head;
        static Node tail;

        static boolean isEmpty(){
            if( head == null ) return  true;
            else return false;
        }

        static void add(int data){
            Node newNode = new Node(data);
            if (isEmpty()) {
              head = tail = newNode;
              return;                
            }
            tail.next = newNode;
            tail = newNode;
        }
        static int remove(){
            if(isEmpty()) return -1;
            int val = head.data;
            if(head.next == null){
                head = tail = null;
            }else{
                head = head.next;
            }

            return val;
        }

        static int peek(){
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        System.out.println(q.peek());
    }
}
