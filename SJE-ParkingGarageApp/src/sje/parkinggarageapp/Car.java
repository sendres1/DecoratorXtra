/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sje.parkinggarageapp;

/**
 *
 * @author Owner
 */
public class Car {
    private Ticket ticket; 
    
    public Car() {
    
    }
 
    public void carArrives(double hours ){
        this.ticket = new Ticket(hours);
            }

    public Ticket getTicket() {
        return ticket;
    }
    
    
    
 
    
    
    
}