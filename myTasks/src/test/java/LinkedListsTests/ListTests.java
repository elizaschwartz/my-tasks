package LinkedListsTests;

import org.junit.Test;
import LinkedLists.*;

import static org.junit.Assert.assertEquals;

public abstract class ListTests {

    public abstract List getEmptyList();

    @Test
    public void addLastTest(){
        List list = getEmptyList();
        list.addLast(42);
        int actual = list.get(0);
        int expected = 42;

        assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        List list = getEmptyList();
        list.addLast(0); //0
        list.addLast(1); //1
        list.addLast(2); //2
        list.addLast(3); //3
        list.addLast(4); //4
        list.remove(2);
        int actual = list.get(2);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeThousandFromListOfThreeTest(){
        List list = getEmptyList();
        list.addLast(0); //0
        list.addLast(1); //1
        list.addLast(2); //2
        list.remove(1000);
    }

    @Test
    public void isEmptyTest(){
        List list = getEmptyList();
        boolean actual = list.isEmpty();
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void isNotEmptyTest(){
        List list = getEmptyList();
        list.addLast(38);
        boolean actual = list.isEmpty();
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    public void countTest(){
        List list = getEmptyList();
        list.addLast(38);
        list.addLast(3);
        list.addLast(15);
        int actual = list.count();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void emptyListCountTest(){
        List list = getEmptyList();
        int actual = list.count();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void getTest(){
        List list = getEmptyList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        int actual = list.get(3);
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getThousandFromListOfThreeTest(){
        List list = getEmptyList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.get(1000);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getMinusThousandFromListOfThreeTest(){
        List list = getEmptyList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.get(-1000);
    }

    @Test
    public void addTest(){
        List list = getEmptyList();
        list.addLast(1); //index 0
        list.addLast(2); //index 1
        list.addLast(3); //index 2
        list.addLast(4); //index 3
        list.addLast(5); //index 4
        list.add(2, 100500);
        int actual = list.get(2);
        int expected = 100500;

        assertEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeWhenEmpty(){
        List list = getEmptyList();
        list.remove(0);
    }

    @Test
    public void removeFirst(){
        List list = getEmptyList();
        list.addLast(123);
        list.remove(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeOutOfRange(){
        List list = getEmptyList();
        list.addLast(123);
        list.remove(100);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void addOutOfRange(){
        List list = getEmptyList();
        list.add(100, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void addWithNEgativeIndex(){
        List list = getEmptyList();
        list.addLast(111);
        list.add(-1, 1);
    }

    @Test
    public void addFirst(){
        List list = getEmptyList(); //()
        list.addLast(42); //(42)
        list.add(0, 111); //(111, 42)



        int actual = list.get(0);
        int expected = 111;

        assertEquals(expected, actual);
    }

    //////////////////
//////////task - BRACES///////////
    ////////////////////////
    private int getErrorIndex(List list, String braces) {


        for (int i = 0; i < braces.length(); i++){
          String ss = braces.substring(i,i+1);

          if( braces.substring(0,1).equals(")")){ // ")"
              return 0;
            }

          if (ss.equals("(")){
              list.addLast(i);

          } else {

              if (ss.equals(")")){

                  if (list.count()==1){
                      if(i == braces.length()-1){
                          return -1;
                      } else {
                          return i+1;

                      }
                 }


                  else {
                      list.remove(i-1);

                      }

              }

          }
        }
        return list.get(0);
    }


    @Test
    public void solveBracesProblem(){
        List list = getEmptyList();

        String braces = "(())";

        int indexOfError = getErrorIndex(list, braces);

        assertEquals(-1, indexOfError);
    }

    @Test
    public void solveBracesProblemNotCorrect(){
        List list = getEmptyList();

        String braces = "(()";

        int indexOfError = getErrorIndex(list, braces);

        assertEquals(0, indexOfError);
    }

    @Test
    public void solveBracesProblemNotCorrect2(){
        List list = getEmptyList();

        String braces = ")";

        int indexOfError = getErrorIndex(list, braces);

        assertEquals(0, indexOfError);
    }
}
