import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(750);
        priorityQueue.add(500);
        priorityQueue.add(50);
        priorityQueue.add(900);
        priorityQueue.add(100);
        //natural ascending order

        System.out.println(priorityQueue.size());
        Integer poll = priorityQueue.poll();
        System.out.println(priorityQueue.size());
        System.out.println(poll);
    }
}
