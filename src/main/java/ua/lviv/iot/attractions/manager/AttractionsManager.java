package ua.lviv.iot.attractions.manager;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.attractions.model.AgeRequired;
import ua.lviv.iot.attractions.model.Attractions;
import ua.lviv.iot.attractions.model.SortType;

public class AttractionsManager {
	List<Attractions> listOfAttractions = new LinkedList<Attractions>();

	public void addAttractions(Attractions attractions) {
		listOfAttractions.add(attractions);
	}

	public List<Attractions> searchByAgeRequired(List<Attractions> listOfSortedAttractions, AgeRequired ageRequire) {
		for (Attractions list : listOfAttractions) {
			if (ageRequire == list.getAgeRequire()) {
				listOfSortedAttractions.add(list);
			}
		}
		AttractionsManagerUtils.sortByPriceOfTicketInUSD(listOfSortedAttractions, SortType.ASC);
		return listOfSortedAttractions;
	}
}
