package Aircraft;

/**
* Passenger class file
* @author: D. Gu
* 
*/

public class Passenger {

    // Instance variables
    private String strName;
    private int intAge;
    private Job Job;

   /**
    * Constructor - creates new instance of a passanger object
    *
    * @param strName - the name of the passenger
    * @param intAge - the age of the passenger
    * @param Job - The job of the passenger on the flight (aggregation)
    */	
    public Passenger (String strName, int intAge, Job Job) {    
        this.strName = strName;
        this.intAge = intAge;
        this.Job = Job;
	}

   /**
    * Returns the name of the passenger
    *
    * @return strName, the name of the passenger
    */	
    public String getName() {
        return this.strName;
    }

   /**
    * Returns the age of the passenger
    *
    * @return intAge, the age of the passenger
    */	
    public int getAge() {
        return this.intAge;
    }

   /**
    * Returns the job of the passenger on the flight
    *
    * @return strJob, the passenger's occupation
    */	
    public Job getJob() {
        return this.Job;
    }


}