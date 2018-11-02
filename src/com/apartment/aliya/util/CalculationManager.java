package com.apartment.aliya.util;

import com.apartment.aliya.entity.Rooms;

public class CalculationManager {
    public static double calculateSquare(Rooms room) {
        if (room.getWallsList().size() == 4) {
            return room.getRoomSquare();
        } else {
            System.out.println("Error: room " + room.getRoomName() + " needs four walls");
            return 0;
        }
    }
}
