public class Main {
    public static void main(String[] args) {
        // First in First out
        //enqueue -- adding to queue
        // dequeue -- remove from queue


        Queue queue = new Queue();

        queue.deQueue();
        queue.enQueue(5);

        queue.enQueue(7);


        queue.enQueue(9);


        queue.enQueue(5);

        queue.enQueue(7);


        queue.enQueue(15);
        System.out.println(queue.getSize());
        queue.show();
    }
}