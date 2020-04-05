package ua.lviv.iot.writer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.attractions.manager.BaseAttractionsManagerTest;
import ua.lviv.iot.attractions.model.Attractions;

class AttractionsWriterTest extends BaseAttractionsManagerTest {
	AttractionsWriter attractionsWriter = new AttractionsWriter();

	@Test
	void writeToFileTest() throws IOException {
		Writer csvWriter = new FileWriter("attractions.csv");
		attractionsWriter.setCsvWriter(csvWriter);
		attractionsWriter.writeToFile(attractions);
	}

	@Test
	void stringWriterTest() throws IOException {
		StringBuilder expected = new StringBuilder();
		attractionsWriter.setCsvWriter(new StringWriter());
		attractionsWriter.writeToFile(attractions);
		expected.append(attractions.get(0).getHeaders());
		expected.append("\n");
		for (Attractions listOfAttractions : attractions) {
			expected.append(listOfAttractions.toCSV());
			expected.append("\n");
		}
		assertEquals(expected.toString(), attractionsWriter.toString());

	}
}
