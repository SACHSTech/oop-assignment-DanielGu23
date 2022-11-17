package Aircraft;

/**
* Boeing737 class file
* @author: D. Gu
* 
*/

public class Boeing737 extends Aircraft {

    private static int BOEING737_CAPACITY = 126;

    // Instance variables
    String strAirlineName;
    double dblVelocity;

    /**
    * Constructor - creates new instance of a Boeing737 object
    *
    * @param strAirlineName - the name of the airline
    * @param dblVelocity - the velocity at which the plane will be flying at
    * 
    */	
    public Boeing737(String strAirlineName, double dblVelocity){
        // Super method to take in parameters from Aircraft (parent) class        
        super(BOEING737_CAPACITY);        
        this.strAirlineName = strAirlineName;
        this.dblVelocity = dblVelocity;
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
    * Returns the velocity
    *
    * @return dblVelocity, the velocity of the boeing737
    */	
    public double getVelocity() {
        return this.dblVelocity;
    }

   /**
    * Returns the status of the boeing737
    *
    * @return result, the status/current information about the boeing737
    */	
    public String status() {
        String result = "This is " + strAirlineName + "Boeing 737\n" + "Total passengers on board: "+ getPassengers().size();
        result += "\n velocity: " + getVelocity() + "\n distance remaining: " + getDistance() + "\n";
        return result;
    }
}
