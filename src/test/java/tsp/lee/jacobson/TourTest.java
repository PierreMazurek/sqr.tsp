package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @Pierre_Mazurek
 */

public class TourTest {

	ArrayList listeVilles = new ArrayList();
	City A = new City(0,0);
	City B = new City(0,1);
	City C = new City(1, 0);


	@Test
	public void getDistance_aucunTour_0() {
		Tour emptyTour = new Tour();
		int expected = 0;
		int actual = emptyTour.getDistance();
		assertEquals(expected, actual, 0.0);
	}

	@Test
	public void getDistance_uneVille_0() {
		listeVilles.add(B);
		Tour tour = new Tour(path);
		int expected = 0;
		int actual = tour.getDistance();
		assertEquals(expected, actual, 0.0);
	}
	@Test
	public void getDistance_deuxVilles_2() {
		//Ici on attend la distance 2 car on compte l'aller-retour entre A et B
		path.add(A);
		path.add(B);
		Tour tour = new Tour(path);
		int expected = 2;
		int actual = tour.getDistance();
		assertEquals(expected, actual, 0.0);
	}

	@Test
	public void getDistance_troisVilles_3() {
		//Ici on attend la distance 3 car on compte le passage de A à B, de B à C et de C à A
		path.add(A);
		path.add(B);
		path.add(C);
		Tour tour = new Tour(path);
		int expected = 3;
		int actual = tour.getDistance();
		assertEquals(expected, actual, 0.0);
	}
}
