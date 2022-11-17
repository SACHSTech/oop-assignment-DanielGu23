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
    * Constructor - creates new instance of the Aircraft object
    *
    * @param intCapacity - the maximum number of passengers in the aircraft
    */	
    public Aircraft(int intCapacity){
        this.intCapacity = intCapacity;
    }

    
    /**
    * Setter method that sets the amount of distance needed to travel
    *
    * @return dblDistance, the distance of the flight
    */	
    public void setDistance(double dblDistance){
        this.dblDistance = dblDistance;
    }

    
    /**
    * Setter method that assigns a pilot to the aircraft
    *
    * @param - name, the passenger
    */	
    public void pilotOnBoard(Passenger name){
        if (this.pilot == null) {
            // If the passenger's job is not pilot or co-pilot
            if (!pilot.getJob().getName().equals("Pilot") && !pilot.getJob().getName().equals("Co-Pilot")){
                System.out.println("This passenger is not a pilot!");                
            }
            this.pilot = name;
        }
        else {
            System.out.println("Pilot is already on board");
        }        
    }

    /**
    * Setter method that assigns a passenger to the aircraft
    *
    * @param - passenger, the passenger 
    */	
    public void passengerOnBoard(Passenger passenger){
        // The aircraft checks to see if maximum capacity is reached
        if (this.arrPassengers.size() < getCapacity() ) {
            this.arrPassengers.add(passenger);
        }
        else {
            System.out.println("Maximum passenger capacity reached");
        }
    }

  
    /**
    * Returns the distance remaining
    * @param - intHours, the number of hours the aircraft has been flying for
    *
    * @return dblDistance, the distance remaining of the flight
    */	
    public double flight(int intHours) {
        // 
        if (this.pilot == null) {
            System.out.println("Please assign a pilot first!");
            return this.dblDistance;   
        }
        // Checks if velocity * time is greater than total distance needed
        if (getVelocity() * intHours >= this.dblDistance){
            this.dblDistance = 0;
        }
        else{
            this.dblDistance -= getVelocity() * intHours;
        }
        return this.dblDistance;
    }

    /**
    * Returns the distance
    *
    * @return dblDistance, the distance of the flight
    */	
    public double getDistance() {
        return this.dblDistance;
    }

    /**
    * Returns the passengers
    *
    * @return arrPassengers, the passengers 
    */	
    public ArrayList<Passenger> getPassengers() {
        return this.arrPassengers;
    }    

    /**
    * Returns the maximum capacity of the aircraft
    *
    * @return intCapacity, the maximum number of passengers
    */	
    public int getCapacity(){
        return this.intCapacity;
    };
    
    /**
    * Returns the velocity of the aircraft
    * Abstract method to be implemented by inherited classes
    *
    * @return intVelocity, the velocity of the aircraft
    */	
    public abstract double getVelocity();

    
    /**
    * Returns the status of the aircraft
    * Abstract method to be implemented by inherited classes
    *
    * @return strStatus, the status of the aircraft
    */	
    public abstract String status();    
}