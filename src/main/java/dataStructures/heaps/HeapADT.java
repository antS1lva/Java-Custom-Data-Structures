package dataStructures.heaps;

import dataStructures.exceptions.EmptyCollectionException;
import dataStructures.trees.BinaryTreeADT;

/**
 * HeapADT defines the interface to a heap.
 */
public interface HeapADT<T> extends BinaryTreeADT<T> {
    /**
     * Adds the specified object to this heap.
     *
     * @param obj the element to added to this head
     */
    public void addElement(T obj);

    /**
     * Removes element with the lowest value from this heap.
     *
     * @return the element with the lowest value from this heap
     */
    public T removeMin() throws EmptyCollectionException;

    /**
     * Returns a reference to the element with the lowest value in
     * this heap.
     *
     * @return a reference to the element with the lowest value
     * in this heap
     */
    public T findMin() throws EmptyCollectionException;
}
