import java.util.ArrayList;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<RepublicPay> accountList = new ArrayList <RepublicPay>();

		accountList.add(new RepublicPay  ("Alice", 20000, 54321, 1234));
		accountList.add(new RepublicPay ("Bob", 25000, 54325, 1234));
		int option = -1;

		while (option != 2) 
		{
			mainMenu();
			option = Helper.readInt("Enter choice > ");

			if (option == 1) 
			{
				RepublicPay loginAcc=getLoginAccount(accountList);
				if (loginAcc !=null) {
					runSavingsProcess(loginAcc);
				}

			} else if (option == 2) 
			{System.out.println("Thank you for using Renovation ACE's services!");

			} else {
				System.out.println("Invalid option!");
			}
		}
	}
		
		private static void mainMenu() {
			//Write code here for the mainMenu method.
			Helper.line(40, "-");
			System.out.println("WELCOME TO Renovation ACE");
			Helper.line(40, "-");
			System.out.println("1. login as Customer");
			System.out.println("2. login as Admin / Desginers");
			System.out.println("3. Quit ");
		}
}
