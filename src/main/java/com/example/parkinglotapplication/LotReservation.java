package com.example.parkinglotapplication;

public class LotReservation
{
    int idLotReservation;
    int spotNo;
    String reservationLicensePlateNo;
    int reservedHour;

    public int getIdLotReservation() {
        return idLotReservation;
    }

    public void setIdLotReservation(int idLotReservation) {
        this.idLotReservation = idLotReservation;
    }

    public int getSpotNo() {
        return spotNo;
    }

    public void setSpotNo(int spotNo) {
        this.spotNo = spotNo;
    }

    public String getReservationLicensePlateNo() {
        return reservationLicensePlateNo;
    }

    public void setReservationLicensePlateNo(String reservationLicensePlateNo) {
        this.reservationLicensePlateNo = reservationLicensePlateNo;
    }

    public int getReservedHour() {
        return reservedHour;
    }

    public void setReservedHour(int reservedHour) {
        this.reservedHour = reservedHour;
    }
}
