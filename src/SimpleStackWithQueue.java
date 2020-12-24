/**
 * simplestackwithqueue class of lab07
 *
 * @author Onur Ertunc
 * @version 24.12.2020
 */
public class SimpleStackWithQueue {

    // Instances
    private SimpleQueue queue1;
    private SimpleQueue queue2;

    /**
     * constructor
     */
    public SimpleStackWithQueue() {
        queue1 = new SimpleQueue();
        queue2 = new SimpleQueue();
    }

    /**
     * enqueues the element to queue2,
     * one by one dequeues everything from queue1 to queue2,
     * swaps the names of queue1 to queue2
     *
     * @param data
     */
    public void push( String data ) {
        queue2.enqueue( data );
        while( !queue1.isEnpty() ) {
            queue2.enqueue( queue1.dequeue() );
        }
        SimpleQueue temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    /**
     * dequeues an item form queue1 and returns it
     *
     * @return
     */
    public String pop() {
        return queue1.dequeue();
    }

    /**
     * toString of the class
     * @return
     */
    public String toString() {
        return queue1.toString();
    }
}
