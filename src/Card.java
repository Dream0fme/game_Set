import java.util.Objects;

public class Card {
    int fill, count, shape, color;

    public Card() {
    }

    public Card(int fill, int count, int shape, int color) {
        this.fill = fill;
        this.count = count;
        this.shape = shape;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return fill == card.fill &&
                count == card.count &&
                shape == card.shape &&
                color == card.color;
    }

    @Override
    public String toString() {
        return "Card [" +
                "fill = " + fill +
                ", count = " + count +
                ", shape = " + shape +
                ", color = " + color + "]";
    }

    public Card getThird(Card c) {
        Card thirdCard = new Card();
        if (this.fill == c.fill) thirdCard.fill = c.fill;
        else thirdCard.fill = 6 - (this.fill + c.fill);
        if (this.count == c.count) thirdCard.count = c.count;
        else thirdCard.count = 6 - (this.count + c.count);
        if (this.shape == c.shape) thirdCard.shape = c.shape;
        else thirdCard.shape = 6 - (this.shape + c.shape);
        if (this.color == c.color) thirdCard.color = c.color;
        else thirdCard.color = 6 - (this.color + c.color);
        return thirdCard;
    }
/*
    public boolean equals(Card card){
        return this.fill == card.fill && this.count == card.count && this.shape == card.shape && this.color == card.color;
    }*/
}
