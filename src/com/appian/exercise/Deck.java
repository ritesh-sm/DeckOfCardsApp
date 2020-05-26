package com.appian.exercise;


public class Deck {

    //An array of 52 cards
    private Card[] deckOfCards;

    //Track number of cards that have been dealt
    private int dealCount;

    /**
     * Create deck of 52 cards. Initially it will be in sorted order.
     */
    public Deck() {
        deckOfCards = new Card[52];
        int cardCount = 0;
        for ( int suit = 0; suit <= 3; suit++ ) {
            for ( int value = 1; value <= 13; value++ ) {
                deckOfCards[cardCount] = new Card(value, suit);
                cardCount++;
            }
        }
        dealCount = 0;
    }

    /**
     * Shuffle the deck into a random order.
     * If cards have been dealt already put back the dealt cards as well and randomly permutate
     */
    public void shuffle(){
        for ( int i = deckOfCards.length-1; i > 0; i-- ) {
            int rand = (int) (Math.random() * (i+1));
            Card temp = deckOfCards[i];
            deckOfCards[i] = deckOfCards[rand];
            deckOfCards[rand] = temp;
        }
        //Reset deal count
        dealCount = 0;
    }


    /**
     * Deals a single card from a deck and returns it
     * Return exception if no more card is left
     */
    public Card dealOneCard(){
        if (dealCount == deckOfCards.length) {
            throw new IllegalStateException("No cards are left in the deck.");
        }
        dealCount++;
        return deckOfCards[dealCount - 1];
    }

    public Card[] getDeckOfCards() {
        return deckOfCards;
    }
}
