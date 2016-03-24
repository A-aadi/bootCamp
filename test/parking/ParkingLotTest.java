package parking;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingLotTest {
    @Test
    public void shouldAddCarToTheParking() throws Exception {
        ParkingLot parkingLot = new ParkingLot(2);
        assertEquals(1,parkingLot.add(new Car()));
    }

    @Test
    public void shouldBeAbleToTellIfTheParkingLotIsFull() {
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.add(new Car());
        assertEquals(true, parkingLot.isFull());
    }
}