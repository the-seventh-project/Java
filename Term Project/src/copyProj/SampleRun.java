//import java.util.Scanner;
package copyProj;

public class SampleRun {
    public static void main(String[] args) {
        Deck d = new Deck();
        noDuplicate x = new noDuplicate(d);
        
       // Scanner scan = new Scanner(System.in);

        // Shows all the available cards
         d.returnCard();

        System.out.println(" ");

        // Pick one random card
        int index = (int) ((Math.random() * 52) + 1);
        System.out.println(d.returnIndexCard(index));
        
        System.out.println(" ");
        
        //here to check that no Card is a duplicate, run through 52 times
        //x.giveUnique();
        
        System.out.println(" ");
        
        //give a random for 52 tries
        //for (int i = 0; i < 52; i++) {
        //System.out.println(x.returnACard());
    	//}   
        
        
        //call num53
        //if called more than 52 times return null
        //System.out.println(x.returnACard());
        
        
        //check to return values
        //for(int i = 0; i < 52; i++) {
        	//System.out.println(d.returnIndexCard(i));
        //}
        
        //Card with index
       // System.out.println(x.returnACard());
        
        //what if I only want index but still uses x.returnACard
        System.out.println("Index: " + x.returnACard().getIndex());
        
        System.out.println(" ");
        //call 5 times, while assigning 1-13 regardless of the suit\
       
        /*
        int total = 0;  // Initialize total to 0

		//total for five times
        for (int i = 0; i < 5; i++) {
            int ind = x.returnACard().getIndex();
            int value = ((ind - 1) % 13) + 1;
            
            // to make sure index and value is correct and unique
            System.out.println("Index: " + ind);
            System.out.println("Value: " + value);

            total += value;  // Accumulate the card values
        }

        System.out.println("Total: " + total);  // Print the total

        if (total <= 33) {
        	System.out.println("You win");
        }
        else {
        	System.out.println("You lose");
        }
        */
        /*
        //this code hit or stand, for one player 
        	int total = 0;
        	 for (int i = 0; i < 5; i++) {
                 if (total > 33) {
                     System.out.println("You lose, Total: " + total);
                     break;
                 }

                 System.out.println("Would you like to have another card? Total: " + total);
                 String s = scan.nextLine();

                 if (s.equals("Hit")) {
                     int a = x.returnACard().getIndex();
                     int val = ((a - 1) % 13) + 1;
                     total += val;
                     System.out.println("Card value: " + val + ", New Total: " + total);
                 } else {
                     System.out.println("No card taken, Total remains: " + total);
                 }
             }

             if (total <= 33) {
                 System.out.println("End of rounds, Final Total: " + total);
             }

             scan.close();
         }
       
        */
        
        //scan.close();
    }   
    }


    

