import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Package> packageList = new ArrayList <Package>();
		ArrayList<User> accountList = new ArrayList <User>();
		ArrayList<Appointment> appointmentList = new ArrayList <Appointment>();

		accountList.add(new User ("Alice", 89898989, "AdminLife123@gmail.com", "Confirmed", "Admin"));
		accountList.add(new User ("Bob", 98989898, "Bobbiedesigns12@gmail.com", "Confirmed", "Designer"));
		accountList.add(new User ("Lament", 68686868, "LamentArtistic@gmail.com", "New", "Customer"));
		
		packageList.add(new Package (1,"Whole Place", "20/7/2022","1/2/2023", 10000.00));
		packageList.add(new Package (2,"room", "20/7/2022","20/8/2028", 3000.00));
		packageList.add(new Package (3,"kitchen", "20/7/2022","12/5/2025", 5000.00));
		packageList.add(new Package (4,"toilet", "20/7/2022","10/2/2024", 4000.00));
		

		appointmentList.add(new Appointment ("22/12/2022","11:59AM","Bob","Hougang Road 333","Lament"));
		
		
		
		int option = -1;
		mainMenu();
		while (option != 3) 
		{
			
			option = Helper.readInt("Enter choice > ");
			//LOGINNNNNNNNNNNNNNNNN
			if (option == 1) 
			{
				//asking user to type name
				String typeUser = Helper.readString("Enter Name > ");
				
				//customer login
				for(int i = 2; i < accountList.size();i++)
				{
					
					if(typeUser.equals(accountList.get(i).getName()))
					{
						System.out.println("Login Successful, Welcome " + accountList.get(i).getName());
						int custChoices= -1;
						while(custChoices != 4)
						{
							customerMenu();
							custChoices = Helper.readInt("Enter Choice > ");
							if(custChoices == 1)
							{
								viewPackageInfo(packageList);
							}
							else if(custChoices == 2)
							{
								viewAppointment(appointmentList);
							}
							else if(custChoices == 3)
							{
								addAppointment(appointmentList);
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
				}
				
				
				
				//Designer Log in
				if(typeUser.equals(accountList.get(1).getName()))
				{
					System.out.println("Login Successful, Welcome " + accountList.get(1).getName());
					
					int custChoices= -1;
					while(custChoices != 4)
					{
						designerMenu();
						custChoices = Helper.readInt("Enter Choice > ");
						if(custChoices == 1)
						{
							//Manage customer
						}
						else if(custChoices == 2)
						{
							//manage package
							addPackageInfo (packageList);
						}
						else if(custChoices == 3)
						{
							//view package
							viewPackageInfo(packageList);
						}
						else if(custChoices == 4)
						{
							//delete package
							deletePackage (packageList);
						}
						else if(custChoices == 5)
						{
							//request Quotation
						}
						else if(custChoices == 6)
						{
							//request Appointment
						}
						else if(custChoices == 7)
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
				if(typeUser.equals(accountList.get(0).getName())) 
				{
					System.out.println("Login Successful, Welcome " + accountList.get(0).getName());
					adminMenu();
					
				}
				
				else {
					System.out.println("incorrect Name");
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
				
				views += String.format("%-20s %-20s %-20s %-20s %-15s \n", appointmentList.get(i).getAppointDate(),appointmentList.get(i).getAppointTime(),appointmentList.get(i).getDesignerName(),appointmentList.get(i).getPremiseAddress(),appointmentList.get(i).getCustName());
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
			System.out.println("4. Quit ");
			Helper.line(40, "-");
		}
		
		private static void adminMenu()
		{
			//admin main menu
			Helper.line(40, "-");
			System.out.println("WELCOME TO Renovation ACE");
			System.out.println("1. Manage Customer");
			System.out.println("2. Manage Package");
			System.out.println("3. Manage Request for Quotation");
			System.out.println("4. Manage Quotation");
			System.out.println("5. Manage Appointment");
			System.out.println("6. Quit ");
			Helper.line(40, "-");
		}
		
		private static void designerMenu()
		{
			//Designer menu
			Helper.line(40, "-");
			System.out.println("WELCOME TO Renovation ACE");
			System.out.println("1. Manage Customer");
			System.out.println("2. Manage Package");
			System.out.println("3. Manage Request for Quotation");
			System.out.println("4. Manage Quotation");
			System.out.println("5. Manage Appointment");
			System.out.println("6. Quit ");
			Helper.line(40, "-");
		}
		
		private static void Register(ArrayList<User> accountList) 
		{
		// TODO Auto-generated method stub
			//adds user details to arraylist user
			String regName = Helper.readString("Enter Name > ");
			String dregContactNumber = Helper.readStringRegEx("Enter your contact details > ", "/^[9|6|8][0-9]{7}$");
			int regContactNumber = Integer.parseInt(dregContactNumber);
			String regEmail = Helper.readStringRegEx("Enter email > ", "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
			String regStatus = "New";
			String regRoles = "Customer";
			
			accountList.add(new User (regName, regContactNumber, regEmail, regStatus, regRoles));
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
			String addPackageStart = Helper.readString("Enter Package Description > ");
			String addPackageEnd = Helper.readString("Enter Package Description > ");
			double addPackageAmount = Helper.readDouble("Enter Package Amount > ");
			
			packageList.add(new Package (addPackageCode , addPackageDescription , addPackageStart , addPackageEnd , addPackageAmount));
			System.out.println("Added successfully");
		}
		
		private static void deletePackage (ArrayList<Package> packageList) 
		{
			
		}
		private static void addAppointment(ArrayList<Appointment> appointmentList) 
		{
			String addAppointDate = Helper.readString("Enter Appointment Date > ");
			String addAppointTime = Helper.readString("Enter Appointment Time > ");
			String addDesignerName = Helper.readString("Enter Designer Name > ");
			String addPremiseAddress = Helper.readString("Enter Premises Address > ");
			String addCustName = Helper.readString("Enter Customer Name > ");
			
			appointmentList.add(new Appointment (addAppointDate, addAppointTime, addDesignerName, addPremiseAddress, addCustName));
			System.out.println("Added successfully");
			
		}
		
	
		
}
