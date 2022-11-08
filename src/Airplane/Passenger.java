package Airplane;

/**
* Passenger class file
* @author: D. Gu
* 
*/

public class Passenger {

    // Instance variables
    private String strName;
    private int intAge;
    private boolean hasFlightExperience;
    private String strTripPurpose;

   /**
    * Constructor - creates new instance of a passanger object
    *
    * @param strName - the name of the passenger
    * @param intAge - the age of the passenger
    * @param hasFlightExperience - determines if the passenger has former flight experience
    * @param strTripPurpose - describes the purpose of the passanger flying on the airplane
    */	
    public Passenger (String strName, int intAge, boolean hasFlightExperience, String strTripPurpose) {
    
        this.strName = strName;
        this.intAge = intAge;
        this.hasFlightExperience = hasFlightExperience;
        this.strTripPurpose = strTripPurpose;
	}

   /**
    * Returns the name of the passenger
    *
    * @return String strName, the name of the passenger
    */	
    public String getName() {
        return this.strName;
    }

}
