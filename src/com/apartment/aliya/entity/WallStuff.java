package com.apartment.aliya.entity;

public abstract class WallStuff {
    private double length;
    private double heigth;
    private wallStaffMaterial material;

    public WallStuff(double length, double height, wallStaffMaterial material) {
        this.length = length;
        this.heigth = height;
        this.material = material;
    }

    public WallStuff() {
    }

    public enum wallStaffMaterial {PLASTIC, WOOD, METAL}
}