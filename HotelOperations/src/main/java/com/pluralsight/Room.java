package com.pluralsight;

public class Room {
    private String roomNumber;
    private String roomType;
    private double rate;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(String roomNumber, String roomType, double rate) {
        this.roomNumber = roomNumber;
        this.roomType   = roomType;
        this.rate       = rate;
        this.isOccupied = false;  // initially not occupied
        this.isDirty    = false;  // initially clean
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getRate() {
        return rate;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        // available only if not occupied and not dirty
        return !isOccupied && !isDirty;
    }


    public boolean checkIn() {
        if (isAvailable()) {
            isOccupied = true;
            isDirty    = true;
        }
        return false;
    }

    public void checkOut() {
        isOccupied = false;
    }

    public boolean cleanRoom() {
        if (!isOccupied) {
            isDirty = false;
            return true;
        }
        return false;
    }
}
