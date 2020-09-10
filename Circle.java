/**
 * Circle is a class to model circlr.
 * 
 * <pre>
 * Circle c = new Circle(4);
 * c.getRadius();
 * </pre>
 * @param radius of circle
 * @return radius of circle
 * @return the circle's radius
 * @author Namrata Waybhase (namrata.waybhase@gmail.com)
 * @version 0.1 7 April 2020
 */
import java.io.*;
import java.io.Serializable;

public class Circle implements Serializable{
   public static final long serialVersionUID = 890;
   private transient double radius;
/**
 * The parameter for circle is radius which is double datatype
 * @param radius radius for circle 
 */
   public Circle(double radius) {
      this.radius = radius;
   }

   /**
    * This is method will return radius of the circle
    * @return radius 
    */
   public double getRadius() {
      return radius;
   }
   /**
    * Display the string
    */
   public String toString() { // override Objects toString()
      return "Radius: " + radius;
   }
}