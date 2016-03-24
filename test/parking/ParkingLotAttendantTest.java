package parking;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingLotAttendantTest {
    ParkingLotAttendant parkingLotAttendant;
    @Before
    public void setUp() throws Exception {
        parkingLotAttendant = new ParkingLotAttendant();
    }

    @Test
    public void shouldBeAbleToParkACar() throws ParkingLotFullException {
        ParkingLotAttendant parkingLotAttendant = new ParkingLotAttendant();
        parkingLotAttendant.addParkingLot(new ParkingLot(1));
        parkingLotAttendant.addParkingLot(new ParkingLot(2));
        assertEquals(true, parkingLotAttendant.park(new Car()));
    }

    @Test
    public void shouldBeAbleToHandleMoreThanOneParkingLot() {
        parkingLotAttendant.addParkingLot(new ParkingLot(2));
        parkingLotAttendant.addParkingLot(new ParkingLot(2));
        assertEquals(2,parkingLotAttendant.noOfParkingLots());
    }

    @Test
    public void shouldBeAbleToKnowWhenTheParkingSpaceIsFull() {
        ParkingLot parkingLot = new ParkingLot(0);
        assertEquals(true, parkingLotAttendant.isFull(parkingLot));
    }
}