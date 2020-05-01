package com.parkingtest;

import com.parking.ParkingLot;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ParkingTest {
    static Object vehicle = null;

    @BeforeClass
    public static void beforeClass() throws Exception {
        vehicle = new Object();
    }

    @Test
    public void givenVehicle_WhenParked_ShouldReturnTrue() {
        ParkingLot parkingLot = new ParkingLot();
        boolean isParked = parkingLot.park(vehicle);
        Assert.assertTrue(isParked);
    }

}
