package com.apartment.aliya.entity;

import java.util.List;

public class Windows extends WallStuff{
    private double length;
    private double heigth;
    private wallStaffMaterial material;

    public Windows(double length, double height, wallStaffMaterial material) {
        super(length, height, material);
    }

    public  Windows() {
    }
}
