
public class Employee extends Person {

	private String employeeId, clockedIn, hiredDate;
	
	public Employee(String firstName, String lastName, String address, String phoneNumber, String email,  String employeeId, String clockedIn, String hiredDate) {
		super(firstName, lastName, address, phoneNumber, email);
		this.employeeId = employeeId;
		this.clockedIn = clockedIn;
		this.hiredDate = hiredDate;
	}
	
	public String getInfo() {
		return "Employee Info: Employee Name: "+getLastName() +","+getFirstName()+"	"+"Employee ID: "+employeeId +"	"+"Time Clocked In: "+clockedIn;
		
	}
	
	public String getFileData() {
		return employeeId + "," + getFirstName() + "," + getLastName() + "," + clockedIn;
		
	}
	
}
