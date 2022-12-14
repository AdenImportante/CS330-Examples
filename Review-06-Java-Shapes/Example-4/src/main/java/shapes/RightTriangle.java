// Thomas Kennedy
// CS 330 Fall 2014

package shapes;

import java.util.Scanner;

/**
 * A Triangle with all sides set to the same length
 */
public class RightTriangle extends Triangle
{
    private static final double ONE_HALF = 1.0 / 2.0; ///< @f$ \frac{1}{2} @f$

    /**
     * Compute the hypotenuse using:
     * @f$ hypotenuse = \sqrt{base^2 + height^2} @f$
     *
     * @param base the base of a Right Triangle
     * @param height the height of a Right Triangle
     *
     * @return hypotenuse of a right triangle
     */
    private static double computeHypotenuse(double base, double height)
    {
        return Math.sqrt((base * base) + (height * height));
    }

    /**
     * Construct a RightTriangle
     * with base and height set to 1.
     */
    public RightTriangle()
    {
        super();
        _name   = "Right Triangle";

        _side_c = computeHypotenuse(_side_a, _side_b);
    }

    /**
     * Construct a RightTriangle
     *
     * @param base the desired base
     * @param height the desired height
     */
    public RightTriangle(double base, double height)
    {
        this._name   = "Right Triangle";

        this._side_a = base;
        this._side_b = height;
        this._side_c = RightTriangle.computeHypotenuse(_side_a, _side_b);
    }

    /**
     * Construct a RightTriangle
     *
     * @param src the RightTriangle to copy
     */
    public RightTriangle(RightTriangle src)
    {
        this._name   = src._name;

        this._side_a = src._side_a;
        this._side_b = src._side_b;
        this._side_c = src._side_c;
    }

    /**
     * Return the base
     */
    public double base()
    {
        return _side_a;
    }

    /**
     * Modify the base
     *
     * @param side the replacement base
     */
    public void base(double side)
    {
        _side_a = side;

        _side_c = RightTriangle.computeHypotenuse(_side_a, _side_b);
    }

    /**
     * Return the height
     */
    public double height()
    {
        return _side_b;
    }

    /**
     * Modify the height
     *
     * @param side the replacement height
     */
    public void height(double side)
    {
        _side_b = side;

        _side_c = RightTriangle.computeHypotenuse(_side_a, _side_b);
    }

    /**
     * Return the hypotenuse
     *
     * @return the hypotenuse
     */
    public double hypotenuse()
    {
        return _side_c;
    }

    /**
     * Compute the area using
     * @f$ Area = \frac{1}{2}*base*height @f$
     *
     * @return the area
     */
    @Override
    public double area()
    {
        return ONE_HALF * _side_a * _side_b;
    }

    @Override
    public Shape clone()
    {
        return new RightTriangle(this);
    }

    @Override
    public void read(Scanner scanner)
    {
        this.base(scanner.nextDouble());
        this.height(scanner.nextDouble());

        this._side_c = computeHypotenuse(this.base(), this.height());
    }

    @Override
    public String toString()
    {
        return String.format(FMT_STR, "Name", this._name)
             + String.format(FMT_DBL, "Base", this.base())
             + String.format(FMT_DBL, "Height", this.height())
             + String.format(FMT_DBL, "Hypotenuse", this.hypotenuse())
             + String.format(FMT_DBL, "Perimeter", this.perimeter())
             + String.format(FMT_DBL, "Area", this.area());
    }
}





