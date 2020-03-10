package ua.lviv.iot.attractions.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.attractions.model.AgeRequired;
import ua.lviv.iot.attractions.model.Attractions;

class AttractionsManagerTest extends BaseAttractionsManagerTest {
	
	private AttractionsManager attractionsManager;
	
//	@BeforeEach
//	public void setUp() {
//		//Manager initialization logic goes here
//		
//		attractionsManager = new AttractionsManager();
//		attractionsManager.addAttractions();
//	}
	
//	@Test
//	public void testSortingAscending() {
//		List<Attractions> listOfSortedTickets = null;
//		AttractionsManagerUtils.sortByPriceOfTicketInUSD(listOfSortedTickets, SortType.ASC );
//		List<Attractions> listOfSortedPlaces = null;
//		AttractionsManagerUtils.sortByMaxCountOfChildrenOnAttractionSimultaniously(listOfSortedPlaces,SortType.ASC);
//		fail("Not yet implemented");
//	}
	
	@Test
	public void testSearchByAgeRequired() {
		List<Attractions> listOfSortedAttractions = new LinkedList<Attractions>();
		List<Attractions> expectedList = new LinkedList<Attractions>();
		AttractionsManager manager = new AttractionsManager ();
		manager.searchByAgeRequired(listOfSortedAttractions, AgeRequired.YEARS_0_7);
		Attractions something = new Attractions(100, 120, 25, 111, 20, 40, 2012, AgeRequired.YEARS_0_7);
		expectedList.add(something);
	assertEquals(expectedList.get(0).getAgeRequire(), listOfSortedAttractions.get(0).getAgeRequire());
	};
	
}
