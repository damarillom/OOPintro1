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
	 * @param side1
	 * @param side2
	 */
	public Triangle(double base, double height, double side1, double side2) {
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
	}

	protected double base;
	protected double height;
	protected double side1;
	protected double side2;

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#area()
	 */
	@Override
	public double area() {
		return base * height / 2;
	}

}
