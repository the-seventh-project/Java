package copyProj;

import java.util.Scanner;
public class TryBlackJack {
	
	    public static void main(String[] args) {
	        int playerTotal = 0;
	        int computerTotal = 0;
	        Scanner scan = new Scanner(System.in);
	        Deck d = new Deck();
	        noDuplicate x = new noDuplicate(d);

	        for (int i = 0; i < 10; i++) {
	            if (i % 2 == 0) {
	                // Computer's turn
	                if (computerTotal < 26) {
	                    int a = x.returnACard().getIndex();
	                    int val = ((a - 1) % 13) + 1;
	                    computerTotal += val;
	                    System.out.println("Computer hits, Card value: " + val + ", Computer Total: " + computerTotal);
	                } else {
	                    System.out.println("Computer stands, Computer Total: " + computerTotal);
	                }
	            } else {
	                // Player's turn
	                if (playerTotal > 33) {
	                    System.out.println("You lose, Total: " + playerTotal);
	                    break;
	                }

	                System.out.println("Would you like to have another card? Total: " + playerTotal);
	                String s = scan.nextLine();

	                if (s.equalsIgnoreCase("Hit")) {
	                    int a = x.returnACard().getIndex();
	                    int val = ((a - 1) % 13) + 1;
	                    playerTotal += val;
	                    System.out.println("Card value: " + val + ", New Total: " + playerTotal);
	                } else {
	                    System.out.println("No card taken, Total remains: " + playerTotal);
	                }
	            }
	        }

	        if (playerTotal <= 33) {
	            System.out.println("End of rounds, Final Player Total: " + playerTotal);
	        }

	        if (computerTotal > 33) {
	            System.out.println("Computer loses, Final Computer Total: " + computerTotal);
	        } else {
	            System.out.println("End of rounds, Final Computer Total: " + computerTotal);
	        }

	        scan.close();
	    }
	}


