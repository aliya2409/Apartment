package com.apartment.aliya.util;

import com.apartment.aliya.entity.Rooms;
import com.apartment.aliya.entity.Walls;

import java.util.List;

public class SquareCounter {
    private static final int RECTANGLE_SAME_WALLS_COUNT = 2;
    private static final int SQUARE_SAME_WALLS_COUNT = 6;
    private static final int ERROR_COUNT_ONE = 0;
    private static final int ERROR_COUNT_TWO = 1;
    private static final int ERROR_COUNT_THREE = 3;

    public static double calculateRoomSquare(Rooms room) {
        int sameWallsCount = 0;
        List<Walls> wallList = room.getWallsList();
        for (int i = 0; i < wallList.size(); i++) {
            for (int j = i; j < wallList.size(); j++) {
                if ((wallList.get(i)).getLength() == ((wallList.get(j)).getLength())
                        && (!((wallList.get(i)).getWallID().equals(((wallList.get(j)).getWallID()))))) {
                    sameWallsCount++;
                }
            }
        }
        double calculateRoomSquareResult;
            switch (sameWallsCount) {
                case RECTANGLE_SAME_WALLS_COUNT:
                    double a = ((wallList.get(0)).getLength());
                    double b = a;
                    int i = 1;
                    while (a == b) {
                        b = (wallList.get(i)).getLength();
                        i++;
                    }
                    calculateRoomSquareResult = a * b;
                    break;
                case SQUARE_SAME_WALLS_COUNT:
                    double c = (wallList.get(0)).getLength();
                    calculateRoomSquareResult = c * c;
                    break;
                case ERROR_COUNT_ONE:
                    System.out.println("Error: all walls in " + room.getRoomName() + " have different length ");
                    calculateRoomSquareResult = 0;
                    break;
                case ERROR_COUNT_TWO:
                    System.out.println("Error:  " + room.getRoomName() + " has only one pair of walls with the same length");
                    calculateRoomSquareResult = 0;
                    break;
                case ERROR_COUNT_THREE:
                    System.out.println("Error: in " + room.getRoomName() + " one wall doesn't match the room's size");
                    calculateRoomSquareResult = 0;
                    break;
                default:
                    System.out.println("Error: undefined");
                    calculateRoomSquareResult = 0;
                    break;
            }
            return calculateRoomSquareResult;
        }
    }
