package CodeWarsTests;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import CodeWarsTasks.*;

public class CountingDuplicatesTest {

    @Test
    public void test1(){
        assertEquals(0, CountingDuplicates.duplicateCount("abc"));
    }

    @Test
    public void test2(){
        assertEquals(2, CountingDuplicates.duplicateCount("akakaalop"));
    }

    @Test
    public void test3(){
        assertEquals(1, CountingDuplicates.duplicateCount("abcdsoo"));
    }
}
