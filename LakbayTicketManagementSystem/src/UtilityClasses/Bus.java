/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UtilityClasses;

/**
 *
 * @author clare
 */
public class Bus {
      
    private String busId, busPlateNo, busType, assignedDriver;
    private int capacity;

    public void setBusId(String busId) {
        this.busId = busId;
    }

    public void setBusPlateNo(String busPlateNo) {
        this.busPlateNo = busPlateNo;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public void setAssignedDriver(String assignedDriver) {
        this.assignedDriver = assignedDriver;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getBusId() {
        return busId;
    }

    public String getBusPlateNo() {
        return busPlateNo;
    }

    public String getBusType() {
        return busType;
    }

    public String getAssignedDriver() {
        return assignedDriver;
    }

    public int getCapacity() {
        return capacity;
    }
    
}
