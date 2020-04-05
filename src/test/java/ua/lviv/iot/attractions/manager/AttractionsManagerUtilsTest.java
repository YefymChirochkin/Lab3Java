package ua.lviv.iot.attractions.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.attractions.model.AgeRequired;
import ua.lviv.iot.attractions.model.Attractions;
import ua.lviv.iot.attractions.model.Railway;
import ua.lviv.iot.attractions.model.RolerCoaster;
import ua.lviv.iot.attractions.model.SortType;
import ua.lviv.iot.attractions.model.WaterSlide;

public class AttractionsManagerUtilsTest {

	private AttractionsManager attractionsManager;

	@BeforeEach
	public void setUp() {
		attractionsManager = new AttractionsManager();
		attractionsManager.addAttractions(new Railway(250, 45.50, 20, 1034, 10.5, 2, 2005, AgeRequired.YEARS_7_12));
		attractionsManager.addAttractions(new RolerCoaster(180, 30, 35, 502, 20, 25, 2000, AgeRequired.YEARS_0_7));
		attractionsManager.addAttractions(new WaterSlide(100, 10.50, 30, 424, 20, 2, 2015, AgeRequired.YEARS_0_7));
	}

	@Test
	public void testSortByPriceOfTicketInUSD() {
		List<Attractions> listOfSortedTickets = attractionsManager.listOfAttractions;
		List<Attractions> listOfAttractions = new LinkedList<Attractions>();
		listOfAttractions.add(new RolerCoaster(180, 30, 35, 502, 20, 25, 2000, AgeRequired.YEARS_0_7));
		listOfAttractions.add(new WaterSlide(100, 10.50, 30, 424, 20, 2, 2015, AgeRequired.YEARS_0_7));
		listOfAttractions.add(new Railway(250, 45.50, 20, 1034, 10.5, 2, 2005, AgeRequired.YEARS_7_12));
		AttractionsManagerUtils.sortByPriceOfTicketInUSD(listOfSortedTickets, SortType.DESC);
		for (int i = 0; i < listOfAttractions.size(); i++) {
			assertEquals(listOfAttractions.get(i).getPriceOfTicketInUSD(),
					listOfSortedTickets.get(i).getPriceOfTicketInUSD());
		}
	}

	@Test
	public void testSortByMaxCountOfChildrenOnAttractionSimultaniously() {
		List<Attractions> listOfSortedPlaces = attractionsManager.listOfAttractions;
		List<Attractions> listOfAttractions = new LinkedList<Attractions>();
		listOfAttractions.add(new Railway(250, 45.50, 20, 1034, 10.5, 2, 2005, AgeRequired.YEARS_7_12));
		listOfAttractions.add(new RolerCoaster(180, 30, 35, 502, 20, 25, 2000, AgeRequired.YEARS_0_7));
		listOfAttractions.add(new WaterSlide(100, 10.50, 30, 424, 20, 2, 2015, AgeRequired.YEARS_0_7));
		for (int i = 0; i < listOfAttractions.size(); i++) {
			assertEquals(listOfAttractions.get(i).getNumberOfChildrenOnAttractionSimultaniously(),
					listOfSortedPlaces.get(i).getNumberOfChildrenOnAttractionSimultaniously());
		}
	}

	@Test
	public void testSortBySerialNumber() {
		List<Attractions> listOfSortedBySerialNumber = attractionsManager.listOfAttractions;
		AttractionsManagerUtils.sortBySerialNumber(listOfSortedBySerialNumber, SortType.DESC);
		List<Attractions> listOfAttractions = new LinkedList<Attractions>();
		listOfAttractions.add(new Railway(250, 45.50, 20, 1034, 10.5, 2, 2005, AgeRequired.YEARS_7_12));
		listOfAttractions.add(new RolerCoaster(180, 30, 35, 502, 20, 25, 2000, AgeRequired.YEARS_0_7));
		listOfAttractions.add(new WaterSlide(100, 10.50, 30, 424, 20, 2, 2015, AgeRequired.YEARS_0_7));
		for (int i = 0; i < listOfAttractions.size(); i++) {
			assertEquals(listOfAttractions.get(i).getSerialNumber(),
					listOfSortedBySerialNumber.get(i).getSerialNumber());
		}
	}

}
