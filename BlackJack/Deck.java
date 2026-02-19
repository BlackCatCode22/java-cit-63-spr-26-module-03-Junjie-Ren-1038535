package BlackJack;

public class Deck {
    private Card [] deck;
    private int CardUsed = 0;
    public Deck(){
        deck = new Card[52];
        int CardCount = 0;
        for(int i = 0; i <= 3; i++){
            for (int j = 1; j < 14; j++){
                deck[CardCount] = new Card(i, j);
                CardCount ++;
            }
        }
        CardUsed = 0;
    }
    public void Shuffle(){
        for(int i = 0; i < deck.length; i++){
            int random = (int)((Math.random() * 1000) % (deck.length));
            Card temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }
        CardUsed = 0;
    }
    public Card Deal(){
        if (CardUsed == deck.length){
            Shuffle();
        }
        CardUsed ++;
        return deck[CardUsed - 1];
    }
}
