package week1;
public class checkDuplicate {
    
	private Deck d; 
	private int deckSize = 52; 
    private int[] array = new int[deckSize];
    private int count = 0;
    

    checkDuplicate(Deck d){
        this.d=d;
    }
    
    
    public CardAndIndex returnACard() {
    	        
        int j=0;
        boolean unique = false;
        Card card = null;
        
        //checks whether the card is unique
        while (!unique) {
        	//
            j = (int)((Math.random() * 52)+1);
            if (!checkArr(array, j, count)) {
                unique = true;
                array[count++] = j; //stores the unique card into the array
                card = d.returnIndexCard(j);  //gets the actual card from the deck
            }
        }
      
        return new CardAndIndex(card,j);  // Returns the unique card
    }
    
    // Method to check if the card is in the array
    public static boolean checkArr(int[] array, int number, int count) {
        // Check if the number matches any value in the array
        for (int i = 0; i < count; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }
}
