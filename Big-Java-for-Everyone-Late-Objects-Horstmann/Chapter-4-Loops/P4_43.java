//How do you simulate the picking of a random playing card?

import java.util.Scanner;
import java.util.Random;

public class Deck 
{
	 
    public static void main(String[] args)
    {
    Random deckOfCards = new Random();
    
    //Set two integers to equal the number of suits and the number of values in a deck of cards, and select one of each at random
    int d1 = deckOfCards.nextInt(4) +1;
    int d2 = deckOfCards.nextInt(12) + 1;
    
        String suit = null; //Declare a variable of null value.
        //Then use switch statement to set a value
        switch (d1) {
            case 1: suit = "Spades"; break;
            case 2: suit = "Clubs"; break;
            case 3: suit = "Hearts"; break;
            case 4: suit = "Diamonds"; break; 
        }
    
        String value = null;
        switch (d2) {
            case 1: value = "Ace"; break;
            case 11: value = "Jack"; break;
            case 12: value = "Queen"; break;
            case 13: value = "King"; break;
            default: value = Integer.toString(d2); break; // Returns a numeric value in string form
                // if a non-face card gets drawn
        }
         
    System.out.println("The " + value + " of " + suit);
    
    }
    
}
