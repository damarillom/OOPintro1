/**
 * 
 */
package org.escoladeltreball.oopintro1;

/**
 * @author iaw26509397
 *
 */
public class Square extends FigureImpl {

	private double side;
	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#perimeter()
	 */
	@Override
	public double perimeter() {
		return side * 4;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#area()
	 */
	@Override
	public double area() {
		return side * side;
	}

	/**
	 * @param side
	 */
	public Square(double side) {
		this.side = side;
	}

}
