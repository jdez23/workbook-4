package com.pluralsight;

public class Room {
    private int roomNum;
    private int roomFloor;
    private int beds;
    private int price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    public Room(){};

    public Room(int roomNum, int roomFloor, int beds, int price, boolean isOccupied, boolean isDirty, boolean isAvailable) {
        this.roomNum = roomNum;
        this.roomFloor = roomFloor;
        this.beds = beds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public int getRoomFloor() {
        return roomFloor;
    }

    public void setRoomFloor(int roomFloor) {
        this.roomFloor = roomFloor;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void checkIn(){
        this.isOccupied = true;
        this.isDirty = true;
        this.isAvailable = false;
    };

    public void checkout(){
        cleanRoom();
        this.isOccupied = false;
        this.isAvailable = true;
    };

    public void cleanRoom() {
        this.isDirty = false;
    };
}
