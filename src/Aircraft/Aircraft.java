package Aircraft;

/**
* Airplane class file
* @author: D. Gu
* 
*/

public class Aircraft {
    
    // Instance variables
    private double dblDistance;
    public static int intPassengers;
    private String strStartLocation;
    private String strAirlineName;
    private int intVelocity;

    /**
    * Constructor - creates new instance of an Airplane object
    *
    * @param dblDistance - the distance of the flight
    * @param strStartLocation - the name of the starting location
    * @param strAirlineName - the name of the airline
    * @param intVelocity - the velocity at which the plane will be flying at
    */	
    public Aircraft(double dblDistance, String strStartLocation, String strAirlineName, int intVelocity){
        this.dblDistance = dblDistance;
        this.strStartLocation = strStartLocation;
        this.strAirlineName = strAirlineName;
        this.intVelocity = intVelocity;
    }

    /**
    * Returns the distance
    *
    * @return dblDistance, the distance needed to travel
    */	
    public double getDistance() {
        return this.dblDistance;
    }

    /**
    * Returns the starting position
    *
    * @return strStartLocation, the starting location
    */	
    public String getStartLocation() {
        return this.strStartLocation;
    }

    /**
    * Returns the airline's name
    *
    * @return strAirlineName, the name of the airline
    */	
    public String getAirlineName() {
        return this.strAirlineName;
    }

    /**
    * Returns the velocity of the plane
    *
    * @return intVelocity, the velocity of the plane
    */	
    public int getVelocity() {
        return this.intVelocity;
    }


}