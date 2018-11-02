package com.apartment.aliya.entity;
import java.util.*;

public class Walls {
    private static double width;
    private static double height;
    private double length;
    private String wallID;
    private Set<Windows> windowsInWall;
    private Set<Doors> doorsInWall;

    public Walls(double length) {
        this.length = length;
        this.wallID = UUID.randomUUID().toString();
        this.windowsInWall = new HashSet<>();
        this.doorsInWall = new HashSet<>();
    }
    public Walls(){
        this.wallID = UUID.randomUUID().toString();
    }

    public static double getWidth() {
        return width;
    }

    public static void setWidth(double width) {
        Walls.width = width;
    }

    public static double getHeight() {
        return height;
    }

    public static void setHeight(double height) {
        Walls.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getWallID() {
        return wallID;
    }

    public Set<Windows> getWindowsInWall() {
        return windowsInWall;
    }

    public void setWindowsInWall(Set<Windows> windowsInWall) {
        this.windowsInWall = windowsInWall;
    }

    public Set<Doors> getDoorsInWall() {
        return doorsInWall;
    }

    public void setDoorsInWall(Set<Doors> doorsInWall) {
        this.doorsInWall = doorsInWall;
    }

    public void addWindow(Windows window) {
        this.getWindowsInWall().add(window);
    }

    public void addDoor(Doors door) {
        this.getDoorsInWall().add(door);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
            Walls wall = (Walls) obj;
        if (this.wallID.equals(wall.wallID) && this.length == wall.length) {
            return true;
        } else
            System.out.println("WallsMatchingError");
        return false;
    }

    @Override
    public int hashCode() {
        return (int)this.length + this.wallID.length()*(int)this.length;
    }
}
