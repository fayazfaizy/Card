import java.util.ArrayList;

public class Deck {
    private ArrayList<Pack> deck;
    public Deck(int packCount, int jokerCount){
        deck = new ArrayList<>();
        for( int i = 0; i < packCount; i++){
            deck.add(new Pack(jokerCount));
        }
    }

    public ArrayList<Pack> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Pack> deck) {
        this.deck = deck;
    }
}
