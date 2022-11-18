package Aircraft;

/**
* Helicopter class file
* @author: D. Gu
* 
*/

public class Helicopter extends Aircraft{
   
    private static int HELICOPTER_CAPACITY = 4;
    
    // Instance variables
    double dblHighVelocity;
    double dblLowVelocity;
    int intAltitude;

    /**
    * Constructor - creates new instance of a helicopter object
    *
    * @param intAltitude - the height that the helicopter flies at
    * @param dblHighVelocity - the velocity of the helicopter at high altitude
    * @param dblLowVelocity - the velocity of the helicopter at low altitude
    */	
    public Helicopter(double dblHighVelocity, double dblLowVelocity, int intAltitude){        
        // Super method to take in parameters from Aircraft (parent) class
        super(HELICOPTER_CAPACITY);
        this.intAltitude = intAltitude;
        this.dblHighVelocity = dblHighVelocity;
        this.dblLowVelocity = dblLowVelocity;
    }

    /**
    * Returns the altitude the helicopter will fly at
    *
    * @return intAltitude, the altitude of the helicopter
    */	
    public int getAltitude(){
        return this.intAltitude;
    }

    /**
    * Setter method that modifies the altitude
    *
    * @param intAltitude, the new altitude of the helicopter
    */	
    public void setAltitude(int intAltitude) {
        this.intAltitude = intAltitude;
    }

    /**
    * Getter method to get the velocity of the helicopter
    *
    * @return dblHighVelocity/dblLowVelocity - the velocity
    */	
    public double getVelocity() {
        // If the altitude is over or equal to 100km, the velocity is dblHighVelocity
        if (this.intAltitude >= 100){
            return this.dblHighVelocity;
        } // Otherwise return the velocity as dblLowVelocity
        else {
            return this.dblLowVelocity;
        }
    }

    /**
    * Returns the status of the helicopter
    *
    * @return result, the status/current information about the helicopter
    */	
    public String status() {
        String result = "This is a Helicopter\n" + "Total passengers on board: "+ getPassengers().size();
        result += "\n velocity: " + getVelocity() + " km/hr \n altitude: " + getAltitude() + " km above sea level \n distance remaining: " + getDistance() + " km \n";
        return result;
    }    
}
