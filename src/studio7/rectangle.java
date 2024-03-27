package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class rectangle {

	private double length;
	private double width;
	
	
	
	public rectangle(double l, double w) {
		length = l;
		width = w;
		
	}
	
	public double area(){
		return this.length*this.width;
	}
	public void draw() {
		StdDraw.rectangle(length,length,width,width);
	}
	
	
	
	
	
	public static void main(String[] args) {
		rectangle a = new rectangle(.5,.6);
		rectangle b = new rectangle(.2,.4);
		rectangle c = new rectangle(.1,.1);
		a.area();
		b.draw();
	}

}
