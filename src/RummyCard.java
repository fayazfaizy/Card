public abstract class RummyCard {
    int wildCard;

    public RummyCard() {
        super();
    }

    public boolean isWildCard(Card card) {
        return this.wildCard == card.rank;
    }

    public void setWildCard(Card card) {
        this.wildCard = card.rank;
    }
}