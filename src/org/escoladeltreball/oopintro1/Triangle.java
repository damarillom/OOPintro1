/**
 * 
 */
package org.escoladeltreball.oopintro1;

/**
 * @author iaw26509397
 *
 */
public abstract class Triangle extends FigureImpl {

	/**
	 * @param base
	 * @param height
	 */
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	protected double base;
	protected double height;

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#area()
	 */
	@Override
	public double area() {
		return base * height / 2;
	}

}
