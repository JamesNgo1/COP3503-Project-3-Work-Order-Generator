/**
 * 
 * Ticket class with customer object and two string variables
 *
 */
public class Ticket implements DataHandler {
	
	//initialize of variables and object
	private Customer customer;
	private String createdAt;
	private String ticketId;
	
	
	/**
	 * 
	 * @param customer
	 * @param ticketId
	 * @param createdAt
	 * Constructor of the ticket with customer , ticketid , and createdAt
	 */
	public Ticket(Customer customer, String ticketId, String createdAt) 
	{
		//properties for the ticket object
		this.customer = customer;
		this.ticketId = ticketId;
		this.createdAt = createdAt;
		
		
	}
	
	
	/**
	 * Method is a getter that gets information pertaining  ticketid  and createdata for the log
	 * @return
	 */
	public String getInfo()
	{
		//temp leaving out customer info and leaving two varables for workorder
		return  customer.getInfo() + " Created at: " + this.createdAt + " Ticket Id: " + this.ticketId + " Created At: ";
		
	}

	
	/**
	 * getter of the csv file
	 * @return
	 */
	public String getFileData()
	{
		
		return ticketId + createdAt;
		
	}
	
	/**
	 * 
	 * @param ticketId
	 * @param createdAt
	 * is setter for the variables
	 */
	public void setTicket(String ticketId , String createdAt) {
		this.ticketId = ticketId;
		this.createdAt = createdAt;
	}
	

	

}
