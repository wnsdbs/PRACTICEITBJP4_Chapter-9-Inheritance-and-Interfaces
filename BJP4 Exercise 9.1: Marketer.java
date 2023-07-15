/*
Write the class Marketer to accompany the other law firm classes described in this chapter. 
Marketers make $50,000 ($10,000 more than general employees) and have an additional method 
called advertise that prints "Act now, while supplies last!" Make sure to interact with the 
Employee superclass as appropriate.
	*/
  
// A class to represent employees in general.
public class Employee {
	public int getHours() {
		return baseHours;                // 40 hours/week
	}

	public double getSalary() {
		return baseSalary;               // $40,000.00
	}

	public int getVacationDays() {
		return baseVacationDays;         // 10 days
	}

	public String getVacationForm() {
		return baseVacationForm;         // yellow
	}


	// These are so that test cases can change the base values
	// and make sure that subclasses also change their values.
	// (Your code that you submit is NOT supposed to directly use, call,
	// or modify the values below!  They are here only to help Practice-It
	// successfully test your code.  Please ignore them.)
	
	private int baseHours = 40;
	private double baseSalary = 40000.0;
	private int baseVacationDays = 10;
	private String baseVacationForm = "yellow";
	
	public final void setBaseHours(int hours) {
		baseHours = hours;
	}
	public final void setBaseSalary(double salary) {
		baseSalary = salary;
	}
	public final void setBaseVacationDays(int days) {
		baseVacationDays = days;
	}
	public final void setBaseVacationForm(String form) {
		baseVacationForm = form;
	}
}

SOLUTION:

public class Marketer extends Employee{
    public double getSalary(){
        return super.getSalary() + 10000.00;
    }
    public void advertise(){
        System.out.println("Act now, while supplies last!");
    }
}


