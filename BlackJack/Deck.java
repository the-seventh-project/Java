package BlackJack;

public class Deck {
	
    // Make array of cards
    private Card[] cards;
    private final int deckSize = 52;
    
    
    //two arrays
    String[] suit = {"Club", "Diamond", "Heart", "Spade"};
    int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    
    // Constructor
    //each time an object is called, constructor will be executed, deck will be loaded
    public Deck() {
    	
    	//array of card objects 
        cards = new Card[deckSize];
        
        int count = 0;
        //two dimensional array making a card with both value and suit
        for (String Suit : suit) {
            for (int Value : value) {
                cards[count++] = new Card(Value, Suit);
            }
        }
    }
    
    //returns card at particular index
    public Card returnIndexCard(int i) {
        if (i < 1 || i > deckSize) {
            throw new IllegalArgumentException("Index out of bounds: " + i);
        }
        return cards[i - 1];  // Adjust for 1-based index, given count = 0
    }
    
}
    

