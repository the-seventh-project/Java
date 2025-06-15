package Week6;

public class Team {
	private int size;
	private Player players[];
	
	public Team (int size) {
		players = new Player[size];
		this.size = size;
		
	}
	
	int count = 0;
	public void addPlayer(Player p) {
		players[count] = p;
		count++;
	}
	
	//by value 
	//we need to return the value
	public void removePlayer(String name) {
		for (int i = 0; i < count; i++) {
			String val = players[i].getName();
			if ( val.equals(name)) {
				players[i] = players[count-1];
				count--;
			}
		}
	}
	
	int total = 0;
	public int getTotalRating() {
		for (int i = 0; i < count; i++) {
			total += players[i].getRating();
		}
		int ave = total / count;
		return ave;
	}
	
	public void pringTeamInfo() {
		for (int i = 0; i < count; i++) {
			System.out.println(players[i]);
		}
	}
}
