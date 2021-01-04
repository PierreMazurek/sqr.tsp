package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @Pierre_Mazurek
 */

public class GATest {

	ArrayList path = new ArrayList();
	City A = new City(0,0);
	City B = new City(0,1);
	City C = new City(1, 0);

	@Test
	public void testEvolvePopulation_1Tournee_NonChangement(){
		Tour tour = new Tour(path);
		Population pop = new Population(1, false);
		pop.saveTour(0, tour);
		Population result = GA.evolvePopulation(pop);
		assertEquals(result.getTour(0).getCity(0), path.get(0));
		assertEquals(result.getTour(0).getCity(1), path.get(1));
	}

}
