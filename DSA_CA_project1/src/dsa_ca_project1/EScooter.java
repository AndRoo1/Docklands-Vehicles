/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_ca_project1;

/**
 *
 * @author Andrew
 */
public class EScooter extends Vehicle {
    private double maxWeight;
    //private int maxWeight;
    
    
    //private boolean hasBasket; NO


    //similar to EBike
    public EScooter(String id, int battery, String loc, double maxWeight) {
        super(id, battery, loc);
        this.maxWeight = maxWeight;
    }

    // Unique eEScooters aspect
    public void foldScooter() {
        System.out.println("Scooter " + deviceID + " has been folded for storage.");
    }

    // ,my required Interface methods
    @Override
    public void startTrip() {
        this.isAvailable = false;
        System.out.println("EScooter " + deviceID + " unlocked. Stay off the bloody path.");
    }

    @Override
    public void endTrip() {
        this.isAvailable = true;
        System.out.println("EScooter " + deviceID+ " locked at " + currentLocation);
    }

    @Override
    public void reportIssue() {
        System.out.println("Maintenance ticket made for EScooter " + deviceID);
    }

    // Overriding toString to include weight cap
    @Override
    public String toString() {
        return super.toString() + " ,, Max Weight: " + maxWeight + "kg";
    }
}