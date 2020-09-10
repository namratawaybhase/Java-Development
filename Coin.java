
/**
 * Coin is a class to model coin.
 * <pre>
 * Circle circle1 = new Circle(12.34);
 * Rectangle square1 = new Rectangle(25, 25);
 * Coin coin1 = new Coin(circle1, square1);
 * </pre>
 * @param circle 
 * @param square
 * @return the circle's radius and rectangle's width and height
 * @author Namrata Waybhase (namrata.waybhase@gmail.com)
 * @version 0.1 7 April 2020
 */
import java.io.Serializable;

public class Coin implements Serializable {
    public static final long serialVersionUID = 567;
    private Circle circle;
    private Rectangle square;

    /**
     * @param circle The parameter for circle is radius
     * @param square The parameter for rectangle is height and width which is double
     *               datatype
     */
    public Coin(Circle circle, Rectangle square) {
        this.circle = new Circle(circle.getRadius());
        this.square = new Rectangle(square.getW(), square.getH());
    }

    /**
     * Display the string
     */
    @Override
    public String toString() { // override Objects toString()
        return "Circle: " + circle + " Rectangle: " + square;
    }
}