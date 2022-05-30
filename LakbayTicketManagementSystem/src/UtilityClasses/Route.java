/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UtilityClasses;

/**
 *
 * @author clare
 */
public class Route {
    
    private String routeid, startingPoint, destination, departureTime, ETA, busid;
    private float fare_amount;
    private int bookings_count;

    public void setRouteid(String routeid) {
        this.routeid = routeid;
    }

    public void setStartingPoint(String starting_point) {
        this.startingPoint = starting_point;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDeparturetime(String departure_time) {
        this.departureTime = departure_time;
    }

    public void setETA(String ETA) {
        this.ETA = ETA;
    }

    public void setBusid(String busid) {
        this.busid = busid;
    }

    public void setFare_amount(float fare_amount) {
        this.fare_amount = fare_amount;
    }

    public void setBookings_count(int bookings_count) {
        this.bookings_count = bookings_count;
    }

    public String getRouteid() {
        return routeid;
    }

    public String getStartingPoint() {
        return startingPoint;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getETA() {
        return ETA;
    }

    public String getBusid() {
        return busid;
    }

    public float getFare_amount() {
        return fare_amount;
    }

    public int getBookings_count() {
        return bookings_count;
    }
  
}
