/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hotelmangementsystem;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Hotelmangementsystem {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total number of rooms: ");
        int totalRooms = scanner.nextInt();
        Hotel hotel = new Hotel(totalRooms);
        
        while (true) {
            System.out.println("\nHotel Management System");
            System.out.println("1. Book Room");
            System.out.println("2. Vacate Room");
            System.out.println("3. Check Room Availability");
            System.out.println("4. Display Booked Rooms");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter room number to book: ");
                    int roomNumber = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter guest name: ");
                    String guestName = scanner.nextLine();
                    hotel.bookRoom(roomNumber, guestName);
                    break;
                case 2:
                    System.out.print("Enter room number to vacate: ");
                    int vacateRoom = scanner.nextInt();
                    hotel.vacateRoom(vacateRoom);
                    break;
                case 3:
                    System.out.print("Enter room number to check availability: ");
                    int checkRoom = scanner.nextInt();
                    hotel.checkRoomAvailability(checkRoom);
                    break;
                case 4:
                    hotel.displayBookedRooms();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}