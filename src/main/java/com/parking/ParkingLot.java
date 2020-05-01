package com.parking;

public class ParkingLot {
    private Object vehicle;

    public boolean park(Object vehicle) {
        this.vehicle = vehicle;
        return true;
    }
}
