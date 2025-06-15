package copyProj;

public class Deck {
	
    // Make array of cards
    private Card[] cards;
    private final int deckSize = 52;
    
    
    //two arrays
    String[] suit = {"Club", "Diamond", "Heart", "Spade"};
    int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    
    // Constructor
    //each time an object is called, constructor will be executed
    public Deck() {
    	
        cards = new Card[deckSize];
        
        int count = 0;
        //two dimensional array making a card with both value and suit
        for (String Suit : suit) {
            for (int Value : value) {
                cards[count++] = new Card(Value, Suit);
            }
        }
    }
    
    //make method that returns all the cards in the deck
    public Card[] returnCard () {
    
    	for (int i = 0; i < 52; i++) {
    		System.out.println(cards[i]);
    	}
    	
    	return cards;
    }
    
    //make method that get cards a a particular index
    public Card returnIndexCard (int i) {
    	int index = i;
    	return cards[index];
    }
    
}
    

