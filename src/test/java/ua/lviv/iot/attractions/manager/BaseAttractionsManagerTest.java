package ua.lviv.iot.attractions.manager;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import ua.lviv.iot.attractions.model.Attractions;

public abstract class BaseAttractionsManagerTest {
	protected List<Attractions> attractions;
	
	@BeforeEach
	public void createAttractions() {
		attractions = new ArrayList<Attractions>();
		attractions.add(new Attractions(0, 0, 0, 0, 0, 0, 0, null));
	}
}
