package parking;

public class ParkingLotFullException extends Exception {
    public ParkingLotFullException() {
        super("Parking lot is already full");
    }
}
