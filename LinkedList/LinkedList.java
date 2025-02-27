package LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

//    public LinkedList(int value){
//        Node newNode = new Node(value);
//        this.head= newNode;
//        this.tail = newNode;
//        this.length = 1;
//    }

    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getLength() {
        System.out.println(this.length);
    }

    public void Append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;

        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node RemoveLast() {
        Node temp = head;
        Node pre = head;
        if (length == 0) return null;


        while (temp.next != null) {
            System.out.println("Values" + temp.value);
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        pre.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;

        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);

        Node temp = head;
        if (length == 0) {
            head = newNode;
            tail = newNode;

        } else {
            head = newNode;
            head.next = temp;
            length++;
        }
    }

    public Node removeFirst() {
        if (length == 0) return null;

        Node temp = head;
        head = temp.next;
        temp.next = null;
        length--;
        if (length == 0) {

            tail = null;

        }
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node newNode = new Node(value);
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            Append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
            length++;
            return true;
        }
        return false;
    }


    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) {
            return removeFirst();

        }
        if (index == length - 1) {
            return RemoveLast();
        }
        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;

        for (int i =0 ; i<length;i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
}
