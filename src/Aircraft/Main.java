package Aircraft;

import java.io.*;
import java.util.*;

/**
* Main class file
* @author: D. Gu
* 
*/

public class Main {

    // Create class variables
    static ArrayList<Job> jobsList = new ArrayList<>();
    static boolean isTherePilot = false;

    public static void main(String[] args) throws IOException {
        
        // Method variables
        boolean isAnOption = false;

        // Setting up Buffered reader for user input
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Creating jobs
        Job Doctor = new Job("Doctor", 150000.00, "Addresses healthcare needs");
        Job Pilot = new Job("Pilot", 70000.00, "Flies planes");
        Job CoPilot = new Job("Co-Pilot", 65000.00, "Helps fly the plane");
        Job Attendent = new Job("Flight Attendent", 40000.00, "Serves passengers");
        Job Jobless = new Job("Jobless", 0.00, "Does nothing");

        // Add these jobs to an array list
        jobsList.add(Doctor);
        jobsList.add(Pilot);
        jobsList.add(Attendent);
        jobsList.add(CoPilot);
        jobsList.add(Jobless);

        // Starting the simulation
        System.out.println("Welcome to plane flight simulator\n");
        Aircraft aircraft = null;

        // Choose which airplane the user wants
        while (isAnOption == false){
            System.out.print("Please choose the type of aircraft you want: (A) Helicopter or (B) Boeing 737 - " );
            String strChoice = keyboard.readLine();
            
            if (strChoice.equals("a") || strChoice.equals("A")){
                System.out.println("You have chosen the Helicopter\n");
                System.out.println("The initial altitude will be set to 0 km");
                System.out.println("The velocity of the helicopter is: 200 km/hr");
                // Initialize the aircraft into a helicopter
                aircraft = new Helicopter(500.00, 200.00, 0);
                isAnOption = true;
            }
            else if (strChoice.equals("b") || strChoice.equals("B")){
                System.out.println("You have chosen the Boeing737\n");
                // Initialize the aircraft into a boeing737
                aircraft = new Boeing737("Air Canada", 1000.00);
                System.out.println("The velocity of the Boeing737 is: 1000 km/hr");
                isAnOption = true;
            }
        }

        // Ask the user for distance needed to travel
        System.out.println();
        System.out.print("How far do you want to travel (in Km): ");
        double dblDistance = Double.parseDouble(keyboard.readLine());
        System.out.println();
        aircraft.setDistance(dblDistance);

        // create a menu with different commands for the user
        ArrayList<String> commands = new ArrayList<>(Arrays.asList("Add passenger", "Flight", "Status", "Quit"));
        // If the aircraft is a helicopter, add the set altitude command
        if (aircraft instanceof Helicopter){
            commands.add("Set altitude");
        }

        // When there is still distance left and user has not quit, run the commands menu
        boolean isQuit = false;
        while (!isQuit && !(aircraft.getDistance() == 0)){
            System.out.println("Choose your command: ");
            
            // Print commands
            for (int i = 0; i < commands.size(); i++){
                System.out.print(i + ".)" +commands.get(i) + "   ");
            }
            System.out.println();
            int intIndex = Integer.parseInt(keyboard.readLine());
            // Cases for each of the commands
            // For each case run a different method
            switch (intIndex){
                case 0: 
                  addPassenger(aircraft, keyboard);
                  break;
                case 1:
                  flight(aircraft, keyboard);
                  break;
                case 2:
                  System.out.print(aircraft.status());
                  break;
                case 3:
                  isQuit = true;
                  System.out.println("Terminating flight...");
                  break;
                case 4:
                  if (aircraft instanceof Helicopter){
                    setAltitude((Helicopter)aircraft, keyboard);
                  }
                  break;                  
            }
        }
    }


    /**
    * Asks the user for information about the passenger and adds that information into an aircraft
    *
    * @param aircraft - the aircraft
    * @param keyboard - reads the user's input 
    */	
    public static void addPassenger(Aircraft aircraft, BufferedReader keyboard) throws IOException {
        
        // Asks for the passenger's name and age and records it
        System.out.print("What is the passenger's name? ");
        String strName = keyboard.readLine();
        System.out.print("What is the passenger's age? ");
        int intAge = Integer.parseInt(keyboard.readLine());
        int intIndex = -1;        

        // Do the following as long as intIndex == -1 or intIndex >= jobsList.size()
        do{
            System.out.println("What is the passenger's job? ");
            // Print out a menu with the job options the user can use
            for (int i = 0; i < jobsList.size(); i++){
                System.out.print(i + ".)" +jobsList.get(i).getName()+ "   ");
            }
            System.out.println();
            intIndex = Integer.parseInt(keyboard.readLine());
        } while (intIndex == -1 || intIndex >= jobsList.size());
        
        // Create a job object, set it equal to the user option, and add it to a new passenger 
        Job job = jobsList.get(intIndex);
        Passenger passenger = new Passenger(strName, intAge, job);
        aircraft.addPassenger(passenger);

        // If the job's name is Pilot or Co-Pilot then consider the passenger as a pilot
        if (job.getName().equals("Pilot") || job.getName().equals("Co-Pilot")){
            aircraft.addPilot(passenger);
            isTherePilot = true;
        }
    }


    /**
    * Simulates the flight of the aircraft
    *
    * @param - aircraft, the aircraft
    * @param - keyboard, reads the user's input
    */	
    public static void flight(Aircraft aircraft, BufferedReader keyboard) throws IOException {
        
        System.out.print("How many hours do you want to fly for? ");
        int intHours = Integer.parseInt(keyboard.readLine());

        // Find the remaining distance based on how long the user wants to fly for
        double dblDistance = aircraft.flight(intHours);
        
        // If the distance is 0, destination has been reached
        if (dblDistance == 0){
            System.out.println("You have arrived at your destination safely! ");
        } 
        else if (isTherePilot == true) {
            System.out.println("You have " + dblDistance + " km remaining");
        }
    }


    /**
    * Sets the altitude at which the helicopter will fly at
    *
    * @param - helicopter, the helicopter object
    * @param - keyboard, reads the user's input
    */	
    public static void setAltitude(Helicopter helicopter, BufferedReader keyboard) throws IOException {
       
        System.out.println("How high do you want your helicopter to fly? ");
        int intAltitude = Integer.parseInt(keyboard.readLine());
        helicopter.setAltitude(intAltitude);
        
        // Print out the velocity of the helicopter and the altitude
        // If altitude is 100m or greater, the velocity will be greater 
        System.out.println("Your helicopter is flying at an altitude of " +intAltitude+ "km above sea level");
        System.out.println("Your helicopter's velocity is now " + helicopter.getVelocity()+ "km/hr");
    }    
        
}
