package Week6;

public class TeamPlayerDemo {
		public static void main (String args[]) {
			//mistake we need to make objects of the player first
			Player p1 = new Player("Val", "SF", 85);
			Player p2 = new Player("Carlos", "PG", 97);
			Player p3 = new Player("Sebi", "SG", 90);
			Player p4 = new Player("Kyle", "C", 93);
			Player p5 = new Player("Kenneth", "PF", 95);
			Player p6 = new Player("Joseph", "SF", 89);
			
			Team Marvelli = new Team(5);
			
			Marvelli.addPlayer(p1);
			Marvelli.addPlayer(p2);
			Marvelli.addPlayer(p3);
			Marvelli.addPlayer(p4);
			Marvelli.addPlayer(p5);
			
			Marvelli.pringTeamInfo();
			
			Marvelli.removePlayer("Kyle");
			
			Marvelli.addPlayer(p6);
			
			System.out.println(" ");
			
			Marvelli.pringTeamInfo();
			
			System.out.println(" ");
			
			System.out.println("Marvelli Team Rating: " + Marvelli.getTotalRating());
			
			
			
			
			
			
		}
}
