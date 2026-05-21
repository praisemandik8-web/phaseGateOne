import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest{

    @Test
    public void testThatIHaveAListOfNumbersIGetTheLargest(){
        int [] numbers = {8,6,12,4,-2};
        int expected = 8,-2;
        int actual = Array.getArray(countArray, number);
        assertEquals(actual, expected);
    } 

