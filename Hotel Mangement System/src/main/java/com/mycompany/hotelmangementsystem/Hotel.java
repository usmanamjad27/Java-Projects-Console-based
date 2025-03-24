/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelmangementsystem;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
class Hotel {
    ArrayList<Room> rooms;

    public Hotel(int totalRooms) {
        rooms = new ArrayList<>();
        for (int i = 1; i <= totalRooms; i++) {
            rooms.add(new Room(i));
        }
    }

    public void bookRoom(int roomNumber, String guestName) {
        if (roomNumber > 0 && roomNumber <= rooms.size()) {
            rooms.get(roomNumber - 1).bookRoom(guestName);
        } else {
            System.out.println("Invalid room number!");
        }
    }

    public void vacateRoom(int roomNumber) {
        if (roomNumber > 0 && roomNumber <= rooms.size()) {
            rooms.get(roomNumber - 1).vacateRoom();
        } else {
            System.out.println("Invalid room number!");
        }
    }

    public void checkRoomAvailability(int roomNumber) {
        if (roomNumber > 0 && roomNumber <= rooms.size()) {
            rooms.get(roomNumber - 1).checkAvailability();
        } else {
            System.out.println("Invalid room number!");
        }
    }

    public void displayBookedRooms() {
        System.out.println("Booked Rooms:");
        for (Room room : rooms) {
            if (room.isBooked) {
                System.out.println("Room " + room.roomNumber + " - Guest: " + room.guestName);
            }
        }
    }
}

