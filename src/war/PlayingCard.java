/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package war;

/**
 *
 * Modifier: Lucas Martin, Matthew Lingaolingao, Tajudeen Hussein
 * 
 */
public class PlayingCard extends Card {

    public PlayingCard(Value value, Suit suit) {
        super(value, suit);
    }

    @Override
    public String toString() {
        return getValue() + " of " + getSuit();
    }
}