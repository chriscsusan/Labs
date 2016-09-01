package labs;
import java.lang.Math;
import java.text.NumberFormat;

public class Circle {
	private double radius;
	public static int circles;
	NumberFormat number;
		
	public Circle(double radius){
		this.radius = radius;
		circles++;
	}
	
	public double getCircumference(){	
		return Math.PI * 2 * radius;
	}
	
	public String getFormattedCircumference(){	
		String number = formatNumber(getCircumference());
		return number;
	}
	
	public double getArea(){
		return Math.PI * Math.pow(radius, 2.0);
	}
	
	public String getFormattedArea(){
		String number = formatNumber(getArea());
		return number;
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

