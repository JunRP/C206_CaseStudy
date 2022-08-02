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
	
	//ArrayList
	private ArrayList<Package> packageList;
	private ArrayList<User> accountList;
	private ArrayList<Appointment> appointmentList;
	
	public C206_CaseStudyTest(){
		super();
	}


	@Before
	public void setUp() throws Exception {
		
		//User
		user1 = (new User ("Alice", 89898989, "AdminLife123@gmail.com", "Confirmed", "Admin"));
		user2 = (new User ("Bob", 98989898, "Bobbiedesigns12@gmail.com", "Confirmed", "Designer"));
		user3 = (new User ("Lament", 68686868, "LamentArtistic@gmail.com", "New", "Customer"));
		
		//Package
		p1 = (new Package (1,"Whole Place", "20/7/2022","1/2/2023", 10000.00));
		p2 = (new Package (2,"room", "20/7/2022","20/8/2028", 3000.00));
		p3 = (new Package (3,"kitchen", "20/7/2022","12/5/2025", 5000.00));
		p4 = (new Package (4,"toilet", "20/7/2022","10/2/2024", 4000.00));
		
		//ArrayList
		accountList = new ArrayList<User>();
		packageList = new ArrayList<Package>();
		
	}
	
	@Test
	public void testAddAppointment() {
		
		// Appointment list is not null, so that can add a new appointment - boundary
	//	assertNotNull("Test if there is valid Chromebook arraylist to add to", appointmentList);
		
		//Given an empty list, after adding 1 appointment, the size of the list is 1 - normal
		//The appointment just added is as same as the first item of the list
//		MainApp.addChromebook(appointmentList, cb1);		
//		assertEquals("Test that Appointment arraylist size is 1", 1, appointmentList.size());
//		assertSame("Test that appointment is added", cb1, appointmentList.get(0));
	}

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
