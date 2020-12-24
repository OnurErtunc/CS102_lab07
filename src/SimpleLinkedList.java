/**
 * SimpleLinkedList class that provides the properties of a linkedlist
 *
 * @author Onur Ertunc
 * @version 24.12.2020
 */
public class SimpleLinkedList {

    // Instances
    private Node head;

    /**
     * constructor of the SimpleLinkedList class
     */
    public SimpleLinkedList() {
        this.head = null;
    }

    /**
     * adds a String data to the tail of the linked list with inserting it to a node
     * @param data String param
     */
    public void addToTail( String data ) {

        // a new Node
        Node newNode = new Node( data );

        // check if the list is empty
        if ( isEmpty() ) {
            head = newNode;
        }
        else {
            Node temp = head;
            while ( temp.getNext() != null ) {
                temp = temp.getNext();
            }
            temp.setNext( newNode );
        }
    }

    /**
     * removes the node from head and returns the data in it
     * @return data of the removed node
     */
    public String removeFromHead() {
        if ( head == null ) {
            return null;
        }
        Node temp = head;
        head = head.getNext();
        return temp.getData();
    }

    /**
     * shows whether the node is empty or not
     * @return true or false
     */
    public boolean isEmpty() {
        return ( head == null );
    }

    /**
     * gets the data of the node
     * @param data
     * @return node
     */
    public Node get( String data ) {

        Node temp = head;

        while ( !temp.getData().equals( data ) ) {
            temp = temp.getNext();
        }
        if ( temp.getNext().equals( data ) ) {
            temp = temp.getNext();
        }
        return temp;

    }

    /**
     * string representation of the linkedlist
     * @return linkedlist
     */
    public String toString() {

        String returnUnit = "";

        Node temp = head;

        while ( temp != null ) {
            returnUnit = returnUnit + temp.getData() + " ";
        }

        return returnUnit;
    }
}
