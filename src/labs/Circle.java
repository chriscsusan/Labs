package labs;
import java.lang.Math;
import java.text.NumberFormat;

public class Circle {
	private double radius;
	public static int circles;
	public NumberFormat number;
		
	public Circle(double radius){
		this.radius = radius;
		circles++;
	}
	
	public double getCircumference(){	
		return Math.PI * 2 * radius;
	}
	
	public String getFormattedCircumference(){	
		return formatNumber(getCircumference());
	}
	
	public double getArea(){
		return Math.PI * Math.pow(radius, 2.0);
	}
	
	public String getFormattedArea(){
		return formatNumber(getArea());
	}
	
	private String formatNumber(double x){
		number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(2);
		String formatted = number.format(x);
		return formatted;
	}
	
	public static int getObjectCount(){
		return circles;
	}
}

