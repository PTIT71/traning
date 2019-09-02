package com.training.action;

public class EmployeeCount {
	
	/* Hard-coded sample data. Normally this would come from a real data
    source such as a database. */

	private static Employee[] employees =
		  {
		    new Employee("Javed"),
		    new Employee("Shankar"),
		    new Employee("Subodh"),
		    new Employee("Raj"),
		    new Employee("Sagar"),
		    new Employee("Sachin")
		  };
	  // Calculate count of employees.
	  public int getEmployeeCount() {
	    return employees.length;
	  }


}
