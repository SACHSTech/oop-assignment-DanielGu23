package Aircraft;

public class Boeing737 extends Aircraft {
    private static int BOEING737_CAPACITY = 126;
    // Instance variables
    String strAirlineName;
    double dblVelocity;

    /**
    * Constructor - creates new instance of a Boeing737 object
    *
    * @param dblDistance - the distance of the flight
    * @param strStartLocation - the name of the starting location
    * @param strAirlineName - the name of the airline
    * @param intVelocity - the velocity at which the plane will be flying at
    * 
    */	
    public Boeing737(String strAirlineName, double dblVelocity){
        // Super method to take in parameters from Airplane (parent) class        
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

    public double getVelocity() {
        return this.dblVelocity;
    }

    public String status() {
        return "This is " + strAirlineName + "Boeing 737\n" + "Total passengers "+ getPassengers().size();
    }
}
