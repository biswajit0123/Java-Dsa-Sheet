
public class Queue_Array {

    static class Queue{
            static int[] arr;
            static int rear;
            static int front = 0;
        Queue(int n){
            rear = -1;
            arr = new int[n];
        }

 
        public static boolean isEmpty(){
            if(rear == -1)  return true;
            else return false;
        }
        public static void add(int data){
          if(rear == arr.length -1) System.out.println("queue is full");

          rear = rear+1;
          arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()) return -1;
            int val = arr[front];
            for(int i=0; i< rear; i++){
                arr[i] =arr[i + 1];
            }
            rear = rear -1;
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
