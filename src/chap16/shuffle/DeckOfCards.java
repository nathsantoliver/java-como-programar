package chap16.shuffle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private List<Card> list;    // declara List que armazenará Cards

    // configura baralho de Cards e embaralha
    public DeckOfCards() {
        Card[] deck = new Card[52];
        int count = 0;  // número de cartas

        // preenche baralho com objetos Card
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Face face : Card.Face.values()) {
                deck[count] = new Card(face, suit);
                ++count;
            }
        }

        list = Arrays.asList(deck); // obtém List
        Collections.shuffle(list);  // embaralha cartas
    }

    // gera saída de baralho
    public void printCards() {
        // exibe 52 cartas em duas colunas
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%-19s%s", list.get(i), ((i + 1) % 4 == 0) ? "\n" : "");
        }
    }

    public static void main(String[] args) {
        DeckOfCards cards = new DeckOfCards();
        cards.printCards();
    }
}
