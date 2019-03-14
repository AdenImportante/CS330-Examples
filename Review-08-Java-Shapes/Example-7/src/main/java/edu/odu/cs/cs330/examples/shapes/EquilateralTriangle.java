// Thomas Kennedy
// CS 330 Fall 2014

package edu.odu.cs.cs330.examples.shapes;

import java.util.Scanner;

/**
 * A Triangle with all sides set to the same length
 *
 * @author Thomas J Kennedy
 */
public class EquilateralTriangle extends Triangle implements Cloneable {
    /**
     * sqrt(3) / 4
     */
    private static final double ROOT_3_DIV_4 = Math.sqrt( 3 ) / 4; ///< @f$ \frac{\sqrt{3}}{4} @f$

    /**
     * Construct an EquilateralTriangle
     * with all sides set to 1.
     */
    public EquilateralTriangle()
    {
        this._name = "Equilateral Triangle";

        this.side( 1 );
    }

    /**
     * Construct an EquilateralTriangle
     *
     * @param side the desired side length
     */
    public EquilateralTriangle( double side )
    {
        this._name = "Equilateral Triangle";

        this.side( side );
    }

    /**
     * Construct an EquilateralTriangle
     *
     * @param src the EquilateralTriangle to copy
     */
    public EquilateralTriangle( EquilateralTriangle src )
    {
        this._name = src._name;

        this.side( src.side() );
    }

    /**
     * Compute the height using
     * @f$ height = \frac{5}{4}side @f$
     *
     * @return height
     */
    public double height()
    {
        return Math.sqrt(
              1.25 * ( side() * side() )
        );
    }

    /**
     * Return the length of one side
     *
     * @return the length of one side
     */
    public double side()
    {
        return _side_a;
    }

    /**
     * Modify the side length
     *
     * @param s the desired side length
     */
    public void side( double s )
    {
        _side_a = s;
        _side_b = s;
        _side_c = s;
    }

    /**
     * Compute the area using
     * @f$ Area=\frac{\sqrt{3}}{4}side^2 @f$
     *
     * @return the area
     */
    public double area(){
        return ROOT_3_DIV_4 * side() * side();
    }

    /**
     * Return a new duplicate EquilateralTriangle
     */
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return new EquilateralTriangle( this );
    }

    /**
     * Read the shape
     *
     * @param scanner the input stream--scanner in this example
     */
    @Override
    public void read(Scanner scanner)
    {
        this.side(scanner.nextDouble());
    }

    /**
     * Print the EquilateralTriangle
     */
    @Override
    public String toString()
    {
        return (
            String.format(STR_FMT, "Name",      this._name       ) +
            String.format(FPT_FMT, "Side",      this._side_a     ) +
            String.format(FPT_FMT, "Height",    this.height()    ) +
            String.format(FPT_FMT, "Perimeter", this.perimeter() ) +
            String.format(FPT_FMT, "Area",      this.area()      )
        );
    }
}





