/**
 * 
 * workorder class as it combines the employee and ticket objects and get the current date
 * also provides constructor of objects and methods
 *
 */
public class WorkOrder implements DataHandler {
	private Employee employee;
	private Ticket ticket;
	private String createdAt;
	
	/**
	 * 
	 * @param employee
	 * @param ticket
	 * @param createdAt
	 * Below is the constructor of the work order class where it takes in the employee and ticket object and current date
	 */
	public WorkOrder(Employee employee, Ticket ticket, String createdAt) 
	{
		//properties
		this.employee = employee;
		this.ticket = ticket;
		this.createdAt = createdAt;
		
	}
	
	/**
	 * one of the getters method that gets the employee , ticket  , and current date information
	 */
	public String getInfo(){

		//return statement
		return employee.getInfo() + ticket.getInfo() + createdAt;
	}
	
	/**
	 * get filedata for the employee , ticket , and customer
	 */
	public String getFileData() {
		
		//aggregation issue with not allowing me to get customer file data
		return employee.getFileData() + ", " +  ticket.getFileData() + ","  ;
		
		
	}

}
