import java.util.ArrayList;

import static java.lang.System.out;
public class CardCatalog {
    private ArrayList<Card> cards = new ArrayList<Card>();

    public void addCard(Card card) {
        cards.add(card);
        out.println("card with given disease added to catalog: " + card.getDisease() + ". ID: " + card.getID());
    }

    public Card removeCard(String cID) {
        Card card = getCard(cID);
        cards.remove(card);
        return card;
    }

    public Card getCard(String cID) {
        for (Card c : cards) {
            if (c.getID().equals(cID)) {
                return c;
            }
        }
        return null;
    }
}
