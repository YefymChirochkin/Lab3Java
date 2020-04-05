package ua.lviv.iot.attractions.manager;

import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.attractions.model.Attractions;
import ua.lviv.iot.attractions.model.SortType;

public class AttractionsManagerUtils {

	private static final SorterByPriceOfTicketInUSD ATTRACTIONS_BY_PRICE_OF_TICKET_IN_USD = new SorterByPriceOfTicketInUSD();

	public static void sortByPriceOfTicketInUSD(List<Attractions> listOfSortedTickets, SortType sortType) {

		listOfSortedTickets.sort(sortType == SortType.ASC ? ATTRACTIONS_BY_PRICE_OF_TICKET_IN_USD
				: ATTRACTIONS_BY_PRICE_OF_TICKET_IN_USD.reversed());
	}

	// Static inner class
	private static class SorterByPriceOfTicketInUSD implements Comparator<Attractions> {

		@Override
		public int compare(Attractions firstAttractions, Attractions secondAttractions) {
			return (int) (firstAttractions.getPriceOfTicketInUSD() - secondAttractions.getPriceOfTicketInUSD());
		}

	}

	public static void sortByMaxCountOfChildrenOnAttractionSimultaniously(List<Attractions> listOfSortedPlaces,
			SortType sortType) {
		AttractionsManagerUtils utils = new AttractionsManagerUtils();
		SorterByMaxCountOfChildrenOnAttractionSimultaniously something = utils.new SorterByMaxCountOfChildrenOnAttractionSimultaniously();
		listOfSortedPlaces.sort(sortType == SortType.ASC ? something
				: something.reversed());
	}

	// Inner class
	public class SorterByMaxCountOfChildrenOnAttractionSimultaniously implements Comparator<Attractions> {

		@Override
		public int compare(Attractions firstAttractions, Attractions secondAttractions) {
			return (firstAttractions.getNumberOfChildrenOnAttractionSimultaniously()
					- secondAttractions.getNumberOfChildrenOnAttractionSimultaniously());
		}
	}

	public static void sortByPriceOfTicketAndMaxCountOfChildrenOnAttraction(
			List<Attractions> listOfSortedTicketsAndPlaces, SortType sortType) {

		// Anonymous inner class
		Comparator<Attractions> comparator = new Comparator<Attractions>() {

			@Override
			public int compare(Attractions firstAttractions, Attractions secondAttractions) {

				int priceComparisonResult = (int) (firstAttractions.getNumberOfChildrenOnAttractionSimultaniously()
						- secondAttractions.getNumberOfChildrenOnAttractionSimultaniously());

				if (priceComparisonResult != 0) {
					return priceComparisonResult;
				}
				return firstAttractions.getNumberOfChildrenOnAttractionSimultaniously()
						- secondAttractions.getNumberOfChildrenOnAttractionSimultaniously();
			}
		};
		listOfSortedTicketsAndPlaces.sort(sortType == SortType.ASC ? ATTRACTIONS_BY_PRICE_OF_TICKET_IN_USD
				: ATTRACTIONS_BY_PRICE_OF_TICKET_IN_USD.reversed());
	}

	public static void sortBySerialNumber(List<Attractions> listOfSortedBySerialNumber, SortType sortType) {
		listOfSortedBySerialNumber
				.sort(sortType == SortType.ASC
						? (firstAttractions,
								secondAttractions) -> (firstAttractions.getSerialNumber()
										- secondAttractions.getSerialNumber())
						: (firstAttractions, secondAttractions) -> (secondAttractions.getSerialNumber()
								- firstAttractions.getSerialNumber()));
	}

}
