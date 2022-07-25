import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {

	private LocalDate appointDate;
	private LocalTime appointTime;
	private String designerName;
	private String premiseAddress;
	
	public Appointment(LocalDate appointDate, LocalTime appointTime, String designerName, String premiseAddress) {
		this.appointDate = appointDate;
		this.appointTime = appointTime;
		this.designerName = designerName;
		this.premiseAddress = premiseAddress;
	}

	public LocalDate getAppointDate() {
		return appointDate;
	}

	public void setAppointDate(LocalDate appointDate) {
		this.appointDate = appointDate;
	}

	public LocalTime getAppointTime() {
		return appointTime;
	}

	public void setAppointTime(LocalTime appointTime) {
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
	
	
	
	
}// end of appointment