package labs;
import java.lang.Math;
import java.text.NumberFormat;
/**
 * 
 * @author Chris Susan
 * This is a class that defines a circle.
 */
public class Circle {
	private double radius;
	public static int circles;
	public NumberFormat number;
		/**
		 * 
		 * @param The class instance requires a radius in order for it to be created.
		 */
	public Circle(double radius){
		this.radius = radius;
		circles++;
	}
	/**
	 * 
	 * @return Provides the circumference of a Circle object.
	 */
	public double getCircumference(){	
		return Math.PI * 2 * radius;
	}
	/**
	 * 
	 * @return Provides the circumference of the Circle object, formatted to specifications defined elsewhere.
	 */
	public String getFormattedCircumference(){	
		return formatNumber(getCircumference());
	}
	/**
	 * 
	 * @return Provides the area of a Circle object.
	 */
	public double getArea(){
		return Math.PI * Math.pow(radius, 2.0);
	}
	/**
	 * 
	 * @return Provides the area of the Circle object, formatted to specifications defined elsewhere.
	 */
	public String getFormattedArea(){
		return formatNumber(getArea());
	}
	/**
	 * 
	 * @param x The number passed into this method will be formatted as desired.
	 * @return The input number will be formatted to 2 places past the decimal.
	 */
	private String formatNumber(double x){
		number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(2);
		String formatted = number.format(x);
		return formatted;
	}
	/**
	 * 
	 * @return Provides the number of Circle objects that were created.
	 */
	public static int getObjectCount(){
		return circles;
	}
}