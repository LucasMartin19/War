/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package war;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * 
 * Modifier: Lucas Martin, Matthew Lingaolingao, Tajudeen Hussein
 * 
 */

public class GroupOfCards {

    private ArrayList<PlayingCard> cards;
    private int size;

    public GroupOfCards() {
        this.cards = new ArrayList<>();
        this.size = 0;
    }

    public ArrayList<PlayingCard> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public int getSize() {
        return cards.size();
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addCard(PlayingCard card) {
        cards.add(card);
    }

    public void addCards(List<PlayingCard> newCards) {
        cards.addAll(newCards);
    }

    public PlayingCard removeTopCard() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }
}