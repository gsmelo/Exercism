import java.util.HashMap;
import java.util.Map;

public class Blackjack {

    final Map<String, Integer> cards = new HashMap<String, Integer>();

    public void fillMap(){
        cards.put("ace", 11);
        cards.put("two", 2);
        cards.put("three", 3);
        cards.put("four", 4);
        cards.put("five", 5);
        cards.put("six", 6);
        cards.put("seven", 7);
        cards.put("eight", 8);
        cards.put("nine", 9);
        cards.put("ten", 10);
        cards.put("jack", 10);
        cards.put("queen", 10);
        cards.put("king", 10);
        cards.put("other", 0);
    }

    public int parseCard(String card) {
        fillMap();
        return (int) cards.get(card);
    }

    public boolean isBlackjack(String card1, String card2) {
        fillMap();
        int sum = (int) cards.get(card1) + (int) cards.get(card2);
        if(sum == 21){
            return true;
        }
        return false;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if(isBlackjack){
            if(dealerScore < 10){
                return "W";
            } else return "S";
        }
        return "P";

    }

    public String smallHand(int handScore, int dealerScore) {
        if(handScore >= 17){
            return "S";
        } else{
            if(handScore <= 11){
                return "H";
            } else{
                if(dealerScore >= 7){
                    return "H";
                }
            }
            return "S";

        }

    }

    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
