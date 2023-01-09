import java.util.ArrayList;
import java.util.Date;

public class Project3 {

	//declaration of string variables and array list.
	public static String employeeFileName = "employee_data.csv";
	public static String ticketFileName = "ticket_data.csv";
	public static String workOrderFileName = "workorder_data.csv";
	public static ArrayList<Employee> employeeList = new ArrayList<Employee>();
	public static ArrayList<Ticket> ticketList = new ArrayList<Ticket>();
	public static ArrayList<WorkOrder> workOrderList = new ArrayList<WorkOrder>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Display the project title followed by a blank line
		System.out.println("Project 3 Work Order Generator");
		System.out.println();
		
		FileHandler fileHandler = new FileHandler();
		String log = "log.txt";

		fileHandler.readEmployeeData(employeeFileName);
		fileHandler.readTicketData(ticketFileName);
		createWorkOrders();
		fileHandler.logger(log);
		fileHandler.writeData(workOrderFileName);

	}
	/**
	 * This method is to create the work order and iterate that divides dynamically for how many tickets and employees.
	 */
	public static void createWorkOrders() {
		int counter = ticketList.size() / employeeList.size();
		
		int equalTo = 0;
		int j = 0;
		for(int i = 0; i < ticketlist.size();i++)
		{
			WorkOrder workorder = new WorkOrder(employeeList.get(j), ticketList.get(i), new Date().toString());
			workOrderList.add(workorder);
			equalTo++;
			if(equalTo % counter == 0 && !(i == 1))
			{
				j++;
			}
		}//end of outer loop.

	}

}


