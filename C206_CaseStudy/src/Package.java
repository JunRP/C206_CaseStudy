public class Package {
	private int Code;
	private String Description;
	private String Start;
	private String End;
	private double Amount;
	
	public Package(int code, String description, String start, String end, double amount) 
	{
		Code = code;
		Description = description;
		Start = start;
		End = end;
		Amount = amount;
	}

	public int getCode() {
		return Code;
	}

	public void setCode(int code) {
		Code = code;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getStart() {
		return Start;
	}

	public void setStart(String start) {
		Start = start;
	}

	public String getEnd() {
		return End;
	}

	public void setEnd(String end) {
		End = end;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	
	
	

}