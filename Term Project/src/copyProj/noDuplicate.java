package copyProj;
public class noDuplicate {
    
	private Deck d;
    private int deckSize = 52;  
    private int[] array = new int[deckSize];
    private int count = 0;

    noDuplicate(Deck d){
        this.d=d;
    }
    
    // Method to generate unique numbers and print the corresponding card
    public void giveUnique() {
        while (count < deckSize) {  
            int j;
            boolean unique = false;
            
            // Keep generating a number until a unique one is found
            while (!unique) {
                j = (int)(Math.random() * deckSize);
                if (!checkArr(array, j, count)) {
                    unique = true;
                    array[count++] = j;
                    System.out.println(d.returnIndexCard(j));  // Print the number
                }
            }
        }
    }

    // Method to check if the number is in the array
    public static boolean checkArr(int[] array, int number, int count) {
        // Check if the number matches any value in the array
        for (int i = 0; i < count; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }
    
    public CardAndIndex returnACard() {
    	
    	//check first 
        if (count >= deckSize) {
           System.out.println("All cards have been dealt.");
           return null;
        }
        
        int j=0;
        boolean unique = false;
        Card card = null;
        
        while (!unique) {
            j = (int)(Math.random() * deckSize);
            if (!checkArr(array, j, count)) {
                unique = true;
                array[count++] = j;
                card = d.returnIndexCard(j);  // Get the card
            }
        }
        //j+1 since I need value to add, count must start as 1
        return new CardAndIndex(card,j+1);  // Return the unique card
    }
}
