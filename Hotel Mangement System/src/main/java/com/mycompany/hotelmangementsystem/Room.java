/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelmangementsystem;

/**
 *
 * @author Dell
 */
class Room {
    int roomNumber;
    boolean isBooked;
    String guestName;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isBooked = false;
        this.guestName = "";
    }

    public void bookRoom(String guestName) {
        if (!isBooked) {
            this.isBooked = true;
            this.guestName = guestName;
            System.out.println("Room " + roomNumber + " booked successfully for " + guestName);
        } else {
            System.out.println("Room " + roomNumber + " is already booked.");
        }
    }

    public void vacateRoom() {
        if (isBooked) {
            System.out.println("Room " + roomNumber + " vacated by " + guestName);
            this.isBooked = false;
            this.guestName = "";
        } else {
            System.out.println("Room " + roomNumber + " is already vacant.");
        }
    }

    public void checkAvailability() {
        if (isBooked) {
            System.out.println("Room " + roomNumber + " is booked by " + guestName);
        } else {
            System.out.println("Room " + roomNumber + " is available.");
        }
    }
}
