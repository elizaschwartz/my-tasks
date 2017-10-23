package CodeWarsTests;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import CodeWarsTasks.*;

public class isNegativeTest {
    @Test
    public  void bacisTest1 (){
        assertEquals(-1, isNegative.makeNegative(1));
    }

    @Test
    public  void basicTest2(){
        assertEquals(0, isNegative.makeNegative(0));
    }

    @Test
    public  void basicTest3(){
        assertEquals(-128,isNegative.makeNegative(-128));
    }
    }