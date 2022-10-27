
public interface BinaryTree<T extends Comparable<T>> {
    /**
     * This method will insert a element into the tree
     * @param elem
     */
    //O1.compareTo(O2): 0 for equal, O1>O2 = +ve, O1<O2 = -ve
    public void insert(T elem);

    /**
     * This method returns true if there are no nodes in the tree otherwise it will be false
     * @return
     */
    public boolean isEmpty();

    public void inOrder();
    //elements in the ascending order of their values
    /**
     * returns a count of every node in the tree
     * @return
     */
    public int size();

    /**
     * This method locates and returns the largest value stored in the tree
     * as defined by it location in the tree
     * @return
     */
    public T findMax();

        /**
     * This method locates and returns the smallest value stored in the tree
     * as defined by it location in the tree
     * @return
     */
    public T findMin();

    /**
     * returns true if the element can be found in the tree otherwise false
     * @param element
     * @return
     */
    public boolean contains(T element);

    /**
     * This method removes the node which stores the element from the tree and
     * restructures the tree such that and children of the removed node remain in the tree
     * @param element
     * @return
     */
    public boolean remove(T element);
}