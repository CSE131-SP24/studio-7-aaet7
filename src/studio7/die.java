package studio7;

public class die {

	private int num;
	
	public die(int n) {
		num = n;
	}
	
	public int random() {
		return (int)(Math.random()*num+1);
	}
	
	
	
	
	
	public static void main(String[] args) {
		die a = new die(6);
		for (int i =0; i<10;i++) {
			System.out.println(a.random());
		}
		
	}

}
