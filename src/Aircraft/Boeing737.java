package Aircraft;

public class Boeing737 extends Aircraft {
   
    // Instance variables
    double dblWingLength;

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
        this.dblWingLength = dblWingLength;
    }

    /**
    * Returns the wing length of the boeing737 in meters
    *
    * @return dblWingLength, the wing length
    */	
    public double getWingLength() {
        return this.dblWingLength;
    }

    /**
    * Returns whether the wing length is long enough
    *
    * @param dblWingLength - the length of the boeing737's wings
    *
    * @return true or false
    */	
    public boolean isLongEnough(double dblWingLength) {
        // Checks if wing length is longer than 30.00m
        if (dblWingLength <= 30.00){
            return false;
        }
        else{
            return true;
        }
    }
}
