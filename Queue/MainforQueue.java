package QueueStack;

public class MainforQueue {

    public static void main(String [] args) {

        Queue queue = new Queue();

        queue.enQ(55);
        queue.enQ(66);
        queue.enQ(1);
        queue.enQ(8);
        queue.enQ(550);

        queue.deQ();
        queue.showAll();
        queue.enQ(45);

        queue.showAll();

    }
}
