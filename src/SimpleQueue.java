/**
 * SimpleQueue class of Lab07
 *
 * @author Onur Ertunc
 * @version 24.12.2020
 */
public class SimpleQueue {

    // Instances
    private SimpleLinkedList queue;

    /**
     * constructor
     */
    public SimpleQueue() {
        queue = new SimpleLinkedList();
    }

    /**
     * add a String data to the tail of the queue
     * @param data
     */
    public void enqueue( String data ) {
        queue.addToTail( data );
    }

    /**
     * remove the data from the head of the queue
     * @return
     */
    public String dequeue() {
        return queue.removeFromHead();
    }

    /**
     *
     * @return
     */
    public boolean isEmpty() {
        return queue.isEmpty();
    }

}
