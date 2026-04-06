/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package war;

/**
 *
 * Modifier: Lucas Martin, Matthew Lingaolingao, Tajudeen Hussein
 */
public class Deck extends GroupOfCards {

    public Deck() {
        super();
        generateDeck();
    }

    public void generateDeck() {
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Value value : Card.Value.values()) {
                addCard(new PlayingCard(value, suit));
            }
        }
    }

    public PlayingCard deal() {
        return removeTopCard();
    }
}