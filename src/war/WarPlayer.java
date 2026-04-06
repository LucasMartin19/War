/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package war;

import java.util.List;

/**
 *
 * Modifier: Lucas Martin, Matthew Lingaolingao, Tajudeen Hussein
 * 
 */
public class WarPlayer extends Player {

    private Hand hand;

    public WarPlayer(String name) {
        super(name);
        this.hand = new Hand();
    }

    @Override
    public PlayingCard play() {
        return hand.playCard();
    }

    public void addCards(List<PlayingCard> cards) {
        hand.addCards(cards);
    }

    public int getCardCount() {
        return hand.getCardCount();
    }

    public boolean hasEnoughCards(int num) {
        return hand.getCardCount() >= num;
    }

    public Hand getHand() {
        return hand;
    }
}
