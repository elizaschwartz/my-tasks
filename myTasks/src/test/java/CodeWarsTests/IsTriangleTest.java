package CodeWarsTests;


import org.junit.Test;
import static org.junit.Assert.*;
import CodeWarsTasks.*;

public class IsTriangleTest {

    @Test
    public void basicTest1(){
        assertEquals(true, Kata.isTriangle(1,2,2));

    }

    @Test
    public void basicTest2(){
        assertEquals(false, (Kata.isTriangle(7,2,2)));

    }
}
