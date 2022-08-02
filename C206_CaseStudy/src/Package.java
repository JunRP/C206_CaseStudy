import java.time.LocalDate;
public class Package {
<<<<<<< HEAD
	
	private String id;
	private String description;
	private String type;
	private double amount;
	private String pStartDate;
	private String pEndDate;
	
	
=======
	private String Code;
	private String Description;
	private LocalDate Start;
	private LocalDate End;
	private double Amount;
	
	public Package(String code, String description, LocalDate start, LocalDate end, double amount) 
	{
		Code = code;
		Description = description;
		Start = start;
		End = end;
		Amount = amount;
	}
>>>>>>> branch 'master' of https://github.com/JunRP/C206_CaseStudy.git

	public void setCode(String code) 
	{
		Code = code;
	}

	public void setDescription(String description) 
	{
		Description = description;
	}

	public void setStart(LocalDate start) 
	{
		Start = start;
	}

	public void setEnd(LocalDate end) 
	{
		End = end;
	}

	public void setAmount(double amount) 
	{
		Amount = amount;
	}
	
	
	

}