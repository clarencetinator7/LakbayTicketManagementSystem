/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UtilityClasses;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author clare
 */
public class Ticket {
    
    private int noOfSeats;
    private float fareAmount, totalAmount;
    private String passengerNo, routeId, staffId, ticketNo;
    private Date date;
    private Time departureTime;

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public void setFareAmount(float fareAmount) {
        this.fareAmount = fareAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setPassengerNo(String passengerNo) {
        this.passengerNo = passengerNo;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }
    

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public String getTicketNo() {
        return ticketNo;
    }
    
    public float getFareAmount() {
        return fareAmount;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public String getPassengerNo() {
        return passengerNo;
    }

    public String getRouteId() {
        return routeId;
    }

    public String getStaffId() {
        return staffId;
    }

    public Date getDate() {
        return date;
    }

    public Time getDepartureTime() {
        return departureTime;
    }
    
    

    
    
    
    
}
