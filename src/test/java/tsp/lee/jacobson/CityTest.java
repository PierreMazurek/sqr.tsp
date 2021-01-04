package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @Pierre_Mazurek
 */

public class CityTest {

	City A = new City(0,0);
	City B = new City(0,2);
	City C = new City(2,0);

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void distanceTo_AFromB_2() {
		double expected = 2;
		double actual = B.distanceTo(A);
		assertEquals(expected, actual, 0.0);
	}

	@Test
	public void distanceTo_AFromC_2() {
		double expected = 2;
		double actual = C.distanceTo(A);
		assertEquals(expected, actual, 0.0);
	}

	@Test
	public void distanceTo_AFromA_0() {
		double expected = 0;
		double actual = A.distanceTo(A);
		assertEquals(expected, actual, 0.0);
	}

	@Test
	public void distanceTo_DFromE_5() {
		City D = new City(0,5);
		City E = new City(0, 0);
		double expected = 5;
		double actual = D.distanceTo(E);
		assertEquals(expected, actual, 0.0);
	}

	@Test(expected=NullPointerException.class)
	public void distanceTo_Null_NullPointerException() {
		double actual = A.distanceTo(null);
	}
}
