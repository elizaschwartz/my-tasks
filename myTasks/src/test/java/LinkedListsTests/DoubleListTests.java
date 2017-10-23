package LinkedListsTests;
 import LinkedLists.*;
public class DoubleListTests extends ListTests {
    @Override
    public List getEmptyList() {
        return new DoubleLinkedList();
    }
}
