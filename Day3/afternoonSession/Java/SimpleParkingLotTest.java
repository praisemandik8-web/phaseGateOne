import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleParkingLotTest{

    @Test
    public void testThatArrayIsNotEmptyAndNull(){
    int [] parkingLot = {1,0,0,1,1,0,1,1,1,1,0,0,0,1,0,0,0,0};
    int expected = {1,0,0,1,1,0,1,1,1,1,0,0,0,1,0,0,0,0};
    
    assertArrayNotNull(SimpleParkingLot.checkSlot);
    }

        @Test
    public void testThatReverseArrayGivesArrayFromTheLastElement(){
        int [] ParkingLot = {1,0,0,1,1,0,1,1,1,1,0,0,0,1,0,0,0,0};
        int [] expectedArray = 1,0,0,1,1,0,1,1,1,1,0,0,0,1,0,0,0,0};
        int [] actualArray = SimpleParkingLot.checkSlot();
        assertArrayEquals(ParkingLot, expectedArray);
    }

