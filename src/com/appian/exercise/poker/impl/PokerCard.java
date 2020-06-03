package com.appian.exercise.poker.impl;

import com.appian.exercise.Card;

public class PokerCard implements Card {

	private final int suit;
	private final int value;

	public PokerCard(int value, int suit) {
		if (suit != SPADES && suit != HEARTS && suit != DIAMONDS && suit != CLUBS) {
			throw new IllegalArgumentException("Illegal playing card suit");
		}
		if (value < 1 || value > 13) {
			throw new IllegalArgumentException("Illegal playing card value");
		}
		this.value = value;
		this.suit = suit;
	}

	public String getSuitAsString() {
		switch (suit) {
			case SPADES:   return "Spades";
			case HEARTS:   return "Hearts";
			case DIAMONDS: return "Diamonds";
			case CLUBS:    return "Clubs";
			default:       return "Invalid";
		}
	}

	public String getValueAsString() {
		switch (value) {
			case ACE:  return "Ace";
			case JACK:  return "Jack";
			case QUEEN:  return "Queen";
			case KING:  return "King";
			default: return String.valueOf(value);
		}
	}

	public String toString() {
		return getValueAsString() + " of " + getSuitAsString();
	}

}
