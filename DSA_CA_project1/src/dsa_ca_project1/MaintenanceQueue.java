/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_ca_project1;

/**
 *
 * @author Andrew
 */
import java.util.ArrayList;

public class MaintenanceQueue {
    // array holds the queue of broken vehicles
    private ArrayList<Vehicle> queue;

    public MaintenanceQueue() {
        
        this.queue = new ArrayList<>();
    }

    // ENQUEUE adds a broken vehicle to the back of the line
    public void addJob(Vehicle v) {
        queue.add(v);
    }

    // DEQUEU will remove and return the vehicle at the front (index 0)
    public Vehicle fixNext() {
        
        if (!queue.isEmpty()) {
            return queue.remove(0); //Removing at 0 shifts everything alll up
        }
        return null;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int getCount() {
        return queue.size();
    }
}