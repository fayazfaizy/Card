import java.util.ArrayList;
import java.util.Collections;


public class Pack {
    ArrayList<Card> pack ;
    final int CARDS_COUNT = 52;
    Pack(int jokerCount){
        pack = new ArrayList<>();
        for(int i = 0; i < CARDS_COUNT + jokerCount; i++ ){
            pack.add(new Card(i));
        }
        shuffle();
    }

    public void shuffle(){
        Collections.shuffle(pack);
    }

    public Card pickCard(){
        Card temp = pack.get(pack.size()-1);
        pack.remove(temp);
        return temp;
    }

    public void addCard(Card card){
        this.pack.add(card);
    }

    public ArrayList<Card> pickNCard(int n){
        ArrayList<Card> cards = new ArrayList<>();

        for( int i = 0; i < n; i++){
            cards.add(pickCard());
        }
        return cards;
    }

    public ArrayList<Card> getPack() {
        return pack;
    }

    public void setPack(ArrayList<Card> pack) {
        this.pack = pack;
    }
}
