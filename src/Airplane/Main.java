package Airplane;

import java.io.*;
import java.util.*;

/**
* Main class file
* @author: D. Gu
* 
*/

public class Main {

    public static void main(String[] args) throws IOException {
    
        // Setting up Buffered reader for user input
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Creating jobs
        Job Doctor = new Job("Doctor", 150000.00, "Addresses healthcare needs", false);
        Job Pilot = new Job("Pilot", 70000.00, "Flies planes", true);
        Job CoPilot = new Job("Co-Pilot", 65000.00, "Helps fly the plane", true);
        Job Attendent = new Job("Flight Attendent", 40000.00, "Serves passengers", false);

        // Add these jobs to an array list
        ArrayList<Job> jobsList = new ArrayList<>();
        jobsList.add(Doctor);
        jobsList.add(Pilot);
        jobsList.add(Attendent);
        jobsList.add(CoPilot);

        // Starting the simulation
        System.out.println("Welcome to plane flight simulator");
        System.out.println("Please choose the type of plane you want: (A) Helicopter or (B) Boeing 737" );
        



        // Creating passengers
        Passenger Joe = new Passenger("Joe", 10, false, Doctor);
        Joe.setJob(Pilot);

        System.out.println(Joe.getJob().getName());
        System.out.println(Airplane.intPassengers);
    }


    /**
    * A method that checks if the occupation is on the jobs list
    *
    * @param strUserInput - The name of the new job 
    * @param jobsList - An arraylist that defines the current jobs
    */	
    public boolean checkJob(String strUserInput, ArrayList<Job> jobsList){
        // Intializing instance variables 
        boolean isOnList = false;

        // For-each loop that iterates through the Jobs arrayList
        for (Job currentJob : jobsList){

            // If the user input equals to an object in the current jobs list
            if (strUserInput.equals(currentJob.getName())) {
                isOnList = true;
            }
        }
        // return whether the job is on the list
        return isOnList;          
    }
        
}
