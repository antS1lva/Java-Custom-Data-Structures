package dataStructures.nodes;

/**
 * DoubleNode represents a node in a doubly linked list with generic data.
 *
 * @param <T> the type of data stored in the node
 */
public class DoubleNode<T> {

    private DoubleNode<T> next;
    private DoubleNode<T> previous;
    private T data;

    /**
     * Constructs a DoubleNode with the specified element and next, previous references.
     *
     * @param element the data for the node
     * @param node1   the next node reference
     * @param node2   the previous node reference
     */
    public DoubleNode(T element, DoubleNode<T> node1, DoubleNode<T> node2) {
        data = element;
        next = node1;
        previous = node2;
    }

    /**
     * Constructs an empty DoubleNode with null data, next, and previous references.
     */
    public DoubleNode() {
        this(null, null, null);
    }

    /**
     * Constructs a DoubleNode with the specified element and null next and previous references.
     *
     * @param element the data for the node
     */
    public DoubleNode(T element) {
        this(element, null, null);
    }

    /**
     * Constructs a DoubleNode with null data and specified next and previous references.
     *
     * @param node1 the next node reference
     * @param node2 the previous node reference
     */
    public DoubleNode(DoubleNode<T> node1, DoubleNode<T> node2) {
        this(null, node1, node2);
    }

    /**
     * Returns the data stored in the node.
     *
     * @return the data of the node
     */
    public T getData() {
        return data;
    }

    /**
     * Sets the data of the node.
     *
     * @param data the data to be set
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Returns the next node reference.
     *
     * @return the next node reference
     */
    public DoubleNode<T> getNext() {
        return next;
    }

    /**
     * Sets the next node reference.
     *
     * @param next the next node reference
     */
    public void setNext(DoubleNode<T> next) {
        this.next = next;
    }

    /**
     * Returns the previous node reference.
     *
     * @return the previous node reference
     */
    public DoubleNode<T> getPrevious() {
        return previous;
    }

    /**
     * Sets the previous node reference.
     *
     * @param previous the previous node reference
     */
    public void setPrevious(DoubleNode<T> previous) {
        this.previous = previous;
    }
}