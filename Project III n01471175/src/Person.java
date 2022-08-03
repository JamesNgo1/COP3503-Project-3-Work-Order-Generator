/**
 * 
 * Person class or the super class for the general foundation 
 *
 */
public class Person {
	
	//declare intialize  properties of person class
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;
	private String email;
	
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param phoneNumber
	 * @param email
	 * constructor method for person takes in couple variables
	 */
	public Person(String firstName, String lastName, String address, String phoneNumber, String email)
	{
		//intiliazing the variables
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	/**
	 * 
	 * @return the first also the getter
	 */
	public String getfirstName()
	{
		return firstName;
	}
	
	/**
	 * 
	 * @return the last name also the getter
	 */
	public String getlastName()
	{
		return lastName;
	}
	
	/**
	 * 
	 * @return the address also the getter
	 */
	public String getaddress()
	{
		return address;
	}
	
	/**
	 * 
	 * @return the phone number also the getter
	 */
	public String getphoneNumber()
	{
		return phoneNumber;
	}
	
	
	/**
	 * 
	 * @return email also the getter 
	 */
	public String getemail()
	{
		return email;
	}
	
	//setters 
	/**
	 * 
	 * @param name of the name that sets the first name
	 */
	public void setfirstName(String name) {
		firstName = name;
	}
	
	/**
	 * 
	 * @param name of the name and set last name 
	 */
	public void setlastName(String name) {
		lastName = name;
	}
	
	/**
	 * 
	 * @param name of the address also setter 
	 */
	public void setaddress(String name) {
		address = name;
	}
	
	/**
	 * 
	 * @param name as it sets the phone number
	 */
	public void setphoneNumber(String name) {
		phoneNumber = name;
	}
	
	/**
	 * 
	 * @param name as it sets the email
	 */
	public void setemail(String name) {
		email = name;
	}
}
