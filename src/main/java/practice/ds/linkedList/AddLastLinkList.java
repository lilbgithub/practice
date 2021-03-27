package practice.ds.linkedList;

public class AddLastLinkList {
    public static class Node {
        int data;
        Node next;
    }

    public static class DemoLinkList {
        Node head;
        Node tail;
        int size;

        public void addLast(int val) {
            //Create node
            Node temp = new Node();
            temp.data = val;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;

            }
            size++;
        }

        public int size() {
            return this.size;
        }

        public void display() {
            Node node = this.head;
            while (node != null) {
                System.out.println(node.data);
                node = node.next;
            }
        }
    }

    public static void main(String[] args) {
        DemoLinkList list = new DemoLinkList();
        list.addLast(1);
        list.addLast(5);
        list.display();
        System.out.println("size is +" +list.size());

    }
}
