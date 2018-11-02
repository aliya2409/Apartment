package com.apartment.aliya.util;

import com.apartment.aliya.entity.Doors;
import com.apartment.aliya.entity.Rooms;
import com.apartment.aliya.entity.Walls;

import java.util.HashSet;
import java.util.Set;

public class DoorsInApartmentCounter {

    public static Set<Doors> addDoorsToDoorsInApartment(Rooms room) {
        Set<Doors> doorsInRoom = new HashSet<>();
        for (Walls eachWall : room.getWallsList()) {
            doorsInRoom.addAll(eachWall.getDoorsInWall());
        }
        return doorsInRoom;
    }
}
