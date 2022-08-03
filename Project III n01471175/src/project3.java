
/*
 * Author:		James Ngo
 * Course:		COP3503
 * Project#:	3
 * Title:		Work Order generator 
 * Due Date:	7/24/2022
 * 
 * 
 */

//import of class libraries
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class project3 {
	
	//initialize the csv files for employee , ticket , and workorder file 
	//Using the absolute path for myself since we are not asking for input
	public static String employeeFile = "C:\\Users\\James\\Downloads\\employee_data.csv";
	public static String ticketFile = "C:\\Users\\James\\Downloads\\ticket_data.csv";
	public static String workorderFile = "workorder_data.csv";
	
	//initialize the array list for the objects for employee , ticket , and workOrder list
	public static ArrayList<Employee> employeeList = new ArrayList<Employee>();
	public static ArrayList<Ticket> ticketList = new ArrayList<Ticket>();
	public static ArrayList<WorkOrder> workOrderList = new ArrayList<WorkOrder>();
	
	//Getting current date
	static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
	static Date date = new Date();
	static String currentDate = dateFormat.format(date);
	
	
	
	/**
	 * grabs to iterate two list arrays and make work order objects and enter in array list
	 * Takes in no parameters and no return 
	 * @throws FileNotFoundException 
	 */
	public static void createWorkOrders() throws FileNotFoundException 
	{
		
		//these int variables serve to add up the objects get number or set max
		int count = 0;
		int i = 0;
		int j = 0;
		
		//for loop with the max being set to ticketList size or 963
		for(i = 0 ; i < ticketList.size(); i ++) 
		{
			if(i % 10 == 0)//this is set to as to evenly split the number of tickets with smaller number of employee
			{
				count++;// counter
			}
					
			//constructor for the workOrder and adds on to the array list of workOrder
			WorkOrder wo = new WorkOrder(employeeList.get(count),ticketList.get(j), currentDate );
			project3.workOrderList.add(wo);
			
			j++;//counts up for the ticketList
			
		}//end while
		
	}//end of createWorkOrders()
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	
		//Introduction print statement to project
		System.out.println("Project 3 Work Order Generator ");
		System.out.println();
		
		//declare file handler
		FileHandler fileHandler = new FileHandler();
		
		//print loading employee data and add to log file 
		System.out.println("Loading Employee Data");
		fileHandler.logger("Loading Employee Data");
		
		//call to load in data from employee file
		fileHandler.readEmployeeData(employeeFile);
		
		//print loading ticket data and add to log file
		System.out.println("Loading Ticket Data");
		fileHandler.logger("Loading Ticket Data");
		
		//call to load in data from ticket file
		fileHandler.readTicketData(ticketFile);
		
		//print creating work data and add to log file
		System.out.println("Creating Work Orders");
		fileHandler.logger("Creating Work Orders");
		
		//calling createWorker from project3 
		createWorkOrders();
		
		
		//print writing work data and add to the log file
		System.out.println("Writing Work Order Data to File");
		fileHandler.logger("Writing Work Order Data to File");
		
		
		
		//call to write the csv file 
		fileHandler.writeData(workorderFile);
		
		
		//for loop to go line by line of the workorderlist to call on the getInfo from filehandler
		
		for(int y  = 0 ; y < ticketList.size(); y++) 
		{
			//adding from workorderlist info method to the log method
			fileHandler.logger(workOrderList.get(y).getInfo());
			
		}
		
		
		
		//closing print statement and adding to log file
		System.out.println("Work Orders Created. Program Exiting");
		fileHandler.logger("Work Orders Created. Program Exiting");
		System.out.println();
		
		
		//below is just testing.
	
		
	

	}
	
	

}
