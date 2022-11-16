package Aircraft;

import java.io.*;
import java.util.*;

/**
* Main class file
* @author: D. Gu
* 
*/

public class Main {

    static ArrayList<Job> jobsList = new ArrayList<>();
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
        System.out.println("Welcome to plane flight simulator");
        Aircraft aircraft = null;
        // Choose which airplane the user wants
        while (isAnOption == false){
            System.out.print("Please choose the type of plane you want: (A) Helicopter or (B) Boeing 737 - " );
            String strChoice = keyboard.readLine();
            
            if (strChoice.equals("a") || strChoice.equals("A")){
                System.out.println("You have chosen the Helicopter");
                aircraft = new Helicopter(500.00, 200.00, 0);
                isAnOption = true;
            }
            else if (strChoice.equals("b") || strChoice.equals("B")){
                System.out.println("You have chosen the Boeing737");
                aircraft = new Boeing737("Air Canada", 1000.00);
                isAnOption = true;
            }
        }
        System.out.println();
        System.out.println("How far do you want to travel: ");
        double dblDistance = Double.parseDouble(keyboard.readLine());
        aircraft.scheduleFlight(dblDistance);
        ArrayList<String> commands = new ArrayList<>(Arrays.asList("Add passenger", "Flight", "Status", "Quit"));
        if(aircraft instanceof Helicopter){
            commands.add("Set altitude\t");
        }
        boolean isQuit = false;
        while(!isQuit && !(aircraft.getDistance()==0)){
            System.out.println("Choose your command: ");
            for(int i=0; i<commands.size(); i++){
                System.out.print(i + ")"+commands.get(i) + "\t");
            }
            System.out.println();
            int intIndex = Integer.parseInt(keyboard.readLine());
            switch(intIndex){
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
                  System.out.println("Terminating flight");
                  break;
            }
        };
    }

    public static void addPassenger(Aircraft aircraft, BufferedReader keyboard) throws IOException {
        System.out.println("What is the passenger's name? ");
        String strName = keyboard.readLine();
        System.out.println("What is the passenger's age? ");
        int intAge = Integer.parseInt(keyboard.readLine());
        int intIndex = -1;        
        do{
            System.out.println("What is the passenger's job? ");
            for(int i=0; i<jobsList.size(); i++){
                System.out.print(i + ")"+jobsList.get(i).getName()+"\t");
            }
            System.out.println();
            intIndex = Integer.parseInt(keyboard.readLine());
        } while(intIndex <0 || intIndex >= jobsList.size());
        Job job = jobsList.get(intIndex);
        Passenger passenger = new Passenger(strName, intAge, job);
        aircraft.passengerOnBoard(passenger);
        if (job.getName().equals("Pilot") || job.getName().equals("Co-Pilot")){
            aircraft.pilotOnBoard(passenger);
        }
    }

    public static void flight(Aircraft aircraft, BufferedReader keyboard) throws IOException {
        System.out.println("How many hours do you want to fly for? ");
        int intHours = Integer.parseInt(keyboard.readLine());
        double dblDistance = aircraft.flight(intHours);
        if(dblDistance == 0){
            System.out.println("You have arrived at your destination safely! ");
        } else {
            System.out.println("You have " + dblDistance + " km remaining");
        }
    }

        
}
