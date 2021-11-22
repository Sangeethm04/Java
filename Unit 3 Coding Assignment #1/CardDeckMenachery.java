/*
Sangeeth Menachery
Exercise 3.5
Matching card with full description
*/

import java.util.Scanner;

public class CardDeckMenachery {
    private String description;
    private String cardss;

public CardDeckMenachery(String cardsss) {
cardss = cardsss;
}

    public String getDescription() {
switch (cardss) {
case "AS": description = "Ace of Spades";
break;
case "1S": description = "One of Spades";
break;
case "2S": description = "Two of Spades";
break;
case "3S": description = "Three of Spades";
break;
case "4S": description = "Four of Spades";
break;
case "5S": description = "Five of Spades";
break;
case "6S": description = "Six of Spades";
break;
case "7S": description = "Seven of Spades";
break;
case "8S": description = "Eight of Spades";
break;
case "9S": description = "Nine of Spades";
break;
case "10S": description = "Ten of Spades";
break;
case "JS": description = "Jack of Spades";
break;
case "QS": description = "Queen of Spades";
break;
case "KS": description = "King of Spades";
break;
case "AK": description = "Ace of Kings";
break;
case "1K": description = "One of Kings";
break;
case "2K": description = "Two of Kings";
break;
case "3K": description = "Three of Kings";
break;
case "4K": description = "Four of Kings";
break;
case "5K": description = "Five of Kings";
break;
case "6K": description = "Six of Kings";
break;
case "7K": description = "Seven of Kings";
break;
case "8K": description = "Eight of Kings";
break;
case "9K": description = "Nine of Kings";
break;
case "10K": description = "Ten of Kings";
break;
case "JK": description = "Jack of Kings";
break;
case "QK": description = "Queen of Kings";
break;
case "KK": description = "King of Kings";
break;
case "AC": description = "Ace of Clubs";
break;
case "1C": description = "One of Clubs";
break;
case "2C": description = "Two of Clubs";
break;
case "3C": description = "Three of Clubs";
break;
case "4C": description = "Four of Clubs";
break;
case "5C": description = "Five of Clubs";
break;
case "6C": description = "Six of Clubs";
break;
case "7C": description = "Seven of Clubs";
break;
case "8C": description = "Eight of Clubs";
break;
case "9C": description = "Nine of Clubs";
break;
case "10C": description = "Ten of Clubs";
break;
case "JC": description = "Jack of Clubs";
break;
case "QC": description = "Queen of Clubs";
break;
case "KC": description = "King of Clubs";
break;
case "AD": description = "Ace of Diamonds";
break;
case "1D": description = "One of Diamonds";
break;
case "2D": description = "Two of Diamonds";
break;
case "3D": description = "Three of Diamonds";
break;
case "4D": description = "Four of Diamonds";
break;
case "5D": description = "Five of Diamonds";
break;
case "6D": description = "Six of Diamonds";
break;
case "7D": description = "Seven of Diamonds";
break;
case "8D": description = "Eight of Diamonds";
break;
case "9D": description = "Nine of Diamonds";
break;
case "10D": description = "Ten of Diamonds";
break;
case "JD": description = "Jack of Diamonds";
break;
case "QD": description = "Queen of Diamonds";
break;
case "KD": description = "King of Diamonds";
break;
default: description = "Invalid card";
break;
case "AH": description = "Ace of Hearts";
break;
case "1H": description = "One of Hearts";
break;
case "2H": description = "Two of Hearts";
break;
case "3H": description = "Three of Hearts";
break;
case "4H": description = "Four of Hearts";
break;
case "5H": description = "Five of Hearts";
break;
case "6H": description = "Six of Hearts";
break;
case "7H": description = "Seven of Hearts";
break;
case "8H": description = "Eight of Hearts";
break;
case "9H": description = "Nine of Hearts";
break;
case "10H": description = "Ten of Hearts";
break;
case "JH": description = "Jack of Hearts";
break;
case "QH": description = "Queen of Hearts";
break;
case "KH": description = "King of Hearts";
break;


}
        return description;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a card:");
        String cardinput = scan.nextLine();

        CardDeckMenachery usercard = new CardDeckMenachery(cardinput);
        System.out.println(usercard.getDescription());
    }
}
