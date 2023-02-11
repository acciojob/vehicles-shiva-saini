package com.driver;

public class Boat implements WaterVehicle{
    public String name;
    public int capacity;

    public String getName() {
        return name;
    }
   public void setName(){
        this.name = name;
   }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
