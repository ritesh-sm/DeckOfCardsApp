package com.appian.exercise;

public interface Deck {


    /**
     * Returns no value, but results in the cards in the deck being randomly
     */
    void shuffle();

    /**
     * Return one card from the deck to the caller
     */
    Card dealOneCard();
}
