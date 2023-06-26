package gelericLinkedList;

public class LinkedList<T>{
    private Node head;

    class Node{
        private T value;
        private Node next;

        private Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    void add(T element) {
        Node node = new Node(element);
        if (this.head == null) {
            this.head = node;
        } else {
            Node temp = this.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    void print() {
        Node iterator = head;
        while (iterator != null) {
            System.out.println(iterator.value + " ");
            iterator = iterator.next;
        }
    }

}
