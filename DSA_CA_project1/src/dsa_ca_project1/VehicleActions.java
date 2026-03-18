/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dsa_ca_project1;

/**
 *
 * @author Andrew
 */
public interface VehicleActions {
    // My methods to force rules upon vehicle class
    // Every vehicle must be able to start a trip
    void startTrip();
    
    // Every vehicle must be able to end a trip
    void endTrip();
    
    // Every vehicle needs a way for a user to report prob
    void reportIssue();
}