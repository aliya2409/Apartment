package com.apartment.aliya.entity;

import java.util.ArrayList;
import java.util.List;


public class Rooms {
    private String roomName;
    private static final int WALL_LIST_CAPACITY = 3;
    private double roomSquare;
    private List<Walls> wallsList;
    private int windowsInRoom;
    private int doorsInRoom;

    public Rooms() {
        this.wallsList = new ArrayList<>(WALL_LIST_CAPACITY);
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public double getRoomSquare() {
        return roomSquare;
    }

    public void setRoomSquare(double roomSquare) {
        this.roomSquare = roomSquare;
    }

    public List<Walls> getWallsList() {
        return wallsList;
    }

    public void setWallsList(List<Walls> wallsList) {
        this.wallsList = wallsList;
    }

    public void addWall(Walls wall) {
        wallsList.add(wall);
    }

    public int getWindowsInRoom() {
        return windowsInRoom;
    }

    public void setWindowsInRoom(int windowsInRoom) {
        this.windowsInRoom = windowsInRoom;
    }

    public int getDoorsInRoom() {
        return doorsInRoom;
    }

    public void setDoorsInRoom(int doorsInRoom) {
        this.doorsInRoom = doorsInRoom;
    }



    public int CountWindowsInRoom() {
        int windowsCounter = 0;
        for (Walls element : this.getWallsList()) windowsCounter += element.getWindowsInWall().size();
        this.setWindowsInRoom(windowsCounter);
        return windowsCounter;
    }
    public int CountDoorsInRoom() {
        int doorsCounter = 0;
        for (Walls element : this.getWallsList()) doorsCounter += element.getDoorsInWall().size();
        this.setDoorsInRoom(doorsCounter);
        return doorsCounter;
    }
}


