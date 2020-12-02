package Module10.E10_5_8;

import java.util.Objects;

public class Card {
    public final String suit;

    public final String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }


    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return suit.equals(card.suit) && rank.equals(card.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank);
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
