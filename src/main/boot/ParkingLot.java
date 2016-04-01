package boot;

/**
 * Created by narendrasharma on 07/10/15.
 */
public class ParkingLot {
    private boolean hasCar;

    //    private private/
    public ParkingTicket park(Car car) {
        hasCar = true;
        return new ParkingTicket(car.getCarNumber());
    }

}