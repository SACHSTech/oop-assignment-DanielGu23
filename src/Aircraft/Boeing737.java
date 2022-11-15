package Aircraft;

public class Boeing737 extends Aircraft {

    /**
    * Constructor - creates new instance of a Boeing737 object
    *
    * @param dblDistance - the distance of the flight
    * @param strStartLocation - the name of the starting location
    * @param strAirlineName - the name of the airline
    * @param intVelocity - the velocity at which the plane will be flying at
    * @param dblWingLength - the wing length of the airplane in meters
    */	
    public Boeing737(double dblDistance, String strStartLocation, String strAirlineName, int intVelocity, double dblWingLength){
        
        // Super method to take in parameters from Airplane (parent) class
        super(dblDistance, strStartLocation, strAirlineName, intVelocity);
    }

}
