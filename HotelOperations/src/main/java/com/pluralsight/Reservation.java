package com.pluralsight;

public class Reservation {
    private String roomType;
    private int price;
    private int numOfNights;
    private boolean isWeekend;
    private int resTotal;

    public Reservation (){};

    public Reservation(String roomType, int price, int numOfNights, boolean isWeekend, int resTotal) {
        this.roomType = roomType;
        this.price = price;
        this.numOfNights = numOfNights;
        this.isWeekend = isWeekend;
        this.resTotal = resTotal;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public int getResTotal() {
        return resTotal;
    }

    public void setResTotal(int resTotal) {
        this.resTotal = resTotal;
    }
}
