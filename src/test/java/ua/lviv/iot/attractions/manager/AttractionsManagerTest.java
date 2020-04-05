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
import ua.lviv.iot.attractions.model.WaterSlide;

class AttractionsManagerTest extends BaseAttractionsManagerTest {

	private AttractionsManager attractionsManager;

	@BeforeEach
	public void setUp() {
		attractionsManager = new AttractionsManager();
		attractionsManager.addAttractions(new Railway(250, 45.50, 20, 1034, 10.5, 2, 2005, AgeRequired.YEARS_7_12));
		attractionsManager.addAttractions(new RolerCoaster(180, 30, 35, 502, 20, 25, 2000, AgeRequired.YEARS_0_7));
		attractionsManager.addAttractions(new WaterSlide(100, 10.50, 30, 424, 20, 2, 2015, AgeRequired.YEARS_0_7));
	}

	@Test
	public void testSearchByAgeRequired() {
		List<Attractions> listOfSortedAttractions = new LinkedList<Attractions>();
		List<Attractions> expectedList = new LinkedList<Attractions>();
		AttractionsManager manager = new AttractionsManager();
		manager.searchByAgeRequired(listOfSortedAttractions, AgeRequired.YEARS_0_7);
		Attractions something = new RolerCoaster(180, 30, 35, 502, 20, 25, 2000, AgeRequired.YEARS_0_7);
		expectedList.add(something);
		for (int i = 0; i < listOfSortedAttractions.size(); i++) {
			assertEquals(expectedList.get(i).getAgeRequire(), listOfSortedAttractions.get(i).getAgeRequire());
		}
	};

}
