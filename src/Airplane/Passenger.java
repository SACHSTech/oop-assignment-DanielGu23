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
    private ArrayList<Job> Jobs;

   /**
    * Constructor - creates new instance of a passanger object
    *
    * @param strName - the name of the passenger
    * @param intAge - the age of the passenger
    * @param hasFlightExperience - determines if the passenger has former flight experience
    * @param strJob - lists the jobs of the passenger on the flight
    */	
    public Passenger (String strName, int intAge, boolean hasFlightExperience, ArrayList<Job> Jobs) {
    
        this.strName = strName;
        this.intAge = intAge;
        this.hasFlightExperience = hasFlightExperience;
        this.Jobs = Jobs;
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
        return this.Jobs;
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
    * Setter method that allows the user to add a list of jobs
    *
    * @param strJob - the list of jobs
    */	
    public void setName(ArrayList<Job> Jobs) {
        this.Jobs = Jobs;
    }

   /**
    * Setter method that allows the user to modify flight experience
    *
    * @param hasFlightExperience - Yes or No
    */	
    public void setExperience(boolean hasFlightExperience) {
        this.hasFlightExperience = hasFlightExperience;
    }

   /**
    * A method that adds a new occupation
    *
    * @param strNewJob - The name of the new job 
    * @param Jobs - An arraylist that defines the current jobs
    */	
    public void addJob(String strNewJob, ArrayList<Job> Jobs) {
         
        // Intializing instance variables 
        this.Jobs = Jobs;
        boolean isOnList = false;

        // For-each loop that iterates through the Jobs arrayList
        for (Job currentJob : Jobs) {

            // If the user input equals to an object in the current jobs list
            if (strNewJob.equals(currentJob.getName())) {
                // Set isOnList to be true
                isOnList  = true;
                break;
            }
            else {
                // Set isOnList to be false
                isOnList = false;
            }
            
            // If the boolean is true, print that the job is already on the list
            if (isOnList == true) {
                System.out.println("This Job is already in your job lists.");
            }

            // Otherwise, add the job onto the jobs list
            else if (isOnList == false) {
                Jobs.add(currentJob);
            }
        }       
    }
}