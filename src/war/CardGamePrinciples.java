/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package war;

/**
 *
 * @author lukki
 * 
 * Modifier: Lucas Martin, Matthew Lingaolingao, Tajudeen Hussein
 */
public class CardGamePrinciples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WarGame game = new WarGame("War Card Game");

        game.getPlayers().add(new WarPlayer("Player 1"));
        game.getPlayers().add(new WarPlayer("Player 2"));

        game.play();
    }
}
