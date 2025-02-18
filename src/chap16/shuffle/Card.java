package chap16.shuffle;

// Classe para representar uma Card de um baralho
public class Card {
    public static enum Face { Ace, Deuce, Three, Four, Five, Six,
        Seven, Eight, Nine, Ten, Jack, Queen, King };
    public static enum Suit { Clibs, Diamonds, Hearts, Spades };

    private final Face face;
    private final Suit suit;

    // construtor
    public Card(Face face, Suit suit) {
        this.face = face;
        this.suit = suit;
    }

    // retorna face da carta
    public Face getFace() {
        return face;
    }

    // retorna naipe da carta
    public Suit getSuit() {
        return suit;
    }

    // retorna representação String de Card
    public String toString() {
        return String.format("%s of %s", face, suit);
    }
}
