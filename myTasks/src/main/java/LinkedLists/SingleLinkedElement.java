package LinkedLists;

public class SingleLinkedElement {
    SingleLinkedElement next;
    int data;

    public SingleLinkedElement(int newData) {
        data = newData;
    }

    @Override
    public String toString() {
        return "SingleLinkedElement{data="+ data +'}';
    }
}
