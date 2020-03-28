package linkedlist;

public class Runner {
    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        list.add(5);
//        list.add(3,12);
//        list.add(18);
        // Note this is internal implementation , there for i am gonna create a named LinkedList separately and define.

        LinkedList list = new LinkedList();
        list.insert(18);
        list.insert(45);
        list.insert(12);
        list.insertAtStart(25);
        list.insertAt(0,55 );
        list.deleteAt(2 );
        list.show();

    }
}
