package com.appian.exercise;

public class Card {

	//Mapping for numerical representation of suits in standard deck of cards
	public final static int SPADES = 0;
	public final static int HEARTS = 1;
	public final static int DIAMONDS = 2;
	public final static int CLUBS = 3;

	//Mapping for numerical representation of non-numeric cards
	public final static int ACE = 1;
	public final static int JACK = 11;
	public final static int QUEEN = 12;
	public final static int KING = 13;

	private final int suit;
	private final int value;

	public Card(int value, int suit) {
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
