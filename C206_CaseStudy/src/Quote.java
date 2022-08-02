public class Quote {
	//Coded by martin
	private int RequestID;
	private int Quotation_ID;
	private String RenovationCategory;
	private String DescriptionOfItem;
	private double ItemPrice;
	private String DesignerName;
	private String StartDate;
	private double QuoteAmount;
	
	

	public Quote(int requestID, int quotation_ID, String renovationCategory, String descriptionOfItem, double itemPrice,
			String designerName, String startDate, double quoteAmount) {
		RequestID = requestID;
		Quotation_ID = quotation_ID;
		RenovationCategory = renovationCategory;
		DescriptionOfItem = descriptionOfItem;
		ItemPrice = itemPrice;
		DesignerName = designerName;
		StartDate = startDate;
		QuoteAmount = quoteAmount;
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

	public String getStartDate() {
		return StartDate;
	}

	public void setStartDate(String startDate) {
		StartDate = startDate;
	}

	public double getQuoteAmount() {
		return QuoteAmount;
	}

	public void setQuoteAmount(double quoteAmount) {
		QuoteAmount = quoteAmount;
	}
	
	

}