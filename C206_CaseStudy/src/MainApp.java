import java.util.ArrayList;

public class MainApp {
	public static String typeUser = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Package> packageList = new ArrayList <Package>();
		ArrayList<User> accountList = new ArrayList <User>();
		ArrayList<Appointment> appointmentList = new ArrayList <Appointment>();
		ArrayList<Quote> quotationList = new ArrayList <Quote>();

		accountList.add(new User ("Alice", "Alice", "AdminLife123@gmail.com", "Confirmed", "Admin"));
		accountList.add(new User ("Bob", "Bob", "Bobbiedesigns12@gmail.com", "Confirmed", "Designer"));
		accountList.add(new User ("Lament", "Lament", "LamentArtistic@gmail.com", "New", "Customer"));
		
		packageList.add(new Package (1,"Whole Place", "20/7/2022","1/2/2023", 10000.00));
		packageList.add(new Package (2,"room", "20/7/2022","20/8/2028", 3000.00));
		packageList.add(new Package (3,"kitchen", "20/7/2022","12/5/2025", 5000.00));
		packageList.add(new Package (4,"toilet", "20/7/2022","10/2/2024", 4000.00));
		

		appointmentList.add(new Appointment ("22/12/2022","11:59AM","Bob","Hougang Road 333","Lament"));
		appointmentList.add(new Appointment ("5/1/2023","13:00PM","Bob","Jurong West St 55","Lament"));
		appointmentList.add(new Appointment ("18/2/2023","10:30AM","Bob","Punggol Ave 7","Lament"));
		
		quotationList.add(new Quote (1, 1 , "Kitchen", "Tiles", 2500, "Bob", "22/12/2023", 3000));
		quotationList.add(new Quote (1 ,2 , "LivingRoom and Bedroom", "Tiles and Windows", 5000, "Bob", "13/2/2022", 6000));
		quotationList.add(new Quote (2 ,1 , "Kitchen", "Windows" , 1000, "Bob", "21/4/2022", 1300));
		
		
		int option = -1;
		while (option != 3) 
		{
			mainMenu();
			
			option = Helper.readInt("Enter choice > ");
			//LOGINNNNNNNNNNNNNNNNN
			if (option == 1) 
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
						
						while(custChoices != 5)
						{
							customerMenu();
							custChoices = Helper.readInt("Enter Choice > ");
							if(custChoices == 1)
							{   //view package
								viewPackageInfo(packageList);
							}
							else if(custChoices == 2)
							{   //view appointment
								viewAppointment(appointmentList);
							}
							else if(custChoices == 3)
							{   //add appointment
								Appointment App= inputAppointment();
								MainApp.addAppointment(appointmentList, App);
								System.out.println("Appointment added");
							}
							else if(custChoices == 4)
							{
								//delete appointment
								deleteAppointment(appointmentList);
							}
							else if(custChoices == 5)
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
				
				
				
				//Designer Log in
				if(typeUser.equals(accountList.get(1).getName()) && typePassword.equals("Bob"))
				{
					System.out.println("Login Successful, Welcome " + accountList.get(1).getName());
					
					int custChoices= -1;
					while(custChoices != 4)
					{
						designerMenu();
						custChoices = Helper.readInt("Enter Choice > ");
						if(custChoices == 1)
						{
							//View Quotation
							viewQuotation(quotationList);
						}
						else if(custChoices == 2)
						{
							 //Add Quotation
							addQuotation(quotationList);
						}
						else if(custChoices == 3)
						{
							//Delete Quotation
							deleteQuotation(quotationList);
						}
						else if(custChoices == 4)
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
					while(custChoices !=10)
					{
						adminMenu();
						custChoices = Helper.readInt("Enter Choice > ");
						if(custChoices == 1)
						{
							//Manage User Status
							ManageUserDetails(accountList);
						}
						else if(custChoices == 2)
						{
							//View User
							ViewAcc(accountList);
						}
						else if(custChoices == 3)
						{
							//Delete User
							DeleteAcc(accountList);
						}
						else if(custChoices == 4)
						{
							//Add Appointment
							Appointment App= inputAppointment();
							MainApp.addAppointment(appointmentList, App);
							System.out.println("Appointment added");
						}
						else if(custChoices == 5)
						{
							//view appointment
							viewAppointment(appointmentList);
						}
						else if(custChoices == 6)
						{
							//delete appointment
							deleteAppointment(appointmentList);
						}
						else if(custChoices == 7)
						{
							//view package
							viewPackageInfo(packageList);
						}
						else if(custChoices == 8)
						{
							//add package
							addPackageInfo (packageList);
						}
						else if(custChoices == 9)
						{
							//delete package
							deletePackage (packageList);
						}
						else if(custChoices == 10)
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
			else if(option == 2)
			{
				Register(accountList);
			}
			
			//QUITSSSSSSSSSSSSSSSSSSSSSSSss
			else if (option == 3) 
			{
				System.out.println("Thank you for using Renovation ACE's services!");
			} 
			else 
			{
				System.out.println("Invalid option!");
			}
		}
	}
		
		

		



		







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















		private static void mainMenu() {
			//Write code here for the mainMenu method.
			Helper.line(40, "-");
			System.out.println("WELCOME TO Renovation ACE");
			System.out.println("1. Enter Login credentials");
			System.out.println("2. Register for a account");
			System.out.println("3. Quit ");
			Helper.line(40, "-");
		}
		
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
		
		private static void Register(ArrayList<User> accountList) 
		{
		// TODO Auto-generated method stub
			//adds user details to arraylist user
			String regName = Helper.readString("Enter Your Name > ");
			String regPassword = Helper.readString("Enter your Password details > ");
			String regEmail = Helper.readStringRegEx("Enter email > ", "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
			String regStatus = "New";
			String regRoles = "Customer";
			System.out.println("Thank you for registering!");
			accountList.add(new User (regName, regPassword, regEmail, regStatus, regRoles));
		}
		private static void ViewAcc(ArrayList<User> accountList)
		{
			String views = String.format("%-30s %-10s %-30s %-10s %-10s\n", "Name", "Password", "Email", "Status", "Roles");
			for(int i = 0; i < accountList.size(); i++) {
				views += String.format("%-30s %-10s %-30s %-10s %-10s\n", accountList.get(i).getName(), accountList.get(i).getPassword(), accountList.get(i).getEmailAddress(), accountList.get(i).getStatus(), accountList.get(i).getRole());
			}
			System.out.println(views);
		}
		
		private static void ManageUserDetails(ArrayList<User> accountList)
		{
			ViewAcc(accountList);
			String ManageByUser = Helper.readString("Enter Name to change the status > ");
			for(int i = 0; i < accountList.size(); i++) {
				if(accountList.get(i).getName().equals(ManageByUser)) 
				{
					accountList.get(i).setStatus("Confirmed");
				}
			}
		}
		private static void DeleteAcc(ArrayList<User> accountList)
		{
			String deleteByName = Helper.readString("Enter Name to remove account > ");
			for(int i = 0; i < accountList.size(); i++) {
				if(accountList.get(i).getName().equals(deleteByName)) {
					accountList.remove(i);
				}
			}
		}
		
		private static void viewPackageInfo(ArrayList<Package> packageList) 
		{
			
			String views = String.format("%-15s %-15s %-10s %-10s %-10s \n", "Code","Description","StartDate","EndDate","Amount" );
			for(int i = 0; i < packageList.size(); i++)
			{	
				views += String.format("%-15d %-15s %-10s %-10s %-10.2f \n", packageList.get(i).getCode(),packageList.get(i).getDescription(),packageList.get(i).getStart(),packageList.get(i).getEnd(),packageList.get(i).getAmount());
			}
			System.out.println(views);
		}
		
		private static void addPackageInfo (ArrayList<Package> packageList) 
		{
			int addPackageCode = Helper.readInt("Enter Package Code > ");
			String addPackageDescription = Helper.readString("Enter Package Description > ");
			String addPackageStart = Helper.readString("Enter Package Start Date> ");
			String addPackageEnd = Helper.readString("Enter Package End Date > ");
			double addPackageAmount = Helper.readDouble("Enter Package Amount > ");
			
			packageList.add(new Package (addPackageCode , addPackageDescription , addPackageStart , addPackageEnd , addPackageAmount));
			System.out.println("Added successfully");
		}
		
		private static void deletePackage (ArrayList<Package> packageList) 
		{
			viewPackageInfo(packageList);
			
			int deletePackageCode = Helper.readInt("Enter Package Code > ");
			packageList.remove(deletePackageCode-1); 
			System.out.println("Deleted");
			
		}
		
		public static void deleteAppointment(ArrayList<Appointment> appointmentList)
		{
			viewAppointment(appointmentList);
			String enterAddress = Helper.readString("Enter the Address of location to delete > ");
			for(int i = 0; i < appointmentList.size(); i++)
			{
				if(enterAddress.equals(appointmentList.get(i).getPremiseAddress()))
				{
					appointmentList.remove(i);
					System.out.println("Deleted");
					break;
				}
			}
		}
		
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
		
		
		public static void addAppointment(ArrayList<Appointment> appointmentList, Appointment App) 
		{

					appointmentList.add(App);
					System.out.println("Added successfully");
			
		}
		
		public static void viewQuotation(ArrayList<Quote> quotationList)
		{
			String views = String.format("%-10s %-10s %-25s %-25s %-10s %-10s %-10s %-10s\n", "Request ID","Quotation ID","Renovation Category","Description of Item","Item Price","Designer Name", "Start Date", "Quote Amount");
			for(int i = 0; i < quotationList.size(); i++)
			{
				views += String.format("%-10d %-10d %-25s %-25s %-10.2f %-10s %-10s %-10.2f\n", quotationList.get(i).getRequestID(), quotationList.get(i).getQuotation_ID(), quotationList.get(i).getRenovationCategory(), quotationList.get(i).getDescriptionOfItem(), quotationList.get(i).getItemPrice(), quotationList.get(i).getDesignerName(), quotationList.get(i).getStartDate(),quotationList.get(i).getQuoteAmount());
			}
			System.out.println(views);
		}
		
		public static void addQuotation(ArrayList<Quote> quotationList)
		{
			int addRequestID = Helper.readInt("Enter RequestID > ");
			int addQuotationID = Helper.readInt("Enter QuotationID > ");
			String addRenovationC = Helper.readString("Enter Renovation Category > ");
			String addDescriptionItem = Helper.readString("Enter Item Description > ");
			Double addItemPrice = Helper.readDouble("Enter Item Price > ");
			String addDesignerName = Helper.readString("Enter Designer Name > ");
			String addStartDate = Helper.readString("Enter Start Date > ");
			double addQuoteAmount = Helper.readDouble("Enter Quote Amount > ");
			
			quotationList.add(new Quote(addRequestID, addQuotationID, addRenovationC, addDescriptionItem, addItemPrice, addDesignerName, addStartDate, addQuoteAmount));
		}
	
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
					}
				}
			}
			
			
		}

		
	
		
}