/**
 * 
 * @Employee class that has object constructor and other methods to get infomation
 *
 */
public class Employee extends Person implements DataHandler {
	
		// TODO Auto-generated constructor stub
	

	//three properties
	private String employeeid;
	private String clockededIn;
	private String hiredDate;
	
	/**
	 * 
	 * @param employeeId
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param address
	 * @param phoneNumber
	 * @param clockedIn
	 * @param hiredDate
	 * employee constructor for the object
	 */
	public Employee(String employeeId, String firstName, String lastName, String email, String address, String phoneNumber, String clockedIn, String hiredDate) 
	{
		//super class of the person and remaining variables
		super(firstName, lastName, address, phoneNumber, email);
		this.employeeid = employeeId;
		this.clockededIn = clockedIn;
		this.hiredDate = hiredDate;
	}
	
	

	/**
	 * getter method that returns get info from employee
	 * are needed for the log and basic information
	 */
	public String getInfo() 
	{
		return "employeeInfo Employee Name: " + getfirstName() + "," + getlastName() + ", Employee ID:  " + employeeid + " Time Clocked In: " + clockededIn ;
		
	}
	
	
	/**
	 * 
	 * @return
	 * returns the properties that are needed for the work order csv file
	 */
	public String getFileData() {
		//return employeeid + getfirstName() + getlastName() + this.clockedIn  ;\\
		return employeeid + getfirstName() + getlastName() + this.clockededIn;
		
	}
	
	public void setHireDate(String date)
	{
		this.hiredDate = date;
	}
	

}
