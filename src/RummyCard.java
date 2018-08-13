public abstract class RummyCard {
    boolean isWildCard;

    public RummyCard() {
        isWildCard = false;
    }

    public boolean isWildCard() {
        return isWildCard;
    }

    public void setWildCard(boolean wildCard) {
        isWildCard = wildCard;
    }
}