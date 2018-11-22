package demo2.exceptions;

import com.sun.naming.internal.VersionHelper;

class FuelNotAvailException extends Exception {}

class Vehicle {
    //void ride() throws Exception { // line n1
    void ride() throws FuelNotAvailException { // line n1
        System.out.println("happy journey");
    }
}

class SolarVehicle extends Vehicle {
    //public void ride() throws Exception {  // line n2 'ride()' in 'demo2.exceptions.SolarVehicle' clashes with 'ride()' in 'demo2.exceptions.Vehicle'; overridden method does not throw 'java.lang.Exception'
    public void ride() throws FuelNotAvailException {
        super.ride();
    }
}

public class Question143 {

    public static void main(String[] args) throws FuelNotAvailException {
        Vehicle v = new SolarVehicle();
        v.ride();
    }
}