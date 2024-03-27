package studio7;

public class fraction {

	private double num;
	private double denom;
	
	
	public fraction(double num, double denom) {
		this.num = num;
		this.denom = denom;
	}
	
	public double multiply(fraction f) {
		return (this.num*f.getNum())/(this.denom*f.getDenom());
	}
	
	
	
	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}

	public double getDenom() {
		return denom;
	}

	public void setDenom(double denom) {
		this.denom = denom;
	}

	public static void main(String[] args) {
 fraction a = new fraction (1,2);
 fraction b = new fraction (2,3);
 System.out.println(a.multiply(b));
	}

}
