import javax.sound.sampled.Line;

/**
 * LinearNode represents a node in a linked list.
 *
 * @author Dr. Lewis
 * @author Dr. Chase
 * @version 1.0, 08/13/08
 */

public class LinearNode<E>
{
    private LinearNode<E> next;
    private E element;
    
    /**
     * Creates an empty node.
     */
    public LinearNode()
    {
        next = null;
        element = null;
    }
    
    /**
     * Creates a node storing the specified element.
     *
     * @param elem  the element to be stored within the new node
     */
    public LinearNode (E elem)
    {
        next = null;
        element = elem;
    }
    
    /**
     * Returns the node that follows this one.
     *
     * @return  the node that follows the current one
     */
    public LinearNode<E> getNext()
    {
        return next;
    }
    
    /**
     * Sets the node that follows this one.
     *
     * @param node  the node to be set to follow the current one
     */
    public void setNext (LinearNode<E> node)
    {
        next = node;
    }
    
    /**
     * Returns the element stored in this node.
     *
     * @return  the element stored in this node
     */
    public E getElement()
    {
        return element;
    }
    
    /**
     * Sets the element stored in this node.
     *
     * @param elem  the element to be stored in this node
     */
    public void setElement (E elem)
    {
        element = elem;
    }

    public String toString(){
        String str = "";
        str += this.element + "->";
        LinearNode temp = this.getNext();
        while (temp != null){
            str += temp.getElement() + "->";
            temp = temp.getNext();
        }
        return str;
    }

    public static void main(String[] args) {
        /**
        System.out.println("Hello world");

        LinearNode<Integer> node1 = new LinearNode<Integer>(1);
        LinearNode<Integer> node2 = new LinearNode<Integer>(2);
        LinearNode<Integer> node3 = new LinearNode<Integer>(3);
        LinearNode<Integer> node4 = new LinearNode<Integer>(4);
        LinearNode<Integer> node22 = new LinearNode<Integer>(22);

        node1.setNext(node2);
        node2.setNext(node3);
        node2.setNext(node22);
        node22.setNext(node3);
        node3.setNext(node4);

        System.out.println(node1);
         */

        char []arr = new char[5];
        arr[0] = 'H';
        arr[1] = 'A';
        arr[2] = 'P';
        arr[3] = 'P';
        arr[4] = 'Y';

/*        LinearNode<Character> nodeH = new LinearNode<Character>(arr[0]);
        LinearNode<Character> nodeA = new LinearNode<Character>(arr[1]);
        LinearNode<Character> nodeP = new LinearNode<Character>(arr[2]);
        LinearNode<Character> nodeP2 = new LinearNode<Character>(arr[3]);
        LinearNode<Character> nodeY = new LinearNode<Character>(arr[4]);
*/

        //headNote currentNode nextNode
        //make a headnote
        //

        LinearNode<Character> headNode = new LinearNode<Character>(arr[0]);
        LinearNode<Character> currentNode = headNode;
        //currentnode H
        LinearNode<Character> nextNode = new LinearNode<Character>(arr[1]);
        currentNode.setNext(nextNode);
        //currentNode H A
        System.out.println(currentNode);
        for(int i = 2; i < arr.length; i++){
            currentNode = nextNode;
            nextNode = new LinearNode<Character>(arr[i]);
            currentNode.setNext(nextNode);
        }
        System.out.println(currentNode);
        /**
        //2nd round in the loop
        currentNode = tempNode;
        tempNode = new LinearNode<Character>(arr[2]);
        currentNode.setNext(tempNode);

        currentNode = tempNode;
        tempNode = new LinearNode<Character>(arr[3]);
        currentNode.setNext(tempNode);

        currentNode = tempNode;
        tempNode = new LinearNode<Character>(arr[4]);
        currentNode.setNext(tempNode);
         */
        //nodeH.setNext(nodeA);
        //nodeA.setNext(nodeP);
        //nodeP.setNext(nodeP2);
        //nodeP2.setNext(nodeY);

        System.out.println(headNode);





        /*
        LinearNode<Character> nodeA = new LinearNode<Character>('H');
        LinearNode<Character> nodeB = new LinearNode<Character>('A');
        LinearNode<Character> nodeC = new LinearNode<Character>('P');
        LinearNode<Character> nodeD = new LinearNode<Character>('P');
        LinearNode<Character> nodeY = new LinearNode<Character>('Y');
         */


        /**
        nodeA.setNext(nodeB);
        nodeB.setNext(nodeC);
        nodeC.setNext(nodeD);
        nodeD.setNext(nodeY);

         */
        //System.out.println(nodeA);

    }
}

