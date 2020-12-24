/**
 * Node class of the lab07
 * @author Onur Ertunc
 * @version 24.12.2020
 */
public class Node {

    // Attributes
    private String data;
    private Node next;

    /**
     * constructor of the Node class
     * @param data
     */
    public Node( String data ) {
        this.data = data;
        this.next = null;
    }

    /**
     * constructor of the Node class
     * @param data
     * @param next
     */
    public Node( String data, Node next ) {
        this.data = data;
        this.next = next;
    }

    /**
     * returns the data
     * @return data
     */
    public String getData() {
        return data;
    }

    /**
     * returns the next in the Node
     * @return next
     */
    public Node getNext() {
        return next;
    }

    /**
     * sets the param to the next in the node
     * @param next Node
     */
    public void setNext( Node next ) {
        this.next = next;
    }
}
