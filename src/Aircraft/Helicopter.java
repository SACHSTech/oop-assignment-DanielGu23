package Aircraft;

public class Helicopter extends Aircraft{
   
    private static int HELICOPTER_CAPACITY = 4;
    // Instance variables
    double dblHighVelocity;
    double dblLowVelocity;
    int intAltitude;

    /**
    * Constructor - creates new instance of a helicopter object
    *
    * @param dblDistance - the distance of the flight
    * @param strStartLocation - the name of the starting location
    * @param strAirlineName - the name of the airline
    * @param intVelocity - the velocity at which the plane will be flying at
    */	
    public Helicopter(double dblHighVelocity, double dblLowVelocity, int intAltitude){        
        // Super method to take in parameters from Airplane (parent) class
        super(HELICOPTER_CAPACITY);
        this.intAltitude = intAltitude;
        this.dblHighVelocity = dblHighVelocity;
        this.dblLowVelocity = dblLowVelocity;
    }

    /**
    * Returns the altitude the helicopter will aim to fly at
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

    public double getVelocity() {
        if (this.intAltitude >= 100){
            return this.dblHighVelocity;
        } else {
            return this.dblLowVelocity;
        }
    }

    public String status() {
        String result = "This is a Helicopter\n" + "Total passengers on board: "+ getPassengers().size();
        result += "\n velocity: " + getVelocity() + "\n altitude: " + getAltitude() + "\n distance remaining: " + getDistance() + "\n";
        return result;
    }    
}
