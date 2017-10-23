package LinkedLists;

public class SingleLinkedList implements List {
    private SingleLinkedElement head;

    private SingleLinkedElement findLast(){
        SingleLinkedElement result = head;
        while (result.next != null){
            result = result.next;
        }
        return result;
    }

    private void newNext(SingleLinkedElement element, int newData){
        SingleLinkedElement newElement = new SingleLinkedElement(newData);
        element.next = newElement;
    }

    public SingleLinkedList() {
        this.head = null;
    }

    public int get(int index) {
        SingleLinkedElement current = head;
        int currentIndex = 0;
        while(currentIndex != index){
            currentIndex += 1;
            current = current.next;
        }
        return current.data;
    }

    public void addLast(int newNumber) {
        if(isEmpty()){
            head = new SingleLinkedElement(newNumber);
            return;
        }

        SingleLinkedElement last = findLast();
        newNext(last, newNumber);
    }

    public void add(int index, int newNumber) {
        SingleLinkedElement current = head;
        int currentIndex = 0;

        if (index < 0 || index > count()){
            throw new IndexOutOfBoundsException();
        }

        if (index == 0){
            SingleLinkedElement newElement = new SingleLinkedElement(newNumber);
            newElement.next = head;
            head = newElement;
            return;
        }

        while (currentIndex != index - 1) {
            current = current.next;
            currentIndex += 1;
        }

        SingleLinkedElement newElement = new SingleLinkedElement(newNumber);
        newElement.next = current.next;
        current.next = newElement;
    }

    public void remove(int index) {
        SingleLinkedElement current = head;
        SingleLinkedElement previous = null;
        int currentIndex = 0;

        if (isEmpty() || index < 0 || index >= count()){
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        while (currentIndex != index){
            previous = current;
            current = current.next;
            currentIndex += 1;
        }

        previous.next = current.next;
    }

    public int count() {
        if(isEmpty()) {
            return 0;
        }

        int result = 1;
        SingleLinkedElement current = head;

        while (current.next != null){
            result += 1;
            current = current.next;
        }

        return result;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
