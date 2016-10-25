package projectfive;


/**
 * Created by Spencer on 10/24/2016.
 */
public class LinkedList {
    private static int size;
    private Node head;

    private Node tail;

    public LinkedList() {
        size = 0;
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public Element first() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    public Element last(){
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void addFirst(Element e){
        head = new Node(e, head);
        if (size == 0)
            tail = head;
        size++;
    }
    public void addLast(Element e){
        size++;
        Node currentNode = head;
        while(currentNode.getNext() != null) currentNode = currentNode.getNext();
        currentNode.setNext(new Node(e, null));
    }

    public Element removeFirst() {
        if(head != null) {
            Element temporaryElement = head.getElement();
            head = head.getNext();
            return temporaryElement;
        }
        return null;
    }

    public boolean add(int index, Element data) {
        size++;
        Node previousNode = null;
        Node currentNode = head;
        Node newNode;
        int count = 0;
        if (index < 0 || index > getSize()) {
            System.out.println("Please enter a valid index!");
            return false;
        }
        for (int a = 0; a < index; a++) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            newNode = new Node(data, previousNode.getNext());
            previousNode.setNext(newNode);
            newNode.setNext(currentNode);
        }
        return true;
    }

    public Element get(int index) {
        Node temporary = head;
        for (int a = 0; a < index; a++) temporary = temporary.getNext();
        return temporary.getElement();
    }

    public boolean remove(int index) {
        size--;
        Node previousNode = null;
        Node currentNode = head;
        if (index < 0 || index >= getSize()) {
            System.out.println("Index out of bounds fam!");
            return false;
        }

        //Set the nodes to the proper indexes
        for (int a = 0; a < index; a++) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }

        //Remove the node
        if (currentNode == getHead()) setHead(head.getNext());
        else previousNode.setNext(currentNode.getNext());

        //Update the tail
        if (currentNode == getTail()) setTail(previousNode);
        return true;
    }
    public String toString() {
        String output = "The LinkedList is blank";
        if (head != null) {
            output = "[" + head.getElement().toString() + "]";
            Node current = head.getNext();
            while (current != null) {
                output += "[" + current.getElement().toString() + "]";
                current = current.getNext();
            }
        }
        return output;
    }

    public static int getSize() {
        return size;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
}