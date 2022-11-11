package Airplane;

import java.io.*;
import java.util.*;

/**
* Passenger class file
* @author: D. Gu
* 
*/

public class Passenger {

    // Instance variables
    private String strName;
    private int intAge;
    private boolean hasFlightExperience;
    private ArrayList<Job> strJob;

   /**
    * Constructor - creates new instance of a passanger object
    *
    * @param strName - the name of the passenger
    * @param intAge - the age of the passenger
    * @param hasFlightExperience - determines if the passenger has former flight experience
    * @param strJob - lists the jobs of the passenger on the flight
    */	
    public Passenger (String strName, int intAge, boolean hasFlightExperience, ArrayList<Job> strJob) {
    
        this.strName = strName;
        this.intAge = intAge;
        this.hasFlightExperience = hasFlightExperience;
        this.strJob = strJob;
	}

   /**
    * Returns the name of the passenger
    *
    * @return strName, the name of the passenger
    */	
    public String getName() {
        return this.strName;
    }

   /**
    * Returns the age of the passenger
    *
    * @return intAge, the age of the passenger
    */	
    public int getAge() {
        return this.intAge;
    }

   /**
    * Returns the job of the passenger on the flight
    *
    * @return strJob, the passenger's occupation
    */	
    public ArrayList<Job> getJob() {
        return this.strJob;
    }

   /**
    * Returns whether the passenger has flight experience
    *
    * @return hasFlightExperience, yes or no
    */	
    public boolean getExperience() {
        return this.hasFlightExperience;
    }

   /**
    * Setter method that allows the user to modify name
    *
    * @param strName - the passenger's name
    */	
    public void setName(String strName) {
        this.strName = strName;
    }

   /**
    * Setter method that allows the user to modify flight experience
    *
    * @param hasFlightExperience - Yes or No
    */	
    public void setExperience(boolean hasFlightExperience) {
        this.hasFlightExperience = hasFlightExperience;
    }

    

}
