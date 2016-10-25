package projectfive;

/**
 * Created by Spencer on 10/24/2016.
 */
public class CircularLinkedList {
    private static int size;
    private Node head;
    private Node tail;

    public CircularLinkedList() {
        size = 0;
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void rotate() {
        if (tail != null) {
            tail = tail.getNext();
        }
    }

    public void addFirst(Element e) {
        Node newest = new Node(e, null);
        if (tail == null) {
            tail = newest;
            tail.setNext(tail);
        } else {
            newest.setNext(tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }

    public void addLast(Element e) {
        addFirst(e);
        tail = tail.getNext();
    }

    public Element removeFirst() {
        if (isEmpty()) return null;
        Node head = tail.getNext();
        if (head == tail)  tail = null;
        else tail.setNext(head.getNext());
        size--;
        return head.getElement();
    }

    public void removeLastItem(){
        Node currentNode = head;
        Node previousNode = null;

        while(currentNode.getNext() != null) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }

        tail = previousNode;
        if(tail == null) head = null;
        else tail.setNext(null);
        size--;
    }

    public int size(){
        return size;
    }

    public Element first() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    public Element last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }
}