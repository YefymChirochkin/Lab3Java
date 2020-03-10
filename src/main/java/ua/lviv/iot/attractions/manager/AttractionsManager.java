package ua.lviv.iot.attractions.manager;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.attractions.model.AgeRequired;
import ua.lviv.iot.attractions.model.Attractions;
import ua.lviv.iot.attractions.model.SortType;

public class AttractionsManager {
	List<Attractions> listOfAttractions = new LinkedList<Attractions>();
	{
		listOfAttractions.add(new Attractions(100, 120, 25, 111, 20, 40, 2012, AgeRequired.YEARS_0_7));
		listOfAttractions.add(new Attractions(80, 130, 25, 111, 20, 40, 2012, AgeRequired.YEARS_16_18));
		listOfAttractions.add(new Attractions(140, 150, 25, 111, 20, 40, 2012, AgeRequired.YEARS_7_12));
	}
	public void addAttractions() {
		// TODO Auto-generated method stub
	}

	public List<Attractions> searchByAgeRequired(List<Attractions> listOfSortedAttractions, AgeRequired ageRequire) {
		for (Attractions list:listOfAttractions) {
			if (ageRequire == list.getAgeRequire()) {
				listOfSortedAttractions.add(list);
			}		
		}
		AttractionsManagerUtils.sortByPriceOfTicketInUSD(listOfSortedAttractions, SortType.ASC);
		return listOfSortedAttractions;
	}
}
