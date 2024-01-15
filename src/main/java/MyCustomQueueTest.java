public class MyCustomQueueTest {

    public static void main(String[] args) {
        MyCustomQueue queue = new MyCustomQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue() + " dequeued from the queue");
        System.out.println(queue.dequeue() + " dequeued from the queue");
        System.out.println(queue.dequeue() + " dequeued from the queue");
        System.out.println(queue.dequeue() + " dequeued from the queue");
        System.out.println("Is the queue empty? " + queue.isEmpty());
        queue.enqueue(88);
        System.out.println("Is the queue empty? " + queue.isEmpty());
        System.out.println(queue.dequeue() + " dequeued from the queue");
        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}
