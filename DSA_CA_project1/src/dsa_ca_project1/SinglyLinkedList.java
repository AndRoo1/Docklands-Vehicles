/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_ca_project1;

/**
 *
 * @author Andrew
 */
public class SinglyLinkedList implements MyListInterface {

    private Node head;
    private int size;

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    @Override
    public void add(Object obj) {
        Node newNode = new Node(obj);

        //if List is empty
        if (head == null) {
            head = newNode;
        } //if List has items find the end of the chain
        else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            //link the last node to new node
            current.setNext(newNode);
        }
        size++;
    }

    public String display() {
        if (head == null) {     //when empty
            return "no waypoints here..";
        }

        StringBuilder sb = new StringBuilder("Trip Route: ");
        Node current = head;

        while (current != null) {       //loop through nodes until none left.
            sb.append(current.getData().toString());    //just takes data in current node and turns it to a string
            //in order to add it to the sb

            if (current.getNext() != null) {        //only adds arrow if more nodes ahead 
                sb.append(" >>> ");
            }
            current = current.getNext(); //goes to next node
        }
        return sb.toString();
    }

    public void clear() {
        head = null; // Severing the head deletes the whole thing
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
