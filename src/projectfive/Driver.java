package projectfive;

/**
 * Created by Spencer on 10/24/2016.
 */
public class Driver {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        LinkedList list = new LinkedList();
        System.out.println("List: " + list);
        Element e = new Element("A", 1);

        list.addFirst(e);
        System.out.println("New List: " + list + "\"");
        list.addLast(new Element("new data", 2));
        list.addLast(new Element("new data2", 22));
        list.addLast(new Element("new data3", 2344));
        list.addLast(new Element("D", 4));
        list.addLast(new Element("D111", 4));
        list.addLast(new Element("D222", 4));
        list.addLast(new Element("D333", 4));
        list.addLast(new Element("D444", 4));
        System.out.println("New List: " + list + "\"");
        list.removeFirst();
        System.out.println("Removed: [ " + list.getTail() + "]\n\nNew List: " + list + "\"");
        int position = 1;
        Element sampleElement = new Element("Position 2", 2);
        list.add(position, sampleElement);
        System.out.println("Added: [" + sampleElement + "] to position " + position + "\n\nNew List: " + list + "\"");
        /*list.addFirst(e1);
        list.addFirst(e2);list.addFirst(e3);
        System.out.println(e);
        System.out.println(list);
        list.addLast(e3);
        System.out.println(list);
        list.add(e3, 2);
        System.out.println(list);*/
//insert in the circularly linked list
//Show an example of every method and output the list before and after
    }
}