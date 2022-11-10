package Airplane;

import java.io.*;
import java.util.*;

/**
* Job class file
* @author: D. Gu
* 
*/

public class Job {

    // Instance variables
    private String strName;
    private double dblSalary;
    private String strPurpose;
    private boolean isNecessary;

    /**
    * Constructor - creates new instance of a job object
    *
    * @param strName - the name of the job
    * @param dblSalary - the yearly salary of the job
    * @param strPurpose - determines what the purpose of the job is
    * @param isNecessary - is the job necessary on an airplane
    */	
    public Job (String strName, double dblSalary, String strPurpose, boolean isNecessary) {
    
        this.strName = strName;
        this.dblSalary = dblSalary;
        this.strPurpose = strPurpose;
        this.isNecessary = isNecessary;
	}

}
