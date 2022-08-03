
//import of class libraries
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * File Handler class that deals with four methods of write , read employee and ticket , and the log file
 * 
 *
 */
public class FileHandler   {
	
	Scanner scnr = new Scanner(System.in);
	
	/**
	 * 
	 * @param workOrderFileName
	 * @throws IOException 
	 */
	public void writeData(String workOrderFileName) throws IOException
	{
		//file writer
		FileWriter fileOutput = new FileWriter(workOrderFileName);
		
		try (PrintWriter printWriter = new PrintWriter(fileOutput)) {
			//printing to the file with the appropriate headers
			printWriter.println("employee_id, employee_first_name, employee_last_name, clocked_in, customer_id, "
					+ "customer_first_name, customer_last, ticket_id, ticket_createdAt, workorder_createdAt");
			
			//for loop to go line by line to print to file 
			for(int x = 0; x < project3.ticketList.size(); x++)
			{
				//issue or printing to file
				//printWriter.printf(workOrderList.get(x).getFileData());
				
			}
		}
		
		
		
		
	}
	
	/**
	 * prints a new line
	 */
	private void println() {
		// TODO Auto-generated method stub
		System.out.println();
		
	}

	/**
	 * 
	 * @param employeeFileName
	 * @throws FileNotFoundException
	 * The method takes in the employee data(string) and makes an object and add within the array list.
	 * It returns no value
	 * 
	 */
	public void readEmployeeData(String employeeFileName) throws FileNotFoundException
	{
		try 
		{
			//declares the file and reads it in
			String line = "";
			FileReader file = new FileReader(employeeFileName);
			Scanner scnrFile = new Scanner(file);
		
			//helps ignore the first line / headers for the data
			if(scnrFile.hasNextLine()) 
			{
				line = scnrFile.nextLine(); 
			}// end if 
		
			//reading file line by line
			while(scnrFile.hasNextLine()) 
			{
				//delimit by the comma and put in string array
				line = scnrFile.nextLine();
				String[] lineData = line.split(",");
				
				//declare string variables to certain line data elements 
				String employeeId = lineData[0];
				String firstName = lineData[1];
				String lastName = lineData[2];
				String email = lineData[3];
				String address = lineData[4];
				String phoneNumber = lineData[5];
				String clockedIn = lineData[6];
				String hiredDate = lineData[7];
				
				//making of employee objects with assign variables
				Employee employee = new Employee(employeeId,firstName,lastName, email ,address,phoneNumber,clockedIn,hiredDate);
				project3.employeeList.add(employee);
				
			
			}//end while
			scnrFile.close();
			
		}// end of try 
		
		//catch 
		catch(FileNotFoundException e) 
		{
			System.out.println("The file you enter was not found or incorrect.");
		}
		
	}
	
	
	/**
	 * 
	 * @param ticketFileName
	 * @throws FileNotFoundException
	 * The main purpose is to take in the parameter of a string / file name and makes an object that adds to the array list
	 * it returns no value 
	 */
	public void readTicketData(String ticketFileName) throws FileNotFoundException
	{
		
		//declares the file and reads it in
		String line = "";
		FileReader file = new FileReader(ticketFileName);
		Scanner scnrFile = new Scanner(file);
		
		//helps ignore the first line / headers for the data
		if(scnrFile.hasNextLine()) 
		{
			line = scnrFile.nextLine(); //this helps skips the header
		}// end if 
			
		
		//reading file line by line
		while(scnrFile.hasNextLine()) 
		{
			//delimit by the comma and put in string array
			line = scnrFile.nextLine();
			String[] lineData = line.split(",");
			
			//declare string variables to certain line data elements 
			String customerId = lineData[0];
			String firstName = lineData[1];
			String lastName = lineData[2];
			String email = lineData[3];
			String address = lineData[4];
			String phoneNumber = lineData[5];
			String accountNumber = lineData[6]; 
			
			//making of customer objects with assign variables	
			Customer customer = new Customer(customerId, firstName, lastName , email , address, 
							phoneNumber , accountNumber);
					
			//making more variables for the remaining properties of ticket 
			String ticketId = lineData[7];
			String createdAt = lineData[8];
					
	
			//making ticket object and add to the ticketlist array list
			Ticket ticket = new Ticket(customer,ticketId,createdAt);
			project3.ticketList.add(ticket);
			
		}//end while
		scnrFile.close();
		
	}
	
	/**
	 * 
	 * @param log
	 * @throws IOException
	 * Main purpose is to log down every action with parameter string
	 * returns no value
	 */
	public void logger(String log) throws IOException 
	{
		//Use to find current date 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		Date date = new Date();
		
		try //try catch
		{
			//File write to existing file
			FileWriter file = new FileWriter("myLog.txt",true);
			BufferedWriter bw = new BufferedWriter(file);
			
			//appending to the file with current date and the log variable from method
			bw.append(dateFormat.format(date));
			bw.append(" " + log);
			bw.newLine();
			bw.close();
		}
		catch(IOException ioe) //catch
		{
			System.out.println("error");
		}
		
	}
	
	
	
		
		
	

}
