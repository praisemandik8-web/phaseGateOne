import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest{

    @Test
    public void testThatIHaveAListOfNumbersIGetTheLargest(){
        int [] numbers = {1,2,5,7,6,8,9};
        int expected = 8,-2;
        int actual = Array2.getArray(countArray, number);
        assertEquals(actual, expected);
    } 

