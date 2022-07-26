public class Appointment {

	private String appointDate;
	private String appointTime;
	private String designerName;
	private String premiseAddress;
	private String custName;
	
	public Appointment(String appointDate, String appointTime, String designerName, String premiseAddress, String custName) {
		this.appointDate = appointDate;
		this.appointTime = appointTime;
		this.designerName = designerName;
		this.premiseAddress = premiseAddress;
		this.custName = custName;
	}

	public String getAppointDate() {
		return appointDate;
	}

	public void setAppointDate(String appointDate) {
		this.appointDate = appointDate;
	}

	public String getAppointTime() {
		return appointTime;
	}

	public void setAppointTime(String appointTime) {
		this.appointTime = appointTime;
	}

	public String getDesignerName() {
		return designerName;
	}

	public void setDesignerName(String designerName) {
		this.designerName = designerName;
	}

	public String getPremiseAddress() {
		return premiseAddress;
	}

	public void setPremiseAddress(String premiseAddress) {
		this.premiseAddress = premiseAddress;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}


	
	
	
}// end of appointment