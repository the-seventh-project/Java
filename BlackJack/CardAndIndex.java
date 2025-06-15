package BlackJack;

public class CardAndIndex {
	
	    private Card card;
	    private int index;

	    public CardAndIndex(Card card, int index) {
	        this.card = card;
	        this.index = index;
	    }

	    public Card getCard() {
	        return card;
	    }

	    public int getIndex() {
	        return index;
	    }

	    
	    public String toString() {
	        return "Card: " + card + ", Index: " + index;
	    }
	}


