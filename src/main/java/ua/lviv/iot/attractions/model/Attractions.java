package ua.lviv.iot.attractions.model;

public class Attractions {

	private double distanceLengthInMeters;
	private double maxSpeedInKmPerHour;
	private double maxHeightInMeters;
	private int serialNumber;
	private double priceOfTicketInUSD;
	private int numberOfChildrenOnAttractionSimultaniously;
	private int productionYear;
	private AgeRequired ageRequire = AgeRequired.YEARS_0_7;
	

	public Attractions() {}

	public Attractions(double distanceLengthInMeters, double maxSpeedInKmPerHour, double maxHeightInMeters,
			int serialNumber, double priceOfTicketInUSD, int numberOfChildrenOnAttractionSimultaniously,
			int productionYear, AgeRequired ageRequire) {
		this.distanceLengthInMeters = distanceLengthInMeters;
		this.setMaxSpeedInKmPerHour(maxSpeedInKmPerHour);
		this.maxHeightInMeters = maxHeightInMeters;
		this.serialNumber = serialNumber;
		this.priceOfTicketInUSD = priceOfTicketInUSD;
		this.numberOfChildrenOnAttractionSimultaniously = numberOfChildrenOnAttractionSimultaniously;
		this.productionYear = productionYear;
		this.ageRequire = ageRequire;
	}


	public double getDistanceLengthInMeters() {
		return distanceLengthInMeters;
	}


	public void setDistanceLengthInMeters(double distanceLengthInMeters) {
		this.distanceLengthInMeters = distanceLengthInMeters;
	}


	public double getMaxSpeedInKmPerHour() {
		return maxSpeedInKmPerHour;
	}


	public void setMaxSpeedInKmPerHour(double maxSpeedInKmPerHour) {
		this.maxSpeedInKmPerHour = maxSpeedInKmPerHour;
	}


	public double getMaxHeightInMeters() {
		return maxHeightInMeters;
	}


	public void setMaxHeightInMeters(double maxHeightInMeters) {
		this.maxHeightInMeters = maxHeightInMeters;
	}


	public int getSerialNumber() {
		return serialNumber;
	}


	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}


	public double getPriceOfTicketInUSD() {
		return priceOfTicketInUSD;
	}


	public void setPriceOfTicketInUSD(double priceOfTicketInUSD) {
		this.priceOfTicketInUSD = priceOfTicketInUSD;
	}


	public int getNumberOfChildrenOnAttractionSimultaniously() {
		return numberOfChildrenOnAttractionSimultaniously;
	}


	public void setNumberOfChildrenOnAttractionSimultaniously(int numberOfChildrenOnAttractionSimultaniously) {
		this.numberOfChildrenOnAttractionSimultaniously = numberOfChildrenOnAttractionSimultaniously;
	}


	public int getProductionYear() {
		return productionYear;
	}


	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}


	public AgeRequired getAgeRequire() {
		return ageRequire;
	}


	public void setAgeRequire(AgeRequired ageRequire) {
		this.ageRequire = ageRequire;
	}



	
}
