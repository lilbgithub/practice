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

        public void remove() {
            Node newHead = this.head.next;
            this.head = newHead;
            size--;
        }

        public int getFirst() {
            if (this.head == null) {
                System.out.println("List is empty");
                return -1;
            }
            return head.data;
        }

        public int getLast() {
            if (this.head == null) {
                System.out.println("List is empty");
                return -1;
            }
            return tail.data;
        }

        public int getAt(int index) {
            if (index >= size) {
                System.out.println("Index out of bond");
                throw new IndexOutOfBoundsException("Exceeded max index +" + this.size);
            }

            int count = 0;
            Node node = this.head;
            while (count != index) {
                count++;
                node = node.next;
            }
            return node.data;
        }

        public Node getNodeAt(int index) {
            if (index >= size) {
                System.out.println("Index out of bond");
                throw new IndexOutOfBoundsException("Exceeded max index +" + this.size);
            }

            Node node = this.head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node;
        }

        public void removeLast() {
            if (size == 0) {
                System.out.println("LIst is empty");
            } else if (size == 1) {
                tail = head = null;
                size = 0;
            } else {
                int count = 0;
                int index = size - 1;
                Node node = head;
                while (count != index) {
                    node = node.next;
                    count++;
                }
                node.next = null;
                size--;
            }
        }

        public void reverseDi() {
            //add size check
            //add first element check
            int hi = size - 1;
            int lo = 0;

            while (lo < hi) {
                Node left = getNodeAt(lo);
                Node right = getNodeAt(hi);

                int temp = left.data;
                left.data = right.data;
                right.data = temp;

                lo++;
                hi--;
            }
        }

        public void reversePointerIterative() {
            Node current = head;
            Node previous = null;

            while (current != null) {
                Node next = current.next;
                current.next = previous;

                previous = current;
                current = next;
            }
            Node temp = head;
            head = tail;
            tail = temp;
        }
    }

    public static void main(String[] args) {
        DemoLinkList list = new DemoLinkList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.addLast(9);
        list.remove();
        list.display();
        list.removeLast();

        System.out.println("getAt is " + list.getAt(1));
        System.out.println("size is " + list.size());
        System.out.println("getFirst is " + list.getFirst());
        System.out.println("getLast is " + list.getLast());
        System.out.println("Before remove last");
        list.display();
       // list.removeLast();
        System.out.println("After remove last");
        list.display();
        System.out.println("After reverse PI");
        list.reversePointerIterative();
        list.display();
        list.reverseDi();
        System.out.println("After reverse DI");
        list.display();

    }
}
