import java.util.ArrayList;

public class C206_CaseStudy {
	private static final int USER_REGISTER_ACCOUNT = 2;
	private static final int ADMIN_DELETE_PACAKGE = 9;
	private static final int ADMIN_ADD_PACKAGE = 8;
	private static final int ADMIN_VIEW_PACKAGE = 7;
	private static final int ADMIN_DELETE_APPOINTMENT = 6;
	private static final int ADMIN_VIEW_APPOINTMENT = 5;
	private static final int ADMIN_ADD_APPOINTMENT = 4;
	private static final int ADMIN_DELETE_ACCOUNT = 3;
	private static final int ADMIN_VIEW_ACCOUNT = 2;
	private static final int ADMIN_MANGE_USER_DETAILS = 1;
	private static final int ADMIN_QUIT = 10;
	private static final int DESIGNER_DELETE = 3;
	private static final int DESIGNER_ADD_QUOTATION = 2;
	private static final int DESIGNER_VIEW_QUOTATION = 1;
	private static final int DESIGNER_QUIT = 4;
	private static final int CUSTOMER_DELETE_APPOINTMENT = 4;
	private static final int CUSTOMER_ADD_APPOINTMENT = 3;
	private static final int CUSTOMER_VIEW_APPOINTMENT = 2;
	private static final int CUSTOMER_VIEW_PACKAGE = 1;
	private static final int CUSTOMER_QUIT = 5;
	private static final int OPTION_LOGIN = 1;
	private static final int OPTION_QUIT = 3;
	public static String typeUser = "";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Denise
		ArrayList<Package> packageList = new ArrayList <Package>();
		//Joshua
		ArrayList<User> accountList = new ArrayList <User>();
		//Jun Han
		ArrayList<Appointment> appointmentList = new ArrayList <Appointment>();
		//Martin
		ArrayList<Quote> quotationList = new ArrayList <Quote>();

		//Joshua
		accountList.add(new User ("Alice", "Alice", "AdminLife123@gmail.com", "Confirmed", "Admin"));
		accountList.add(new User ("Bob", "Bob", "Bobbiedesigns12@gmail.com", "Confirmed", "Designer"));
		accountList.add(new User ("Lament", "Lament", "LamentArtistic@gmail.com", "New", "Customer"));
		
		//Denise
		packageList.add(new Package (1,"Whole Place", "20/7/2022","1/2/2023", 10000.00));
		packageList.add(new Package (2,"room", "20/7/2022","20/8/2028", 3000.00));
		packageList.add(new Package (3,"kitchen", "20/7/2022","12/5/2025", 5000.00));
		packageList.add(new Package (4,"toilet", "20/7/2022","10/2/2024", 4000.00));
		
		//Jun Han
		appointmentList.add(new Appointment ("22/12/2022","11:59AM","Bob","Hougang Road 333","Lament"));
		appointmentList.add(new Appointment ("5/1/2023","13:00PM","Bob","Jurong West St 55","Lament"));
		appointmentList.add(new Appointment ("18/2/2023","10:30AM","Bob","Punggol Ave 7","Lament"));
		//Martin
		quotationList.add(new Quote (1, 1 , "Kitchen", "Tiles", 2500, "Bob", "22/12/2023", 3000));
		quotationList.add(new Quote (1 ,2 , "LivingRoom and Bedroom", "Tiles and Windows", 5000, "Bob", "13/2/2022", 6000));
		quotationList.add(new Quote (2 ,1 , "Kitchen", "Windows" , 1000, "Bob", "21/4/2022", 1300));
		
		
		int option = -1;
		while (option != OPTION_QUIT) 
		{
			mainMenu();
			
			option = Helper.readInt("Enter choice > ");
			//LOGINNNNNNNNNNNNNNNNN
			if (option == OPTION_LOGIN) 
			{
				//asking user to type name
				typeUser = Helper.readString("Enter Name > ");
				String typePassword = Helper.readString("Enter Password > ");
				//customer login
				for(int i = 2; i < accountList.size();i++)
				{
					
					if(typeUser.equals(accountList.get(i).getName()) && typePassword.equals(accountList.get(i).getPassword()))
					{
						System.out.println("Login Successful, Welcome " + accountList.get(i).getName());
						
						int custChoices= -1;
						
						while(custChoices != CUSTOMER_QUIT)
						{
							customerMenu();
							custChoices = Helper.readInt("Enter Choice > ");
							if(custChoices == CUSTOMER_VIEW_PACKAGE)
							{   //view package -Denise
								viewPackageInfo(packageList);
							}
							else if(custChoices == CUSTOMER_VIEW_APPOINTMENT)
							{   //view appointment -Jun Han
								viewAppointment(appointmentList);
							}
							else if(custChoices == CUSTOMER_ADD_APPOINTMENT)
							{   //add appointment -Jun Han
								Appointment App= inputAppointment();
								C206_CaseStudy.addAppointment(appointmentList, App);
								System.out.println("Appointment added");
							}
							else if(custChoices == CUSTOMER_DELETE_APPOINTMENT)
							{
								//delete appointment -Jun Han
								deleteAppointment(appointmentList);
							}
							else if(custChoices == CUSTOMER_QUIT)
							{
								System.out.println("Thank you for using Renovation ACE's services!");
							}
							else 
							{
								System.out.println("Invalid option!");
							}
						
						}
					}
				}
				
				
				
				//Designer Log in - Martin
				if(typeUser.equals(accountList.get(1).getName()) && typePassword.equals("Bob"))
				{
					System.out.println("Login Successful, Welcome " + accountList.get(1).getName());
					
					int custChoices= -1;
					while(custChoices != DESIGNER_QUIT)
					{
						designerMenu();
						custChoices = Helper.readInt("Enter Choice > ");
						if(custChoices == DESIGNER_VIEW_QUOTATION)
						{
							//View Quotation
							viewQuotation(quotationList);
						}
						else if(custChoices == DESIGNER_ADD_QUOTATION)
						{
							 //Add Quotation
							Quote quote= inputQuotation();
							C206_CaseStudy.addQuotation(quotationList, quote);
						}
						else if(custChoices == DESIGNER_DELETE)
						{
							//Delete Quotation
							deleteQuotation(quotationList);
						}
						else if(custChoices == DESIGNER_QUIT)
						{
							System.out.println("Thank you for using Renovation ACE's services!");
						}
						else 
						{
							System.out.println("Invalid option!");
						}
					
					}
				}
				
				//admin login
				if(typeUser.equals(accountList.get(0).getName()) && typePassword.equals("Alice")) 
				{
					System.out.println("Login Successful, Welcome " + accountList.get(0).getName());
					int custChoices= -1;
					while(custChoices !=ADMIN_QUIT)
					{
						adminMenu();
						custChoices = Helper.readInt("Enter Choice > ");
						if(custChoices == ADMIN_MANGE_USER_DETAILS)
						{
							//Manage User Status - Joshua
							ManageUserDetails(accountList);
						}
						else if(custChoices == ADMIN_VIEW_ACCOUNT)
						{
							//View User - Joshua
							ViewAcc(accountList);
						}
						else if(custChoices == ADMIN_DELETE_ACCOUNT)
						{
							//Delete User - Joshua
							DeleteAcc(accountList);
						}
						else if(custChoices == ADMIN_ADD_APPOINTMENT)
						{
							//Add Appointment - Jun Han
							Appointment App= inputAppointment();
							C206_CaseStudy.addAppointment(appointmentList, App);
							System.out.println("Appointment added");
						}
						else if(custChoices == ADMIN_VIEW_APPOINTMENT)
						{
							//view appointment - Jun Han
							viewAppointment(appointmentList);
						}
						else if(custChoices == ADMIN_DELETE_APPOINTMENT)
						{
							//delete appointment - Jun Han
							deleteAppointment(appointmentList);
						}
						else if(custChoices == ADMIN_VIEW_PACKAGE)
						{
							//view package - Denise
							viewPackageInfo(packageList);
						}
						else if(custChoices == ADMIN_ADD_PACKAGE)
						{
							//add package - Denise
							Package p = inputPackage();
							C206_CaseStudy.addPackageInfo(packageList, p);
							System.out.println("Package added");
						}
						else if(custChoices == ADMIN_DELETE_PACAKGE)
						{
							//delete package -Denise
							deletePackage (packageList);
						}
						else if(custChoices == ADMIN_QUIT)
						{
							System.out.println("Thank you for using Renovation ACE's services!");
						}
						else 
						{
							System.out.println("Invalid option!");
						}
					
					}
					
				}
				
				else {
					System.out.println("incorrect Name/Passowrd");
				}
			}
			
			
			//REGISTERRRRRRRRRRRRRRRRRR
			else if(option == USER_REGISTER_ACCOUNT) //Joshua
			{
				User user = inputRegister();
				C206_CaseStudy.registerAccount(accountList, user);
				System.out.println("Registered!");
			}
			
			//QUITSSSSSSSSSSSSSSSSSSSSSSSss
			else if (option == OPTION_QUIT) 
			{
				System.out.println("Thank you for using Renovation ACE's services!");
			} 
			else 
			{
				System.out.println("Invalid option!");
			}
		}
	}
	//Joshua
	public static String retrieveAllUser(ArrayList<User> accountList) {
		String output = "";
		
		for (int i = 0; i < accountList.size(); i++) {
			
			output += String.format("%-30s %-10s %-30s %-10s %-10s\n",
					accountList.get(i).getName(),
					accountList.get(i).getPassword(),
					accountList.get(i).getEmailAddress(),
					accountList.get(i).getStatus(),
					accountList.get(i).getRole());
		}
	
		
		return output;
		
	}
	//Martin	
	public static String retrieveAllQuotation(ArrayList<Quote> quotationList) {
		String output = "";
		
		for (int i = 0; i < quotationList.size(); i++) {

			output += String.format("%-10d %-10d %-25s %-25s %-10.2f %-10s %-10s %-10.2f\n",
					
					quotationList.get(i).getRequestID(),
					quotationList.get(i).getQuotation_ID(),
					quotationList.get(i).getRenovationCategory(),
					quotationList.get(i).getDescriptionOfItem(),
					quotationList.get(i).getItemPrice(),
					quotationList.get(i).getDesignerName(),
					quotationList.get(i).getStartDate(),
					quotationList.get(i).getQuoteAmount());
				
		
		}
		return output;
		
	}

	//Jun Han	
	public static String retrieveAllAppointment(ArrayList<Appointment> appointmentList) {
		String output = "";

		for (int i = 0; i < appointmentList.size(); i++) {

			output += String.format("%-20s %-20s %-20s %-20s %-15s\n", appointmentList.get(i).getAppointDate(), 
					appointmentList.get(i).getAppointTime(), 
					appointmentList.get(i).getDesignerName(),
					appointmentList.get(i).getPremiseAddress(),
					appointmentList.get(i).getCustName());
		
		}
		return output;
		
	}
	
	//Denise
	public static String retrieveAllPackage(ArrayList<Package> packageList) {
		String output = "";

		for (int i = 0; i < packageList.size(); i++) {

			output += String.format("%-15d %-15s %-10s %-10s %-10.2f\n", 
					packageList.get(i).getCode(), 
					packageList.get(i).getDescription(), 
					packageList.get(i).getStart(), 
					packageList.get(i).getEnd(), 
					packageList.get(i).getAmount()); 
		
		}
		return output;
		
	}
	


//Jun Han
		private static void viewAppointment(ArrayList<Appointment> appointmentList) 
		{
		// TODO Auto-generated method stub
			String views = String.format("%-20s %-20s %-20s %-20s %-15s \n", "AppointmentDate","AppointmentTime","Designer Name","Premise Address","Customer Name" );
			for(int i = 0; i < appointmentList.size(); i++)
			{	
				if(typeUser.equals(appointmentList.get(i).getCustName())) {
					views += String.format("%-20s %-20s %-20s %-20s %-15s \n", appointmentList.get(i).getAppointDate(),appointmentList.get(i).getAppointTime(),appointmentList.get(i).getDesignerName(),appointmentList.get(i).getPremiseAddress(),appointmentList.get(i).getCustName());
				}
				else if(typeUser.equals("Alice"))
				{
					views += String.format("%-20s %-20s %-20s %-20s %-15s \n", appointmentList.get(i).getAppointDate(),appointmentList.get(i).getAppointTime(),appointmentList.get(i).getDesignerName(),appointmentList.get(i).getPremiseAddress(),appointmentList.get(i).getCustName());
				}
				
			}
			System.out.println(views);
		}














//Joshua
		private static void mainMenu() {
			//Write code here for the mainMenu method.
			Helper.line(40, "-");
			System.out.println("WELCOME TO Renovation ACE");
			System.out.println("1. Enter Login credentials");
			System.out.println("2. Register for a account");
			System.out.println("3. Quit ");
			Helper.line(40, "-");
		}
	//JunHan	
		private static void customerMenu()
		{
			//customers main menu
			Helper.line(40, "-");
			System.out.println("WELCOME TO Renovation ACE");
			System.out.println("1. View Package");
			System.out.println("2. View Appointment");
			System.out.println("3. Add Appointment");
			System.out.println("4. Delete appointment");
			System.out.println("5. Quit ");
			Helper.line(40, "-");
		}
		//Denise
		private static void adminMenu()
		{
			//admin main menu
			Helper.line(40, "-");
			System.out.println("WELCOME TO Renovation ACE");
			System.out.println("1. Manage User status");
			System.out.println("2. View User");
			System.out.println("3. Delete User");
			System.out.println("4. Add Appointment");
			System.out.println("5. View Appointment");
			System.out.println("6. Delete Appointment");
			System.out.println("7. View Package");
			System.out.println("8. Add Package");
			System.out.println("9. Delete Package");
			System.out.println("10. Quit ");
			Helper.line(40, "-");
		}
		//martin
		private static void designerMenu()
		{
			//Designer menu
			Helper.line(40, "-");
			System.out.println("WELCOME TO Renovation ACE");
			System.out.println("1. View Quotation");
			System.out.println("2. Add Quotation");
			System.out.println("3. Delete Quotation");
			System.out.println("4. Quit ");
			Helper.line(40, "-");
		}
		//Joshua
		public static User inputRegister() {
			
			User user = null;
			
			//adds user details to arraylist user
			String regName = Helper.readString("Enter Your Name > ");
			String regPassword = Helper.readString("Enter your Password details > ");
			String regEmail = Helper.readStringRegEx("Enter email > ", "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
			String regStatus = "New";
			String regRoles = "Customer";
			System.out.println("Thank you for registering!");
			
			user = new User(regName, regPassword, regEmail, regStatus, regRoles);
			return user;
			
		}
		//Joshua
		public static void registerAccount(ArrayList<User> accountList, User user) 
		{
		// TODO Auto-generated method stub
		
			
			accountList.add(user);

		
		}
		//Joshua
		private static void ViewAcc(ArrayList<User> accountList)
		{
			String views = String.format("%-30s %-10s %-30s %-10s %-10s\n", "Name", "Password", "Email", "Status", "Roles");
			for(int i = 0; i < accountList.size(); i++) {
				views += String.format("%-30s %-10s %-30s %-10s %-10s\n", accountList.get(i).getName(), accountList.get(i).getPassword(), accountList.get(i).getEmailAddress(), accountList.get(i).getStatus(), accountList.get(i).getRole());
			}
			System.out.println(views);
		}
		//Joshua
		private static void ManageUserDetails(ArrayList<User> accountList)
		{
			ViewAcc(accountList);
			String ManageByUser = Helper.readString("Enter Name to change the status > ");
			for(int i = 0; i < accountList.size(); i++) {
				if(accountList.get(i).getName().equals(ManageByUser)) 
				{
					accountList.get(i).setStatus("Confirmed");
					System.out.println(accountList.get(i).getName() +"'s status have been changed to Confimed.");
				}
			}
		}
		//Joshua
		private static void DeleteAcc(ArrayList<User> accountList)
		{
			String deleteByName = Helper.readString("Enter Name to remove account > ");
			for(int i = 0; i < accountList.size(); i++) {
				if(accountList.get(i).getName().equals(deleteByName)) {
					accountList.remove(i);
					System.out.println(deleteByName +" have been deleted.");
				}
			}
		}
		//Denise
		private static void viewPackageInfo(ArrayList<Package> packageList) 
		{
			
			String views = String.format("%-15s %-15s %-10s %-10s %-10s \n", "Code","Description","StartDate","EndDate","Amount" );
			for(int i = 0; i < packageList.size(); i++)
			{	
				views += String.format("%-15d %-15s %-10s %-10s %-10.2f \n", packageList.get(i).getCode(),packageList.get(i).getDescription(),packageList.get(i).getStart(),packageList.get(i).getEnd(),packageList.get(i).getAmount());
			}
			System.out.println(views);
		}
		//Denise
		public static Package inputPackage() {
			
			Package p = null;
			
			int addPackageCode = Helper.readInt("Enter Package Code > ");
			String addPackageDescription = Helper.readString("Enter Package Description > ");
			String addPackageStart = Helper.readString("Enter Package Start Date> ");
			String addPackageEnd = Helper.readString("Enter Package End Date > ");
			double addPackageAmount = Helper.readDouble("Enter Package Amount > ");
			
			p = new Package(addPackageCode , addPackageDescription , addPackageStart , addPackageEnd , addPackageAmount);
			return p;
			
		}
		//Denise
		public static void addPackageInfo (ArrayList<Package> packageList, Package p) 
		{

			packageList.add(p);
		
		}
		//Denise
		private static void deletePackage (ArrayList<Package> packageList) 
		{
			viewPackageInfo(packageList);
			int deletePackageCode = Helper.readInt("Enter Package Code > ");
			boolean checker = false;
			try {
				for (int i = 0; i <= packageList.size()+1; i++) 
				{
					if (packageList.get(i).getCode() == deletePackageCode)
					{
					packageList.remove(i);
					checker = true;
					break;
					}
				}
			}
			catch (Exception e) {
				checker = false;
	        }
			if (checker == true) 
			{
				System.out.println(deletePackageCode +" has been deleted!");
			}
			else
			{
				System.out.println("Package Code not found!");
			}
		}
		
		//Jun Han
		public static void deleteAppointment(ArrayList<Appointment> appointmentList)
		{
			viewAppointment(appointmentList);
			String enterAddress = Helper.readString("Enter the Address of location to delete > ");
			for(int i = 0; i < appointmentList.size(); i++)
			{
				if(enterAddress.equals(appointmentList.get(i).getPremiseAddress()))
				{
					appointmentList.remove(i);
					System.out.println("Appointment have been deleted!");
					break;
				}
			}
		}
		
		//Jun Han
		public static Appointment inputAppointment(){
			
			Appointment App=null;
			
			String addAppointDate = Helper.readString("Enter Appointment Date > ");
			String addAppointTime = Helper.readString("Enter Appointment Time > ");
			String addDesignerName = Helper.readString("Enter Designer Name > ");
			String addPremiseAddress = Helper.readString("Enter Premises Address > ");
			String addCustName = Helper.readString("Enter Customer Name > ");
			
			App = new Appointment(addAppointDate, addAppointTime, addDesignerName, addPremiseAddress, addCustName);
			return App;
			
		}
		
		//Jun Han
		public static void addAppointment(ArrayList<Appointment> appointmentList, Appointment App) 
		{

					appointmentList.add(App);
			
		}
		//Martin
		public static void viewQuotation(ArrayList<Quote> quotationList)
		{
			String views = String.format("%-10s %-10s %-25s %-25s %-10s %-10s %-10s %-10s\n", "Request ID","Quotation ID","Renovation Category","Description of Item","Item Price","Designer Name", "Start Date", "Quote Amount");
			for(int i = 0; i < quotationList.size(); i++)
			{
				views += String.format("%-10d %-10d %-25s %-25s %-10.2f %-10s %-10s %-10.2f\n", quotationList.get(i).getRequestID(), quotationList.get(i).getQuotation_ID(), quotationList.get(i).getRenovationCategory(), quotationList.get(i).getDescriptionOfItem(), quotationList.get(i).getItemPrice(), quotationList.get(i).getDesignerName(), quotationList.get(i).getStartDate(),quotationList.get(i).getQuoteAmount());
			}
			System.out.println(views);
		}
		
		//Martin
		public static Quote inputQuotation() {
			
			Quote quote =null;
			
			int addRequestID = Helper.readInt("Enter RequestID > ");
			int addQuotationID = Helper.readInt("Enter QuotationID > ");
			String addRenovationC = Helper.readString("Enter Renovation Category > ");
			String addDescriptionItem = Helper.readString("Enter Item Description > ");
			Double addItemPrice = Helper.readDouble("Enter Item Price > ");
			String addDesignerName = Helper.readString("Enter Designer Name > ");
			String addStartDate = Helper.readString("Enter Start Date > ");
			double addQuoteAmount = Helper.readDouble("Enter Quote Amount > ");
			
			quote = new Quote(addRequestID, addQuotationID, addRenovationC, addDescriptionItem, addItemPrice, addDesignerName, addStartDate, addQuoteAmount);
			return quote;
			
		}
		//martin
		public static void addQuotation(ArrayList<Quote> quotationList, Quote quote)
		{

			quotationList.add(quote);
			System.out.println("Quotation has been added Successfully.");
			
		}
	//martin
		public static void deleteQuotation(ArrayList<Quote> quotationList)
		{
			viewQuotation(quotationList);
			int temp1 = Helper.readInt("Enter the Request ID > ");
			int temp2 = Helper.readInt("Enter the Quotation ID > ");
			for(int i = 0;i < quotationList.size();i++)
			{
				if(temp1 == quotationList.get(i).getRequestID())
				{
					if(temp2 == quotationList.get(i).getQuotation_ID())
					{
						quotationList.remove(i);
						System.out.println("Quotation have been successfully deleted.");
					}
				}
			}
			
			
		}

		
	
		
}