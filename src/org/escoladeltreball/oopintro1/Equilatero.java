/**
 * 
 */
package org.escoladeltreball.oopintro1;

/**
 * @author iaw26509397
 *
 */
public class Equilatero extends Triangle {

	/**
	 * @param base
	 * @param height
	 */
	public Equilatero(double base, double height, double side1, double side2) {
		super(base, height, side1, side2);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#perimeter()
	 */
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 3*base;
	}

	
}
