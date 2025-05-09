package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {

    @Test
    public void checkIn_onCleanUnoccupiedRoom_shouldMarkDirtyAndOccupied() {
        Room room = new Room("101", "Suite", 150.00);

        boolean result = room.checkIn();

        assertTrue(result, "Expected checkIn() to succeed on a clean, unoccupied room");
        assertTrue(room.isOccupied(), "Room should be occupied after checkIn()");
        assertTrue(room.isDirty(),    "Room should be dirty after checkIn()");
        assertFalse(room.isAvailable(), "Room should not be available once occupied & dirty");
    }

    @Test
    public void checkIn_onDirtyRoom() {
        Room room = new Room("102", "Standard", 100.00);
        room.checkIn();   // now occupied & dirty
        room.checkOut();  // becomes unoccupied but still dirty

        boolean result = room.checkIn();

        assertFalse(result, "Expected checkIn() to fail when room is dirty");
    }

    @Test
    public void checkIn_onOccupiedRoom() {
        Room room = new Room("103", "Standard", 100.00);
        room.checkIn();  // now occupied & dirty

        boolean result = room.checkIn();

        assertFalse(result, "Expected checkIn() to fail if room is already occupied");
    }

    @Test
    public void checkOut_shouldAlwaysClearOccupied_butLeaveDirty() {
        Room room = new Room("104", "Deluxe", 175.00);
        room.checkIn();   // occupied & dirty
        room.checkOut();  // unoccupied but still dirty

        assertFalse(room.isOccupied(), "Room should not be occupied after checkOut()");
        assertTrue(room.isDirty(),     "Room should remain dirty after checkOut()");
    }

    @Test
    public void cleanRoom_onUnoccupiedRoom_shouldSucceedAndClearDirty() {
        Room room = new Room("105", "Deluxe", 175.00);
        room.checkIn();
        room.checkOut();  // now unoccupied & dirty

        boolean result = room.cleanRoom();

        assertTrue(result, "Expected cleanRoom() to succeed on unoccupied room");
        assertFalse(room.isDirty(),  "Room should not be dirty after cleanRoom()");
        assertTrue(room.isAvailable(), "Room should be available once clean and unoccupied");
    }

    @Test
    public void cleanRoom_onOccupiedRoom_shouldFail() {
        Room room = new Room("106", "Suite", 200.00);
        room.checkIn(); // now occupied & dirty

        boolean result = room.cleanRoom();

        assertFalse(result, "Expected cleanRoom() to fail while room is occupied");
        assertTrue(room.isDirty(),   "Room should remain dirty");
        assertTrue(room.isOccupied(), "Room should remain occupied");
    }
}
