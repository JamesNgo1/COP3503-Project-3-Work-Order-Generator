
public class Ticket implements DataHandler {

	private Customer customer;
	private String createdAt, ticketId;
	
	public Ticket(Customer customer, String createdAt, String ticketId) {
		this.customer = customer;
		this.createdAt = createdAt;
		this.ticketId = ticketId;
	}
	
	public String getInfo() {
		return customer.getInfo() + "	Created At: "+createdAt + "	Ticket Id: "+ticketId;
		
	}
	
	public String getFileData() {
		return customer.getFileData() + "," + ticketId + "," + createdAt;
	}
}
