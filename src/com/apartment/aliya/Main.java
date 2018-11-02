package com.apartment.aliya;

import com.apartment.aliya.entity.*;
import com.apartment.aliya.util.CalculationManager;

import java.util.HashSet;
import java.util.Set;

import static com.apartment.aliya.util.DoorsInApartmentCounter.addDoorsToDoorsInApartment;
import static com.apartment.aliya.util.SquareCounter.calculateRoomSquare;

public class Main {
    public static void main(String[] args) {
        Rooms kitchen = new Rooms();
        kitchen.setRoomName("kitchen");
        Walls wallKitchenBed = new Walls(7);
        wallKitchenBed.addDoor(new Doors(0.5,2, WallStuff.wallStaffMaterial.WOOD,true));
        kitchen.addWall(wallKitchenBed);
        kitchen.addWall(new Walls(7));
        kitchen.addWall(new Walls(4));
        kitchen.addWall(new Walls(4));
        kitchen.getWallsList().get(2).addDoor(new Doors(0.5, 2, WallStuff.wallStaffMaterial.METAL,true));

        kitchen.setRoomSquare(CalculationManager.calculateSquare(kitchen));
        logRoomSquare(kitchen);
        System.out.println("Number of doors in the " + kitchen.getRoomName() + " is " + kitchen.CountDoorsInRoom());
        System.out.println("Number of windows in the " + kitchen.getRoomName() + " is " + kitchen.CountWindowsInRoom());

        Rooms bedroom = new Rooms();
        bedroom.setRoomName("bedroom");
        bedroom.addWall(wallKitchenBed);
        Walls wallBedBath = new Walls(7);
        bedroom.addWall(wallBedBath);
        wallBedBath.addDoor(new Doors(0.7,2, WallStuff.wallStaffMaterial.PLASTIC,false));
        bedroom.addWall(new Walls(5));
        bedroom.addWall(new Walls(5));
        bedroom.getWallsList().get(2).addWindow(new Windows(0.25, 0.7, WallStuff.wallStaffMaterial.PLASTIC));
        bedroom.setRoomSquare(calculateRoomSquare(bedroom));
        logRoomSquare(bedroom);
        System.out.println("Number of doors in the " + bedroom.getRoomName() + " is " + bedroom.CountDoorsInRoom());
        System.out.println("Number of windows in the " + bedroom.getRoomName() + " is " + bedroom.CountWindowsInRoom());

        Rooms bathroom = new Rooms();
        bathroom.setRoomName("bathroom");
        bathroom.addWall(wallBedBath);
        bathroom.addWall(new Walls(3));
        bathroom.addWall(new Walls(7));
        bathroom.addWall(new Walls(3));
        bathroom.setRoomSquare(calculateRoomSquare(bathroom));
        logRoomSquare(bathroom);
        System.out.println("Number of doors in the " + bathroom.getRoomName() + " is " + bathroom.CountDoorsInRoom());
        System.out.println("Number of windows in the " + kitchen.getRoomName() + " is " + kitchen.CountWindowsInRoom());

        double apartmentSquare = kitchen.getRoomSquare() + bedroom.getRoomSquare() + bathroom.getRoomSquare();
        System.out.println("\nApartment square is " + apartmentSquare +"\n");
        int windowsInApartment = kitchen.getWindowsInRoom() + bedroom.getWindowsInRoom() + bathroom.getWindowsInRoom();
        System.out.println("Number of windows in the apartment is " + windowsInApartment);

        Set<Doors> doorsInApartment = new HashSet<>();
        doorsInApartment.addAll(addDoorsToDoorsInApartment(kitchen));
        doorsInApartment.addAll(addDoorsToDoorsInApartment(bedroom));
        doorsInApartment.addAll(addDoorsToDoorsInApartment(bathroom));
        System.out.println("Number of doors in the apartment is " + doorsInApartment.size());
    }

    public static void logRoomSquare(Rooms room) {
        System.out.println("\n"+ room.getRoomName() + " square is  " + room.getRoomSquare() + "\n");
    }

}
