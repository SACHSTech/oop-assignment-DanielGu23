package Aircraft;

import java.util.*;

/**
* Aircraft class file
* @author: D. Gu
* 
*/

public abstract class Aircraft {
    
    // Instance variables
    private double dblDistance = 0;
    private Passenger pilot = null;
    private int intCapacity;
    private ArrayList<Passenger> arrPassengers = new ArrayList<>();

    /**
    * Constructor - creates new instance of an Airplane object
    *
    * @param intCapacity - the capacity of the aircraft
    */	
    public Aircraft(int intCapacity){
        this.intCapacity = intCapacity;
    }

    public void scheduleFlight(double dblDistance){
        this.dblDistance = dblDistance;
    }

    public void pilotOnBoard(Passenger pilot){
        if (this.pilot == null) {
            this.pilot = pilot;
        }
        else {
            System.out.println("Pilot is already on board");
        }        
    }

    public void passengerOnBoard(Passenger passenger){
        if (this.arrPassengers.size() < getCapacity() ) {
            this.arrPassengers.add(passenger);
        }
        else {
            System.out.println("Maximum passenger capacity reached");
        }
    }

    public double flight(int intHours) {
        if (this.pilot == null) {
            System.out.println("Please assign a pilot first!");
            return this.dblDistance;   
        }
        if (getVelocity() * intHours > this.dblDistance){
            this.dblDistance = 0;
        }else{
            this.dblDistance -= getVelocity() * intHours;
        }
        return this.dblDistance;
    }

    /**
    * Returns the distance
    *
    * @return dblDistance, the distance needed to travel
    */	
    public double getDistance() {
        return this.dblDistance;
    }

    public int getCapacity(){
        return this.intCapacity;
    };
    
    /**
    * Returns the velocity of the aircraft
    * Abstract method to be implemented by inherited classes
    *
    * @return intVelocity, the velocity of the plane
    */	
    public abstract double getVelocity();

}