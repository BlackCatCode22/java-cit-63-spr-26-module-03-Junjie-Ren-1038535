package BlackJack;
import java.util.ArrayList;

public class BlackJackHand {
    private ArrayList<Card> hand;
    public BlackJackHand(){
        hand = new ArrayList<Card>();
    }
    public void clear(){
        hand.clear();
    }
    public void addCard(Card c){
        hand.add(c);
    }
    public void removeCard(Card c){
        hand.remove(c);
    }
    public int getCardCount(){
        return hand.size();
    }
    public Card getCard(int pos){
        return hand.get(pos);
    }
    public int getBlackJackValue(){
        int val = 0;
        boolean Ace = false;
        int cards;
        cards = getCardCount();
        for (int i = 0; i < cards; i++){
            Card card;
            int cardVal;
            card = getCard(i);
            cardVal = card.GetValue();
            if(cardVal >= 10){
                cardVal = 10;
            }
            if (cardVal == 1){
                Ace = true;
            }
            val += cardVal;
        }
        if(Ace && val <= 11){
            val += 10;
        }
        return val;
    }
}
