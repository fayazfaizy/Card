public class Card extends RummyCard{
    private final String Suit[] = {"CLUB", "DIAMOND", "HEART", "SPADE", "JOKER"};
    final String SUITS = "CDHS*";
    final String PIPS = "23456789TJQKA*";
    final int SUIT_COUNT = 13;
    final int JOKER_VALUE = 52;

    int seq;
    int rank;
    String suit;

    public Card(int seq){
        super();
        if( seq >= JOKER_VALUE){
            this.rank = SUIT_COUNT;
        }else {
            this.rank = seq % SUIT_COUNT;
        }
        this.seq = seq;
        this.suit = Suit[seq/ SUIT_COUNT];
    }

    public int compareRank( Card card){
        return this.rank - card.rank;
    }

    public boolean compareSuit( Card card){
        return this.suit == card.suit;
    }

    @Override
    public String toString(){
        return this.suit + this.rank;
    }


    public String[] getSuit() {
        return Suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getSUITS() {
        return SUITS;
    }

    public String getPIPS() {
        return PIPS;
    }

    public int getSUIT_COUNT() {
        return SUIT_COUNT;
    }

    public int getJOKER_VALUE() {
        return JOKER_VALUE;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
