package ua.lviv.iot.attractions.model;

public class Railway extends Attractions {

	public double distanceOfTrackInMeters = 0.0;

	public Railway(double distanceLengthInMeters, double maxSpeedInKmPerHour, double maxHeightInMeters,
			int serialNumber, double priceOfTicketInUSD, int numberOfChildrenOnAttractionSimultaniously,
			int productionYear, AgeRequired ageRequire) {
		super(distanceLengthInMeters, maxSpeedInKmPerHour, maxHeightInMeters, serialNumber, priceOfTicketInUSD,
				numberOfChildrenOnAttractionSimultaniously, productionYear, ageRequire);
	}

	public double getDistanceOfTrackInMeters() {
		return distanceOfTrackInMeters;
	}

	public void setDistanceOfTrackInMeters(double distanceOfTrackInMeters) {
		this.distanceOfTrackInMeters = distanceOfTrackInMeters;
	}

	public String getHeaders() {
		return super.getHeaders() + "," + "distanceOfTrackInMeters";
	}

	public String toCSV() {
		return super.toCSV() + "," + getDistanceOfTrackInMeters();
	}
}
