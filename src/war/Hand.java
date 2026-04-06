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
public class Hand extends GroupOfCards {

    public Hand() {
        super();
    }

    public PlayingCard playCard() {
        return removeTopCard();
    }

    public int getCardCount() {
        return getSize();
    }
}