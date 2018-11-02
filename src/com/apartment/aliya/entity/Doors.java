package com.apartment.aliya.entity;

import java.util.UUID;

public class Doors extends WallStuff {
    private double length;
    private double height;
    private wallStaffMaterial material;
    private boolean isLocked;
    private String doorID;

    public Doors(double length, double height, wallStaffMaterial material, boolean isLocked) {
        super(length, height, material);
        this.doorID = UUID.randomUUID().toString();
        this.isLocked = isLocked;

    }

    public Doors() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeigth() {
        return height;
    }

    public void setHeigth(double height) {
        this.height = height;
    }

    public wallStaffMaterial getMaterial() {
        return material;
    }

    public void setMaterial(wallStaffMaterial material) {
        this.material = material;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setDoorLock(boolean isLocked) {
        this.isLocked = isLocked;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Doors door = (Doors) obj;
        if (this.height == door.height && this.length == door.length && this.material == door.material
                && this.isLocked == door.isLocked && this.doorID.equals(door.doorID)) {
            return true;
        } else
            System.out.println("DoorsMatchingError");
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
