package Aircraft;

public class Helicopter extends Aircraft{
   
    // Instance variables
    int intAltitude;

    /**
    * Constructor - creates new instance of a helicopter object
    *
    * @param dblDistance - the distance of the flight
    * @param strStartLocation - the name of the starting location
    * @param strAirlineName - the name of the airline
    * @param intVelocity - the velocity at which the plane will be flying at
    */	
    public Helicopter(double dblDistance, String strStartLocation, String strAirlineName, int intVelocity, int intAltitude){
        
        // Super method to take in parameters from Airplane (parent) class
        super(dblDistance, strStartLocation, strAirlineName, intVelocity);
        this.intAltitude = intAltitude;
    }

    /**
    * Returns the altitude the helicopter will aim to fly at
    *
    * @return intAltitude, the altitude of the helicopter
    */	
    public int getAltitude(){
        return this.intAltitude;
    }
}
