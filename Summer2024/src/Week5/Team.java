package Week5;

public class Team {
	
		private int size;
		private Player players[];
		private int count;
		
		
		public Team(int size){
			players = new Player[size];
			this.size = size;
			count=0;
		}
		
		//assigns player into array
		
		public void addPlayer(Player p) {
			// add code here
			players[count]=p;
			count++;
		}
		
		//remove player in array By Value!
		int position = 0;
		public void removePlayer(String name) {
			// add code here
			for (int i = 0; i < count; i++) {
				
				if (players[i].getName().equals(name)){
					position = i;
				}
				
			}
			
			players[position]=players[count-1];
			count--;
			
			
		}
		
		//
		public int getTotalRating() {
			int total=0;
			// add code here
			
			for (int i = 0; i < count ; i++) {
			
			total += players[i].getRating();
			}
			return total;
		}
		
		//print everything use for loop
		public void printTeamInfo() {
			// add code here to print the information
			// of all the players in the team
			for (int i=0; i < count; i++) {
				System.out.println(players[i].toString());
			}
			
			
		}
		
	}


