/*
    Job of ParkingLot
        should park cars.
 */
package parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotAttendant {
    private List<ParkingLot> parkingLots = new ArrayList<ParkingLot>();

    public boolean park(Car car) throws ParkingLotFullException {
        for (ParkingLot parkingLot : parkingLots) {
            if(!parkingLot.isFull()){
                parkingLot.add(car);
                return true;
            }
        }
        throw new ParkingLotFullException();
    }


    public void addParkingLot(ParkingLot parkingLot) {
        parkingLots.add(parkingLot);
    }

    public  int noOfParkingLots() {
        return this.parkingLots.size();
    }

    public boolean isFull(ParkingLot parkingLot) {
        return parkingLot.isFull();
    }
}
