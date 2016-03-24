package parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private int parkingCapacity;
    private List<Car> parkingLot = new ArrayList<Car>();

    public ParkingLot(int parkingCapacity) {
        this.parkingCapacity = parkingCapacity;
    }

    public int add(Car car) {
        parkingLot.add(car);
        return parkingLot.size();
    }
    public boolean isFull() {
        return parkingCapacity==parkingLot.size();
    }
}
