package ua.lviv.iot.attractions.manager;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.attractions.model.Railway;

public abstract class BaseAttractionsManagerTest {

	protected List<Railway> railways;
	
	public void createRailways() {
		railways = new LinkedList<Railway>();
		railways.add(new Railway());
	}
}
