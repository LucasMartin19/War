/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package war;

import java.util.ArrayList;

/**
 *
 * Modifier: Lucas Martin, Matthew Lingaolingao, Tajudeen Hussein
 * 
 */
public class WarGame extends Game {

    private Deck deck;

    public WarGame(String name) {
        super(name);
        this.deck = new Deck();
    }

    public void dealCards() {
        deck.shuffle();

        WarPlayer player1 = (WarPlayer) getPlayers().get(0);
        WarPlayer player2 = (WarPlayer) getPlayers().get(1);

        while (!deck.isEmpty()) {
            player1.getHand().addCard(deck.deal());
            if (!deck.isEmpty()) {
                player2.getHand().addCard(deck.deal());
            }
        }
    }

    @Override
    public void play() {
        System.out.println("Game started");
        dealCards();

        WarPlayer player1 = (WarPlayer) getPlayers().get(0);
        WarPlayer player2 = (WarPlayer) getPlayers().get(1);

        while (player1.getCardCount() > 0 && player2.getCardCount() > 0) {
            ArrayList<PlayingCard> pile = new ArrayList<>();

            PlayingCard card1 = player1.play();
            PlayingCard card2 = player2.play();

            pile.add(card1);
            pile.add(card2);

            System.out.println(player1.getName() + " plays: " + card1);
            System.out.println(player2.getName() + " plays: " + card2);

            int result = compareCards(card1, card2);

            if (result > 0) {
                System.out.println(player1.getName() + " wins the round.");
                player1.addCards(pile);
            } else if (result < 0) {
                System.out.println(player2.getName() + " wins the round.");
                player2.addCards(pile);
            } else {
                System.out.println("WAR!");
                resolveWar(player1, player2, pile);
            }

            System.out.println(player1.getName() + " now has " + player1.getCardCount() + " cards.");
            System.out.println(player2.getName() + " now has " + player2.getCardCount() + " cards.");
            System.out.println("----------------------------------");
        }

        declareWinner();
    }

    public int compareCards(PlayingCard card1, PlayingCard card2) {
        return Integer.compare(card1.getRank(), card2.getRank());
    }

    public void resolveWar(WarPlayer player1, WarPlayer player2, ArrayList<PlayingCard> pile) {
        while (true) {
            if (!player1.hasEnoughCards(4)) {
                System.out.println(player1.getName() + " does not have enough cards for war.");
                player2.addCards(pile);
                return;
            }

            if (!player2.hasEnoughCards(4)) {
                System.out.println(player2.getName() + " does not have enough cards for war.");
                player1.addCards(pile);
                return;
            }

            for (int i = 0; i < 3; i++) {
                pile.add(player1.play());
                pile.add(player2.play());
            }

            PlayingCard warCard1 = player1.play();
            PlayingCard warCard2 = player2.play();

            pile.add(warCard1);
            pile.add(warCard2);

            System.out.println(player1.getName() + " war card: " + warCard1);
            System.out.println(player2.getName() + " war card: " + warCard2);

            int result = compareCards(warCard1, warCard2);

            if (result > 0) {
                System.out.println(player1.getName() + " wins the war.");
                player1.addCards(pile);
                return;
            } else if (result < 0) {
                System.out.println(player2.getName() + " wins the war.");
                player2.addCards(pile);
                return;
            } else {
                System.out.println("WAR AGAIN!");
            }
        }
    }

    @Override
    public void declareWinner() {
        WarPlayer player1 = (WarPlayer) getPlayers().get(0);
        WarPlayer player2 = (WarPlayer) getPlayers().get(1);

        if (player1.getCardCount() > 0) {
            System.out.println(player1.getName() + " is the winner!");
        } else {
            System.out.println(player2.getName() + " is the winner!");
        }
    }
}