package boot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by narendrasharma on 07/10/15.
 */
public class ParkingLotTest {

    private String carNumber="MH43-S-7653";
    private Car car;
    @Before
    public void setup(){
        ParkingLot parkingLot = new ParkingLot();

        car = new Car(carNumber);
    }
    @Test
    public void parkingLotShouldGiveAParkingTicketWithCarNumberAfterParkingACar(){

        ParkingLot parkingLot = new ParkingLot();
        ParkingTicket parkingTicket = parkingLot.park(car);
        assertEquals(carNumber,parkingTicket.getNumber());
    }

//    @Test
//    public void shouldBeAbleToFindAParkedCar(){
//
//        parkingLot.park(car);
//        parkingLot.find();
//
//    }

}
