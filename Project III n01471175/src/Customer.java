/**
 * 
 * Class is preserve for customer object
 *
 */
public class Customer extends Person implements DataHandler {
	//initialize properties for a customer and extension to person
	private String customerId;
	private String accountNumber;
	
	
	/**
	 * 
	 * @param customerId
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param address
	 * @param phoneNumber
	 * @param accountNumber
	 * Method is a constructor that lays out the properties of the customer
	 */
	public Customer(String customerId , String firstName, String lastName,String email,String address, String phoneNumber, String accountNumber)
	{
		//inherits from the person data with super and other variables.
		super(firstName, lastName, address, phoneNumber, email);
		this.customerId = customerId;
		this.accountNumber = accountNumber;
		
	}
	
	/**
	 * 
	 * @return
	 * getter to organize the nesscary information to workorder and log 
	 */
	public String getInfo()
	{
		//leaving out  getemail , getaddress, getphoneNumber , and account for the workorder 
		return "Customer Info: Customer Name: " + getfirstName() + "," + getlastName() + " Customer ID: " + customerId + " Account Number: " + accountNumber ;
		
		
	}
	
	/**
	 * 
	 * @return
	 * returns customerid , getfirstname , and getlastname for the csv file 
	 */
	public String getFileData()
	{
		return   customerId + getfirstName() + getlastName()  ;
		
		
	}
	/**
	 * 
	 * @param customer
	 * @param customerId
	 * @param accountNumber
	 * setters for the customer , customerId , and the accountNumber
	 */
	
	public void setinfo( Customer customer ,String customerId ,String accountNumber)
	{
		//Customer customer = customer;
		this.customerId = customerId;
		this.accountNumber = accountNumber;
	}
	
	
	

}
