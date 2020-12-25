public class TestClass {

    public static void main( String[] args ) {

        // Properties
        SimpleLinkedList testList = new SimpleLinkedList();
        SimpleQueue testQueue = new SimpleQueue();
        SimpleStackWithQueue testStackQueue = new SimpleStackWithQueue();

        testList.addToTail( "2" );
        testList.addToTail( "4" );
        testList.addToTail( "5" );
        testList.addToTail( "7" );
        testList.addToTail( "9" );

        System.out.println( "--------------------------- LinkedList Test ---------------------------" );
        System.out.println( "First test:" );
        System.out.println( testList );
        System.out.println();

        System.out.println( "The element 5 is in the node: " );
        System.out.println( testList.get( "5") );
        System.out.println();

        System.out.println( "Remove from head: " );
        System.out.println( testList.removeFromHead() );
        System.out.println();

        System.out.println( "Test of isEmpty() method" );
        System.out.println( testList.isEmpty() );
        System.out.println();

        System.out.println( "Add to the end: " );
        System.out.println( "before adding: " + testList );
        testList.addToTail( "onur" );
        System.out.println( "after adding: " + testList );
        System.out.println();
        System.out.println( "-----------------------------------------------------------------------" );
        System.out.println();
        System.out.println( "--------------------------- Queue Test --------------------------------" );

        System.out.println( "testQueue is empty result:" );
        System.out.print( testQueue.isEnpty() );

        System.out.println( "Queue - enqueue: " );
        testQueue.enqueue( "o" );
        testQueue.enqueue( "n" );
        testQueue.enqueue( "u" );
        testQueue.enqueue( "r" );
        testQueue.enqueue( "C" );
        testQueue.enqueue( "S" );
        System.out.println( "done" );
        System.out.println();

        /*System.out.println( "Queue - enqueue: " );
          System.out.println( testQueue.toString() );
          System.out.println( "done" );
          System.out.println();
         */
        System.out.println( "testQueue is empty result:" );
        System.out.print( testQueue.isEnpty() );
        System.out.println();

        System.out.println( "Queue - dequeue: " );
        testQueue.dequeue();
        testQueue.dequeue();
        testQueue.dequeue();
        testQueue.dequeue();
        testQueue.dequeue();
        testQueue.dequeue();
        System.out.println( "done" );
        System.out.println();

        System.out.println( "testQueue is empty result:" );
        System.out.print( testQueue.isEnpty() );
        System.out.println();
        System.out.println( "-----------------------------------------------------------------------" );
        System.out.println();
        System.out.println( "------------------------------- Stack Test ----------------------------" );
        System.out.println( "Push: " );
        testStackQueue.push( "CS" );
        System.out.println( testStackQueue.toString() );
        System.out.println();
        System.out.println( "Pop: " );
        System.out.println( testStackQueue.pop() );
        System.out.println( testStackQueue.toString() );
        System.out.println( "-----------------------------------------------------------------------" );
    }
}

