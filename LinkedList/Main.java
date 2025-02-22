package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedLlist = new LinkedList();

        myLinkedLlist.Append(5);
        myLinkedLlist.prepend(8);
        //  System.out.println(myLinkedLlist.get(1));
      
        myLinkedLlist.printList();
        myLinkedLlist.reverse();
        myLinkedLlist.printList();
        //   System.out.println((myLinkedLlist.insert(1,29)));
        // System.out.println(myLinkedLlist.get(1));

    }
}
