package LinkedList;

public class Node {

    private Node nextNode;
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getNextNode() {
        return nextNode;
    }
}
