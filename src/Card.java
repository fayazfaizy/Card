public class Card extends RummyCard{
    final String[] SUITS_UNICODE = {"\u2663", "\u2666", "\u2665", "\u2660", "\uD83C\uDCCF"};
    final String SUITS = "CDHS#";
    final String PIPS = "23456789TJQKA#";
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
        this.suit = SUITS_UNICODE[seq/ SUIT_COUNT];
    }

    public int compareRank( Card card){
        return this.rank - card.rank;
    }

    public boolean compareSuit( Card card){
        return this.suit == card.suit;
    }

    @Override
    public String toString(){
        return  PIPS.charAt(this.rank) + this.suit ;
    }

    public String[] getSuit() {
        return SUITS_UNICODE;
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
