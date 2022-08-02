import java.time.LocalDate;

public class Quote {
	private int RequestID;
	private int Quotation_ID;
	private String RenovationCategory;
	private String DescriptionOfItem;
	private double ItemPrice;
	private String DesignerName;
	private LocalDate StartDate;
	private double QuoteAmount;
	
	
	public Quote(String descriptionOfItem, double itemPrice) {
		DescriptionOfItem = descriptionOfItem;
		ItemPrice = itemPrice;
	}

	public int getRequestID() {
		return RequestID;
	}

	public void setRequestID(int requestID) {
		RequestID = requestID;
	}

	public int getQuotation_ID() {
		return Quotation_ID;
	}

	public void setQuotation_ID(int quotation_ID) {
		Quotation_ID = quotation_ID;
	}

	public String getRenovationCategory() {
		return RenovationCategory;
	}

	public void setRenovationCategory(String renovationCategory) {
		RenovationCategory = renovationCategory;
	}

	public String getDescriptionOfItem() {
		return DescriptionOfItem;
	}

	public void setDescriptionOfItem(String descriptionOfItem) {
		DescriptionOfItem = descriptionOfItem;
	}

	public double getItemPrice() {
		return ItemPrice;
	}

	public void setItemPrice(double itemPrice) {
		ItemPrice = itemPrice;
	}

	public String getDesignerName() {
		return DesignerName;
	}

	public void setDesignerName(String designerName) {
		DesignerName = designerName;
	}

	public LocalDate getStartDate() {
		return StartDate;
	}

	public void setStartDate(LocalDate startDate) {
		StartDate = startDate;
	}

	public double getQuoteAmount() {
		return QuoteAmount;
	}

	public void setQuoteAmount(double quoteAmount) {
		QuoteAmount = quoteAmount;
	}
	
	

}
