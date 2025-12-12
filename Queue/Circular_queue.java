

public class Circular_Queue {
    static class Queue{
        static int[] arr;
        static int front;
        static int rear;
        static int size;
        Queue(int n){
            arr = new int[n];
            front = rear = -1;
            size = n;
        }


        static boolean isEmpty(){
            if (rear == -1 && front == -1) {
                return true;
            }else return false;
        }
        static boolean isFull(){
            if( (rear + 1) %  size ==  front) return true;
            else return false;
        }

        public static void add(int data){
           if (isFull()) {
            System.out.println("queue is full");
           }

           rear = (rear + 1) % size ;
           arr[rear] = data;
           //adding 1st element
           if(front == -1) front = front + 1;

        }

        public static int remove(){
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int val = arr[front];
      
            if(front == rear ) front = rear = -1;
            else  front = ( front + 1) % size;
            return val;

        }

        public static int peek(){
            if(isEmpty()) return -1;
            return arr[front];
        }
    }
  

    public static void main(String[] args) {
        
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
