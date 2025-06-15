package Week5;

public class TeamPlayerDemo {
	public static void main(String args[]) {
		Player p1 = new Player("Adam","Forward",209);
		Player p2 = new Player("Bob","Defence",160);
		Player p3 = new Player("Tam","Goalie",180);
		
		Team Abbey = new Team(5);
		Abbey.addPlayer(p3);
		Abbey.addPlayer(p1);
		Abbey.addPlayer(p2);
		Abbey.printTeamInfo();
		System.out.println(Abbey.getTotalRating());
		
		Abbey.removePlayer("Bob");
		Abbey.printTeamInfo();
	}
}
