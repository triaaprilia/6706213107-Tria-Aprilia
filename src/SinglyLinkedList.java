import java.util.NoSuchElementException;

public class SinglyLinkedList<E> {
    private ListNode<E> firstNode;
    private ListNode<E> lastNode;
    private String Nama;

    public SinglyLinkedList() {
        this("linked list");
    }
    public SinglyLinkedList(String listName) {
        Nama = listName;
        firstNode = lastNode = null;
    }
    // input data awal list
    public void insertAtFront(E insertItem) {
        ListNode<E> newNode = new ListNode<E>(insertItem);
        if (isEmpty()) {
            firstNode = lastNode = new ListNode<E>(insertItem);
        } else {
            newNode.next = firstNode;
            firstNode = newNode;
        }
    }
    // input data akhir list
    public void insertAtBack(E insertItem) {
        ListNode<E> newNode = new ListNode<E>(insertItem);
        if (isEmpty()) {
            firstNode = lastNode = new ListNode<E>(insertItem);
        } else {
            lastNode.next = newNode;
            lastNode = newNode;
        }
    }
    //remove dari awal list
    public E removeFromFront() throws NoSuchElementException {
        if (isEmpty()) { // throw exception if List is empty
            throw new NoSuchElementException(Nama + " is empty");
        }
        E removedItem = lastNode.data; // retrieve data being
        // update references firstNode and lastNode
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            firstNode = firstNode.next; // current is new lastNode
        }
        return removedItem;
    }
    //remove dari akhir list
    public E removeFromBack() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(Nama + " is empty");
        }
        E removedItem = lastNode.data;

        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            ListNode<E> current = firstNode;

            while (current.next != lastNode) {
                current = current.next;
            }
            lastNode = current;
            current.next = null;
        }
        return removedItem;
    }
    private boolean isEmpty() {
        return firstNode == null;
    }
    //Menampilkan data
    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s%n", Nama);
            return;
        }
        System.out.printf("The %s is: %n", Nama);
        ListNode<E> current = firstNode;

        while (current != null) {
            System.out.printf("%s %n ", current.data);
            current = current.next;
        }
        System.out.println();
    }
}

