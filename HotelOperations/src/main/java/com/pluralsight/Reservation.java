package com.pluralsight;

public class Reservation {
    private String guestName;
    private String reservationDate;
    private Room room;

    public Reservation(String guestName, String reservationDate, Room room) {
        this.guestName = guestName;
        this.reservationDate = reservationDate;
        this.room = room;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public Room getRoom() {
        return room;
    }

    public void checkIn() {
        room.checkIn();
    }

    public void checkOut() {
        room.checkOut();
    }
}
