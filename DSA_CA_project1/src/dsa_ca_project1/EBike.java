/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_ca_project1;

/**
 *
 * @author Andrew
 */
public class EBike extends Vehicle {
    private boolean hasBasket;

    //the Constructor. super send data up to Vehicle class
    public EBike(String id, int battery, String loc, boolean hasBasket) {
        super(id, battery, loc); // Calls the Vehicle constructor
        this.hasBasket = hasBasket;
    }

    //my method for EBikes only
    public void togglePedalAssist() {
        System.out.println("Pedal assist toggled for Bike: " + deviceID);
    }

    // Implementing the Interface methods from VehicleActions
    @Override
    public void startTrip() {
        this.isAvailable = false;
        System.out.println("EBike " + deviceID + "trip started.");
    }
    
    @Override
    public void endTrip() {
        this.isAvailable = true; 
        System.out.println("EBike " + deviceID + " the trip ended, this vehicle should be available again.");
    }

    
    
    @Override
    public void reportIssue() {
        System.out.println("Issue reported for EBike " + deviceID);
    }

    
    
    
    // Overriding toString to haVe basket info
    @Override
    public String toString() {
        return super.toString() + " , Has Basket: " + hasBasket;
    }
}