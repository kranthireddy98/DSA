package LinkedList;

public class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value + " ";
    }
}
