package com.driver;

public class Boat implements WaterVehicle{
    String name;
    int capacity;
    @Override
    public String getVehicleName()
    {
        return this.name;
    }

    public Boat()
    {
    }

    public Boat(String name, int capacity)
    {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public int getVehicleCapacity()
    {
        return this.capacity;
    }
}
