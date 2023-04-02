package eliteHotel;

import java.util.Scanner;

public class Hotel {

    Scanner input = new Scanner(System.in);


    private String[] rooms;



    public Hotel(int roomLength) {

        this.rooms = new String[roomLength];
    }

    public String bookRoom(String user) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null){
                rooms[i] = user;
                break;
            }
        }
        return "Room Successfully booked!!!";
    }

    public boolean checkOut(int roomNumber) {
        boolean hasCheckedOut = false;
        if (rooms[roomNumber - 1] != null) {
            rooms[roomNumber - 1] = null;
            hasCheckedOut = true;
        }
        return hasCheckedOut;
    }

    public int getRooms() {

        return rooms.length;
    }


    public int availableRoom() {
        int count = 0;
        for (String room : rooms) {
            if (room == null) {
                count++;
            }

        }
        return count;
    }

    public boolean RoomGuest(int roomNumber) {
        boolean occupied = false;
        if (rooms[roomNumber -1] != null){
            rooms[roomNumber -1] = null;
            occupied = true;


        }
        return occupied;
    }

    public void AllRoomGuest() {
        String[] names = new String[bookedRoom()];
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null){
                names[i] = rooms[i];
            }

        }

    }

    public int bookedRoom() {
        int counter = 0;
        for (String room : rooms) {
            if (room != null) {
                counter++;

            }

        }
        return counter;
    }



    public void options(int userChoice){
        switch (userChoice){
            case 1:
                System.out.printf("There are %d rooms",getRooms());
                break;
            case 2:
                System.out.println("Enter your name");
                String name = input.nextLine();
                System.out.println("Enter the room number you would like to book");
                String roomNumbers = input.nextLine();
                System.out.println(bookRoom(name + roomNumbers));
                break;
            case 3:
                System.out.println("Enter the room number you would like to check out");
                int roomNumber1 = input.nextInt();
                System.out.printf("%s Room successfully checkout ",checkOut(roomNumber1));
                break;
            case 4:
                System.out.printf("There are %d rooms available",availableRoom());
                break;
            case 5:
                System.out.printf("There are %d booked rooms",bookedRoom());
                break;
            case 6:
                System.out.println("Enter the room number you like to check ");
                int roomNumer2 = input.nextInt();
                System.out.println(RoomGuest(roomNumer2));
                break;
            default:
                System.out.println("Invalid number");
        }
    }
    public static void main(String[] args) {
        Hotel hotel = new Hotel(10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Enter 1 to check the total number of rooms in the hotel
                Enter 2 to book a room
                Enter 3 to check out
                Enter 4 to check the number of available rooms
                Enter 5 to checked the number of booked rooms
                Enter 6 to check details of the guest rooms
                Enter 7 to set the number of rooms""");
        int userChoice = scanner.nextInt();
        hotel.options(userChoice);
    }
}