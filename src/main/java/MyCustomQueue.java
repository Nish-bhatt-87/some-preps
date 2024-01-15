
class Nodel {
    int data;
    Nodel next;

    public Nodel(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MyCustomQueue {
    private Nodel front, rear;

    public MyCustomQueue() {
        this.front = this.rear = null;
    }

    void enqueue(int data) {
        Nodel newNode = new Nodel(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    int dequeue() {
        if (front == null)
            return -1;

        int data = front.data;
        front = front.next;

        if (front == null)
            rear = null;

        return data;
    }

    boolean isEmpty() {
        return front == null;
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Queue queue = new Queue();
//
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//
//        System.out.println(queue.dequeue() + " dequeued from the queue");
//        System.out.println("Is the queue empty? " + queue.isEmpty());
//    }
//}
