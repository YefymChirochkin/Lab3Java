package ua.lviv.iot.writer;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

import ua.lviv.iot.attractions.model.Attractions;

public class AttractionsWriter {
	
	public Writer csvWriter = new StringWriter();

	public Writer getCsvWriter() {
		return csvWriter;
	}
	
	public void setCsvWriter(Writer csvWriter) {
		this.csvWriter = csvWriter;
	}
	
	public void writeToFile(List<Attractions> listOfAttractions) throws IOException {
		csvWriter.write(listOfAttractions.get(0).getHeaders());
		csvWriter.write("\n");
		for (Attractions attractions : listOfAttractions) {
			csvWriter.write(attractions.toCSV());
			csvWriter.write("\n");
		}
		csvWriter.flush();
	}

	@Override
	public String toString() {
		return csvWriter.toString();
	}
}
