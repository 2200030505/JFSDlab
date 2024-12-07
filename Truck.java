package com.klef.jfsd.exam;
import jakarta.persistence.Entity;

@Entity
public class Truck extends Vehicle {
    private double loadCapacity;

    public double getLoadCapacity() {
    	return loadCapacity;
    	}
    public void setLoadCapacity(double loadCapacity) { 
    	this.loadCapacity = loadCapacity;
    	}
}
