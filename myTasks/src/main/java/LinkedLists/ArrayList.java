package LinkedLists;

public class ArrayList implements List {
    public int[] elements;
    public int count;

    public ArrayList() {
        elements = new int[10];
        count = 0;
    }

    public ArrayList(int length){
        elements = new int[length];
        count =0;
    }


    public int get(int index) {
        return elements[index];
    }

    public void addLast(int newNumber) {
        elements[count] = newNumber;
        count += 1;
    }

    public void add(int index, int newNumber) {
        //if arr > 10
        if (isEmpty()) {
            elements[0] = newNumber;
        }

        if (index>count-1){
            throw new IndexOutOfBoundsException();
        }

       if (count==elements.length) { //if we need to grow array

            int[] newArray = new int[elements.length*2];
            for (int i =0; i<elements.length; i++){  //coping arrray into bigger one
                newArray[i]=elements[i];
            }
            elements = newArray;
       }


        if (index < count) {


            for (int i = count - 1; i > index - 1; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = newNumber;
            count+=1;
        }


    }


    public void remove(int index) {
        if (isEmpty()){
            throw new IndexOutOfBoundsException();
        }

        if (index >count-1){
            throw new IndexOutOfBoundsException();
        }

        for (int i = index; i<count; i++ ){
            elements[i]=elements[i+1];

        }
        count -=1;


    }

    public int count() {
        return count;
    }

    public boolean isEmpty() {
        if (count == 0)
            return true;
        else return false;
    }
}

