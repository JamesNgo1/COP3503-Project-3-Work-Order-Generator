
public class Customer extends Person {

	private String customerId, accountNumber;
	
	public Customer(String firstName, String lastName, String address, String phoneNumber, String email, String customerId, String accountNumber) {
		super(firstName, lastName, address, phoneNumber, email);
		this.customerId = customerId;
		this.accountNumber = accountNumber;
	}
	
	public String getInfo() {
		return "	Customer Info: Customer Name: "+getLastName()+","+getFirstName()+"	Customer ID: "+customerId+"	Account Number: "+accountNumber;
		
	}
	
	public String getFileData() {
		return customerId + "," +  getFirstName() + "," + getLastName();
		
	}
}
