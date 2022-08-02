import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	
	//User
	private User user1;
	private User user2;
	private User user3;
	
	//Package 
	private Package p1;
	private Package p2;
	private Package p3;
	private Package p4;
	
	//Appointment
	private Appointment App1;
	private Appointment App2;
	private Appointment App3;

	//Quotation
	private Quote quote1;
	private Quote quote2;
	private Quote quote3;
	
	//ArrayList
	private ArrayList<Package> packageList;
	private ArrayList<User> accountList;
	private ArrayList<Appointment> appointmentList;
	private ArrayList<Quote> quotationList;
	
	public C206_CaseStudyTest(){
		super();
	}


	@Before
	public void setUp() throws Exception {
		
		//User
		user1 = (new User ("May", "89898989", "AdminLife123@gmail.com", "Confirmed", "Admin"));
		user2 = (new User ("Bob", "98989898", "Bobbiedesigns12@gmail.com", "Confirmed", "Designer"));
		user3 = (new User ("Lament", "68686868", "LamentArtistic@gmail.com", "New", "Customer"));
		
		//Package
		p1 = (new Package (1,"Whole Place", "20/7/2022","1/2/2023", 10000.00));
		p2 = (new Package (2,"room", "20/7/2022","20/8/2028", 3000.00));
		p3 = (new Package (3,"kitchen", "20/7/2022","12/5/2025", 5000.00));
		p4 = (new Package (4,"toilet", "20/7/2022","10/2/2024", 4000.00));
		
		//Appointment
		App1 = new Appointment ("22/12/2022","11:59AM","Bob","Hougang Road 333","Lament");
		App2 = new Appointment ("5/1/2023","13:00PM","Bob","Jurong West St 55","Lament");
		App3 = new Appointment ("18/2/2023","10:30AM","Bob","Punggol Ave 7","Lament");
		
		//Quotation
		quote1 = new Quote (1, 1 , "Kitchen", "Tiles", 2500, "Bob", "22/12/2023", 3000);
		quote2 = new Quote (1 ,2 , "LivingRoom and Bedroom", "Tiles and Windows", 5000, "Bob", "13/2/2022", 6000);
		quote3 = new Quote (2 ,1 , "Kitchen", "Windows" , 1000, "Bob", "21/4/2022", 1300);
		

		
		//ArrayList
		accountList = new ArrayList<User>();
		packageList = new ArrayList<Package>();
		appointmentList = new ArrayList<Appointment>();
		quotationList = new ArrayList<Quote>();
		
	
	}
	
	//========================================================================Quotation====================================================================================
	
	@Test
	public void testAddQuotation() {
		
		// Appointment list is not null, so that can add a new appointment - boundary
		assertNotNull("Test if there is valid Quotation arraylist to add to", quotationList);
				
		//Given an empty list, after adding 1 appointment, the size of the list is 1 - normal
		//The appointment just added is as same as the first item of the list	
		C206_CaseStudy.addQuotation(quotationList, quote1);
		assertEquals("Test that Quotation arraylist size is 1", 1, quotationList.size());
			
		//The item just added is as same as the first item of the list
		assertSame("Test that quotation is added", quote1, quotationList.get(0));
				
		//Add another item. test The size of the list is 2?
		C206_CaseStudy.addQuotation(quotationList, quote2);
		assertEquals("Test that Quotation arraylist size is 2?", 2, quotationList.size());
		assertSame("Test that Quotation is added same as 2nd item of the list?", quote2, quotationList.get(1));
			
	}
//	
//	public void testViewQuotationt() {
//		
//		//test if the expected output string same as the list of appointment retrieved from the SourceCentre
//		//test if the list of appointment retrieved from the SourceCentre is empty
//		C206_CaseStudy.addQuotation(quotationList, quote1);
//		C206_CaseStudy.addQuotation(quotationList, quote2);
//		C206_CaseStudy.addQuotation(quotationList, quote3);
//		
//		String allQuotation= C206_CaseStudy.retrieveAllQuotation(quotationList);
//		String testOutput = "";
//	
//				
//		//test if the expected output string same as the list of chromebooks retrieved from the SourceCentre
//		allQuotation= C206_CaseStudy.retrieveAllQuotation(quotationList);
//
//		testOutput = String.format("%-20s %-20s %-20s %-20s %-15s\n","22/12/2022","11:59AM","Bob","Hougang Road 333","Lament");
//		testOutput += String.format("%-20s %-20s %-20s %-20s %-15s\n","5/1/2023","13:00PM","Bob","Jurong West St 55","Lament");
//		testOutput += String.format("%-20s %-20s %-20s %-20s %-15s\n","18/2/2023","10:30AM","Bob","Punggol Ave 7","Lament");
//		
//		assertEquals("Check that ViewAllAppointmentList", testOutput, allQuotation);
//				
//	}
	
	
	
	@Test
	//======================================================================Appointment===================================================================================
	public void testAddAppointment() {
		
		// Appointment list is not null, so that can add a new appointment - boundary
		assertNotNull("Test if there is valid Appointment arraylist to add to", appointmentList);
		
		//Given an empty list, after adding 1 appointment, the size of the list is 1 - normal
		//The appointment just added is as same as the first item of the list	
		C206_CaseStudy.addAppointment(appointmentList, App1);
		assertEquals("Test that Appointment arraylist size is 1", 1, appointmentList.size());
		
		//The item just added is as same as the first item of the list
		assertSame("Test that appointment is added", App1, appointmentList.get(0));
		
		//Add another item. test The size of the list is 2?
		C206_CaseStudy.addAppointment(appointmentList, App2);
		assertEquals("Test that Appointment arraylist size is 2?", 2, appointmentList.size());
		assertSame("Test that Appointment is added same as 2nd item of the list?", App2, appointmentList.get(1));
		
	}
	@Test
	public void testViewAppointment() {
		
		//test if the expected output string same as the list of appointment retrieved from the SourceCentre
		//test if the list of appointment retrieved from the SourceCentre is empty
		C206_CaseStudy.addAppointment(appointmentList, App1);
		C206_CaseStudy.addAppointment(appointmentList, App2);
		C206_CaseStudy.addAppointment(appointmentList, App3);
		
		String allAppointment= C206_CaseStudy.retrieveAllAppointment(appointmentList);
		String testOutput = "";
	
				
		//test if the expected output string same as the list of chromebooks retrieved from the SourceCentre
		allAppointment= C206_CaseStudy.retrieveAllAppointment(appointmentList);

		testOutput = String.format("%-20s %-20s %-20s %-20s %-15s\n","22/12/2022","11:59AM","Bob","Hougang Road 333","Lament");
		testOutput += String.format("%-20s %-20s %-20s %-20s %-15s\n","5/1/2023","13:00PM","Bob","Jurong West St 55","Lament");
		testOutput += String.format("%-20s %-20s %-20s %-20s %-15s\n","18/2/2023","10:30AM","Bob","Punggol Ave 7","Lament");
		
		assertEquals("Check that ViewAllAppointmentList", testOutput, allAppointment);
				
	}
	@Test
	public void testDeleteAppointment() {
		
		//check Appointment list is not null, so that can delete an item
		C206_CaseStudy.addAppointment(appointmentList, App1);
		C206_CaseStudy.addAppointment(appointmentList, App2);
		C206_CaseStudy.addAppointment(appointmentList, App3);
		assertNotNull(appointmentList);
		
		//Given an empty list, after adding two appointments, the size of the list is 5, after removing an appointment, then the size of list becomes 4.
		assertNotNull("Check if there is valid Item arrayList to add to", appointmentList);
		
		
		assertEquals(3, appointmentList.size());
		assertEquals("Check that appointment arraylist size is 3", 3, appointmentList.size());
		appointmentList.remove(0);
		assertEquals(2, appointmentList.size());
		assertEquals("Check that appointment arraylist size is 2", 2, appointmentList.size());
		
		//Remove another item, then list is empty
		appointmentList.remove(0);
		appointmentList.remove(0);

		assertEquals(0, appointmentList.size());
		assertEquals("Check that appointment arraylist size is 0", 0, appointmentList.size());
		
		
	}
	
	//===================================================================================================================================================================

	@After
	public void tearDown() throws Exception {
		user1 = null;
		user2 = null;
		user3 = null;
		
		p1 = null;
		p2 = null;
		p3 = null;
		p4 = null;
	}
	

	
	

}
