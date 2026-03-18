/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_ca_project1;

/**
 *
 * @author Andrew
 */
public abstract class Vehicle implements VehicleActions {
    
    //protected allows for direct use by EBike and Escooter
    protected String deviceID;
    protected int batteryLevel;
    protected String currentLocation;
    protected boolean isAvailable;

    public Vehicle(String id, int battery, String loc) {
        this.deviceID = id;
        this.batteryLevel = battery;
        this.currentLocation = loc;
        this.isAvailable = true;
    }

    // Getters
    public String getDeviceID() {
        return deviceID;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    //ToString
    @Override
    public String toString() {
        return "ID: " + deviceID + " , Battery: " + batteryLevel + "% , Location: " + currentLocation;
    }
}
