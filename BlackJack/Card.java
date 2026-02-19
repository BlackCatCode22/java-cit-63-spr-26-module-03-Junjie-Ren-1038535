package BlackJack;

public class Card {
    public static final int Spade = 0;
    public static final int Club = 1;
    public static final int Heart = 2;
    public static final int Diamond = 3;

    public static final int Ace = 1;
    public static final int Jack = 11;
    public static final int Queen = 12;
    public static final int King = 13;

    private final int suit;
    private final int value;
    Card(int suit, int value){
        this.suit = suit;
        this.value = value;
    }
    public String GetSuit(){
        if(suit == Spade){
            return "Spade";
        } else if (suit == Club) {
            return "Club";
        } else if (suit == Heart) {
            return "Heart";
        } else if (suit == Diamond){
            return "Diamond";
        }
        return "-1";
    }
    public int GetValue(){
        return value;
    }

}
