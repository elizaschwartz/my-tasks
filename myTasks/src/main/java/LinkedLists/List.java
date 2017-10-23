package LinkedLists;

public interface List {
    int get(int index);
    void addLast(int newNumber);
    void add(int index, int newNumber);
    void remove(int index);
    int count();
    boolean isEmpty();
}
