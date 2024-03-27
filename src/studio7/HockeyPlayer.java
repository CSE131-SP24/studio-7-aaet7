package studio7;

public class HockeyPlayer {

	
	
	private String name;
	private int jerseyNumber;
	private String hand; 
	private int goals;
	private int assists; // points is the sum of these two
	
	public HockeyPlayer(String name, int jerseyNumber, String hand) {
		this.name = name;
		this.jerseyNumber = jerseyNumber;
		this.hand = hand;
		this.goals = 0;
		this.assists = 0;
	}
	
	public void newGame(int goals, int assists) {
		this.setGoals(this.getGoals()+goals);
		this.setAssists(this.getAssists()+assists);
		
	}
	public void print(){
		System.out.println(name);
		System.out.println(jerseyNumber);
		System.out.println(hand);
		System.out.println(goals);
		System.out.println(assists);
		
	}
	
	
	
	public int getGoals() {
		return goals;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}

	
	
	
	
	public static void main(String[] args) {
HockeyPlayer Jim = new HockeyPlayer("Jim", 59, "right");
Jim.newGame(5,2);
Jim.newGame(-2, -2);
Jim.print();

	}

}
