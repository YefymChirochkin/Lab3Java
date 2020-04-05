package ua.lviv.iot.attractions.model;

public class RolerCoaster extends Attractions {

	public int numberOfCabinsForSiting = 0;

	public RolerCoaster(double distanceLengthInMeters, double maxSpeedInKmPerHour, double maxHeightInMeters,
			int serialNumber, double priceOfTicketInUSD, int numberOfChildrenOnAttractionSimultaniously,
			int productionYear, AgeRequired ageRequire) {
		super(distanceLengthInMeters, maxSpeedInKmPerHour, maxHeightInMeters, serialNumber, priceOfTicketInUSD,
				numberOfChildrenOnAttractionSimultaniously, productionYear, ageRequire);
	}

	public int getNumberOfCabinsForSiting() {
		return numberOfCabinsForSiting;
	}

	public void setNumberOfCabinsForSiting(int numberOfCabinsForSiting) {
		this.numberOfCabinsForSiting = numberOfCabinsForSiting;
	}

	public String getHeaders() {
		return super.getHeaders() + "," + "numberOfCabinsForSiting";
	}

	public String toCSV() {
		return super.toCSV() + "," + getNumberOfCabinsForSiting();
	}
}
