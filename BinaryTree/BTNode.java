

/*
    This is the node that we are using for our Binary Tree...

    We know that we need some type of data...

    we need a left node and a right node
*/
public class BTNode<T> { // class definition..

    //instances variables...we have a object of type T and then also we are referring to a left and a right node...
    protected T element;
    protected BTNode<T> left;
    protected BTNode<T> right;


    public BTNode(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        String leftVal = (left == null ? "NULL" : left.element.toString());
        String rightVal = (right == null ? "NULL" : right.element.toString());
        return "BTNode{" + "element=" + element + ", left=" + leftVal + ", right=" + rightVal + '}';
    }


}