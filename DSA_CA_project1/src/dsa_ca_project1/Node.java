/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_ca_project1;

/**
 *
 * @author Andrew
 */
public class Node {
    private Object data;
    private Node next;//goes next
    
    // Constructor
    public Node(Object data) {
        this.data = data;
        this.next = null; //New nodes pointto nothing by default
    }

    // Getters and Setters
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}