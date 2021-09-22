package LinkedList;

public class LinkedList implements List {

    Node headNode;
    Node tailNode;
    int size;


    @Override
    public void add(int value) {
        if(headNode == null){
            headNode = new Node(value);
            tailNode = new Node (value);
        }else {
            Node newNode = new Node(value);
            tailNode.setNextNode(newNode);
            tailNode = newNode;
        }
        size++;
    }

    @Override
    public boolean removeNode(int value) {
        if(isEmpty()){
            return false;
        }
        else if (headNode.getValue() == value) {
            headNode = headNode.getNextNode();
            return true;
        }
        else{
            Node current = headNode.getNextNode();
            Node previous = headNode;
            while(current.getNextNode() != null){
                if(current.getValue() == value){
                    previous.setNextNode(current.getNextNode());
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return headNode == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addFront(int value) {
        Node newHead = new Node(value);
        newHead.setNextNode(headNode);

        headNode = newHead;
    }

    @Override
    public int get(int index) {
          int count = 0;
        if(!isEmpty()){
            Node current = headNode;
            while(current.getNextNode() != null){
                if(count == index)
                    return current.getValue();
                current = current.getNextNode();
            }
        }

        throw new IndexOutOfBoundsException();
    }

    @Override
    public boolean getValue(int value) {

        if(isEmpty())
            return false;
        else{
            Node current = headNode;
            while(current.getNextNode() != null){
                if(current.getValue() == value)
                    return true;
                current = current.getNextNode();
            }
        }
        return false;
    }

}
