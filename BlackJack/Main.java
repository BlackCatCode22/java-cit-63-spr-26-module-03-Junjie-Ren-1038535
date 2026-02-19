package BlackJack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int money = 100;
        int bet = 0;
        Scanner cin = new Scanner(System.in);
        while (bet != -1){
            System.out.println("You have: $" + money + ". Enter amount you want to bet (-1 to quit)");
            bet = cin.nextInt();
            cin.nextLine();
            Deck d1 = new Deck();
            d1.Shuffle();
            BlackJackHand dealer = new BlackJackHand();
            dealer.addCard(d1.Deal());
            dealer.addCard(d1.Deal());
            BlackJackHand player = new BlackJackHand();
            player.addCard(d1.Deal());
            player.addCard(d1.Deal());
            if(dealer.getBlackJackValue() == 21 && player.getBlackJackValue() == 21){
                System.out.println("Dealer have: " + dealer.getBlackJackValue() + "\nYou have: " + player.getBlackJackValue() + "\nTie!");
                continue;
            }
            if(dealer.getBlackJackValue() == 21){
                System.out.println("Dealer have: " + dealer.getBlackJackValue() + "\nYou have: " + player.getBlackJackValue() + "\nDealer wins!");
                money -= bet;
                continue;
            }
            if(player.getBlackJackValue() == 21){
                System.out.println("Dealer have: " + dealer.getBlackJackValue() + "\nYou have: " + player.getBlackJackValue() + "\nYou wins!");
                money += (int) Math.floor(bet * 1.5);
                continue;
            }
            while (player.getBlackJackValue() <= 21 && dealer.getBlackJackValue() <= 21){
                int dealerUpCardVal = dealer.getCard(0).GetValue();
                if (dealerUpCardVal >= 10){
                    dealerUpCardVal = 10;
                }
                System.out.println("One of dealer's card is: " + dealerUpCardVal + " You have: " + player.getBlackJackValue());
                System.out.println("H for hit, S for stand, d for double");
                String action = cin.nextLine();
                if(action.equals("H") || action.equals("h")){
                    player.addCard(d1.Deal());
                    if(player.getBlackJackValue() == 21){
                        System.out.println("You have: 21. You win!");
                        money += bet;
                        break;
                    }
                    if(player.getBlackJackValue() > 21){
                        System.out.println("You now have: " + player.getBlackJackValue() + " You lost.");
                        money -= bet;
                        break;
                    }
                }
                if (action.equals("D") || action.equals("d")){
                    player.addCard(d1.Deal());
                    bet = bet*2;
                    System.out.println("You have: " + player.getBlackJackValue());
                    action = "S";
                }
                if (action.equals("S") || action.equals("s")){
                    while(dealer.getBlackJackValue() < 17 ){
                        dealer.addCard(d1.Deal());
                        System.out.println("Dealer have: "+ dealer.getBlackJackValue());
                    }
                    if (dealer.getBlackJackValue() > 21){
                        System.out.println("Dealer have: "+ dealer.getBlackJackValue() +" Dealer Bust! You win!");
                        money += bet;
                        break;
                    }
                    if (dealer.getBlackJackValue() == player.getBlackJackValue()){
                        System.out.println("It's a tie! Dealer has: " + dealer.getBlackJackValue());
                        break;
                    }
                    if (dealer.getBlackJackValue() < player.getBlackJackValue()){
                        System.out.println("You win! ");
                        money += bet;
                        break;
                    } else {
                        System.out.println("Dealer have: " + dealer.getBlackJackValue() + " You Lost.");
                        money -= bet;
                        break;
                    }
                }
            }
        }
    }
}
