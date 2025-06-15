
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

	    //since starting on zero, we +1
	    public int getIndex() {
	        return index+1;
	    }

	    
	    public String toString() {
	        return "Card: " + card + ", Index: " + index;
	    }
	}


