package stack_queues;

public class Queues_refresh {

    public static void main(String[] args) {
        Queues myQueue = new Queues();
        
        myQueue.add(0);
        myQueue.add(1);
        myQueue.add(2);
        
        System.out.println("The First Queue: " + myQueue.peek());
        
        System.out.println("Queue:");
        myQueue.show();
        
//        while(!myQueue.isEmpty()){
//            System.out.println("Queues: " + myQueue.remove());
//        }
    }
    
    public static class Queues{
        private static class Node{
            private int data;
            private Node pointer;
            private Node(int data){
                this.data = data;
            }
        }
        
        private Node head;
        private Node tail;
        
        public boolean isEmpty(){
            return head == null;
        }
        public int peek(){
            if(head == null){
                throw new IllegalStateException("Queue is empty");
            }
            return head.data;
        }
        public void add(int data){
            Node node = new Node(data);
            if(tail != null){
                tail.pointer = node;
            }
            tail = node;
            if(head == null){
                head = node;
            }
        }
        public int remove(){
            if(head == null){
                throw new IllegalStateException("Queue is empty");
            }
            int data = head.data;
            head = head.pointer;
            if(head == null){
                tail = null;
            }
            return data;
        }
        public void show(){
            if(head == null){
                throw new IllegalStateException("Queue is empty");
            }  
            Node current = head;
            while(current != null){
                System.out.print(current.data + " ");
                current = current.pointer;
            }
            
        }
    }
}
