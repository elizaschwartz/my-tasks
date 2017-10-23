package LinkedLists;

public class DoubleLinkedList implements List {
    DoubleLinkedElement head;

    public DoubleLinkedList() {
        this.head = null;
    }

    public int get(int index) {
        return getElement(index).data;
    }

    public void addLast(int newNumber) {
        if(isEmpty()){
            DoubleLinkedElement newElement = new DoubleLinkedElement(newNumber);
            head = newElement;
            return;
        }

        DoubleLinkedElement last = getElement(count() - 1);

        DoubleLinkedElement newElement = new DoubleLinkedElement(newNumber);
        newElement.previous = last;

        last.next = newElement;
    }

    public void add(int index, int newNumber) {
        if(index > count() || index < 0){
            throw new IndexOutOfBoundsException("wrong index "+index);
        }

        DoubleLinkedElement current = getElement(index);

        DoubleLinkedElement newElement = new DoubleLinkedElement(newNumber);
        newElement.next = current;
        newElement.previous = current.previous;

        if(current != head) {
            current.previous.next = newElement;
        } else {
            head = newElement;
        }

        current.previous = newElement;

    }

    public void remove(int index) {
        if(index < 0 || index >= count()){
            throw new IndexOutOfBoundsException();
        }

        if(count() == 1){
            if(index == 0){
                head = null;
                return;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        DoubleLinkedElement current = getElement(index);

        current.previous.next = current.next;
        current.next.previous = current.previous;
    }

    public int count() {
        if(isEmpty()){
            return 0;
        }

        int result = 1;
        DoubleLinkedElement current = head;


        while (current.next != null){
            result += 1;
            current = current.next;
        }

        return result;
    }

    private DoubleLinkedElement getElement(int index){
        DoubleLinkedElement current = head;
        int currentIndex = 0;

        while (currentIndex != index){
            current = current.next;
            currentIndex += 1;
        }
        return current;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
