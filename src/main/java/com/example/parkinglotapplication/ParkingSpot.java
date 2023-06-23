package com.example.parkinglotapplication;

public class ParkingSpot
{
    int spotNo;
    int level;
    String parkedVehicle;
    String vehicleLicenceNo;
    Boolean isAvaliable;

    public int getSpotNo() {
        return spotNo;
    }

    public void setSpotNo(int spotNo) {
        this.spotNo = spotNo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getParkedVehicle() {
        return parkedVehicle;
    }

    public void setParkedVehicle(String parkedVehicle) {
        this.parkedVehicle = parkedVehicle;
    }

    public String getVehicleLicenceNo() {
        return vehicleLicenceNo;
    }

    public void setVehicleLicenceNo(String vehicleLicenceNo) {
        this.vehicleLicenceNo = vehicleLicenceNo;
    }

    public Boolean getAvaliable() {
        return isAvaliable;
    }

    public void setAvaliable(Boolean avaliable) {
        isAvaliable = avaliable;
    }
}
