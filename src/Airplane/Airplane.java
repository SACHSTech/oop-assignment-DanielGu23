package Airplane;

/**
* Airplane class file
* @author: D. Gu
* 
*/

public class Airplane {
    
    // Instance variables
    private String strDestination;
    public static int intPassengers;
    private String strStartLocation;
    private String strAirlineName;
    private int intVelocity;

    /**
    * Constructor - creates new instance of a passanger object
    *
    * @param strDestination - the name of the destination
    * @param strStartLocation - the name of the starting location
    * @param strAirlineName - the name of the airline
    * @param intVelocity - the velocity at which the plane will be flying at
    */	
    public Airplane(String strDestination, String strStartLocation, String strAirlineName, int intVelocity){
        this.strDestination = strDestination;
        this.strStartLocation = strStartLocation;
        this.strAirlineName = strAirlineName;
        this.intVelocity = intVelocity;
    }

    /**
    * Returns the destination
    *
    * @return strDestiantion, the destination
    */	
    public String getDestination() {
        return this.strDestination;
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


}