/**
 * 
 */
package org.escoladeltreball.oopintro1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author iaw26509397
 *
 */
public class EquilateroTest {

	Equilatero equilatero;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		equilatero = new Equilatero(10, 10);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		equilatero = null;
	}

	/**
	 * Test method for {@link org.escoladeltreball.oopintro1.Equilatero#perimeter()}.
	 */
	@Test
	public final void testPerimeter() {
		assertEquals(30.0, equilatero.perimeter(), 1.0e-4);
	}

	/**
	 * Test method for {@link org.escoladeltreball.oopintro1.Triangle#area()}.
	 */
	@Test
	public final void testArea() {
		assertEquals(50.0, equilatero.area(), 1.0e-4);
	}

}
