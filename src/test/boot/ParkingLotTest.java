package boot;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by narendrasharma on 07/10/15.
 */
public class ParkingLotTest {

    


    @Test
    public void parkingLotShouldGiveAParkingTicketWithCarNumberAfterParkingACar(){


        String carNumber="MH43-S-7653";
        Car car = new Car(carNumber);
        ParkingLot parkingLot = new ParkingLot();
        ParkingTicket parkingTicket = parkingLot.park(car);
        assertEquals(carNumber,parkingTicket.getNumber());
    }

//    @Test
//    public void shouldBeAbleToFindAParkedCar(){
//
//
//        Car car = new Car();
//        ParkingLot parkingLot = new ParkingLot();
//        parkingLot.park(car);
//        parkingLot.find();
//
//    }

}
