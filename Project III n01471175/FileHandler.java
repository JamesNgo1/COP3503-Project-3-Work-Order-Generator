import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileHandler {

	private Scanner scnr = new Scanner(System.in); 
	
	public void writeData(String workOrderFileName) {
		try {
			FileWriter fw =new FileWriter(workOrderFileName);
			fw.write("employee_id,employee_first_name,employee_last_name,clocked_in,customer_id,customer_first_name,customer_last_name,ticket_id,ticket_createdAt,workorder_createdAt \n");
			for(WorkOrder workorder : Project3.workOrderList)
			 {
				String data = workorder.getFileData();
				fw.write(data);
				
			}// end for loop
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 * This is the employee csv file reader
	 * Reads in the data to make an object and store that object into an array.
	 * @param employeeFileName
	 */
	public void readEmployeeData(String employeeFileName) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(employeeFileName));
			String line = "";
		      String dl = ",";

			  //ignore the header of the file.
			  line = br.readLine();
			  String[] reader;
			  while ((line = br.readLine()) != null) 
			  {

		    	  reader = line.split(dl);
		    	  
		    	  Employee newEmployee = new Employee(reader[1], reader[2], reader[4], reader[6], reader[3],  reader[0], reader[6], reader[7]);
		    	  Project3.employeeList.add(newEmployee);
		    	  
			  }
			  br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Ticket reader.
	 * @param ticketFileName
	 */
	public void readTicketData(String ticketFileName) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(ticketFileName));
			String line = "";
		      String dl = ",";

			  //ignore the header
			  line = br.readLine();
			  String[] reader;
			  while ((line = br.readLine()) != null) {

		    	  reader = line.split(dl);
		    	  
		    	  Customer customer = new Customer(reader[1], reader[2], reader[4], reader[5], reader[3], reader[0], reader[6]);
		    	  Ticket newTicket = new Ticket(customer, reader[8], reader[7]);
		    	  Project3.ticketList.add(newTicket);
		    	  
			  }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void logger(String log) {
		try {
			FileWriter fw =new FileWriter(log, true);
			 SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");  
			 Date date = new Date();  
			 String newDate = formatter.format(date);  
			fw.write(newDate+" Loading Employee Data"+"\n");
			System.out.println("Loading Employee Data");



			fw.write(newDate+" Loading Ticket Data"+"\n");
			System.out.println("Loading Ticket Data");
			fw.write(newDate+" Creating Work Orders"+"\n");
			System.out.println("Creating Work Orders");
			fw.write(newDate+" Writing Work Order Data to File"+"\n");
			System.out.println("Writing Work Order Data to File");
			for(WorkOrder workorder : Project3.workOrderList) {
				String data = workorder.getInfo();
				fw.write(data);
			}
			System.out.println("Work Orders created. Program Exiting");
			fw.write(newDate+" Work Orders created. Program Exiting"+"\n");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public Scanner getScnr() {
		return scnr;
	}

	public void setScnr(Scanner scnr) {
		this.scnr = scnr;
	}
}
