package ua.lviv.iot.attractions.model;

public class WaterSlide extends Attractions {

	public double volumeOfWaterPerOneHour = 0.0;

	public WaterSlide(double distanceLengthInMeters, double maxSpeedInKmPerHour, double maxHeightInMeters,
			int serialNumber, double priceOfTicketInUSD, int numberOfChildrenOnAttractionSimultaniously,
			int productionYear, AgeRequired ageRequire) {
		super(distanceLengthInMeters, maxSpeedInKmPerHour, maxHeightInMeters, serialNumber, priceOfTicketInUSD,
				numberOfChildrenOnAttractionSimultaniously, productionYear, ageRequire);
	}

	public double getVolumeOfWaterPerOneHour() {
		return volumeOfWaterPerOneHour;
	}

	public void setVolumeOfWaterPerOneHour(double volumeOfWaterPerOneHour) {
		this.volumeOfWaterPerOneHour = volumeOfWaterPerOneHour;
	}

	public String getHeaders() {
		return super.getHeaders() + "," + "volumeOfWaterPerOneHour";
	}

	public String toCSV() {
		return super.toCSV() + "," + getVolumeOfWaterPerOneHour();
	}
}
