package datastructure.linklist;

public class Runner {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(45);
        list.insert(10);
        list.insert(33);
        list.show();

        list.insertAtStart(55);
        list.show();

        list.insertAt(2, 3);
        list.show();
    }

}
