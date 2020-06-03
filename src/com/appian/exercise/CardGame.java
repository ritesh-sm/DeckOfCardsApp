package com.appian.exercise;

import com.appian.exercise.poker.impl.PokerDeck;
import java.util.Arrays;
import java.util.Scanner;

public class CardGame {

	public static void main(String[] args) {

		PokerDeck pokerDeck = new PokerDeck();

		Scanner scanner = new Scanner(System.in);
		boolean loop = true;

		while (loop) {
			System.out.println("\nEnter : 1 to DEAL CARD,  2 to SHUFFLE,  3 to PRINT DECK,  4 to EXIT. ");
			int input = scanner.nextInt();

				switch (input) {
					case 1:
						try {
							System.out.println("Your card is -> " + pokerDeck.dealOneCard().toString());
						}
						catch (Exception e){
							System.out.println("Exception occurred: " + e.getMessage() + "SHUFFLE again or EXIT the game.");
						}
						break;
					case 2:
						pokerDeck.shuffle();
						System.out.println("Deck Shuffled");
						break;
					case 3:
						Arrays.stream(pokerDeck.getDeckOfCards()).forEach(i -> System.out.print(i.toString() + " | "));
						break;
					case 4:
						loop = false;
						System.out.println("End Game");
						break;
					case 5:
						//TODO: Just for fun
						pokerDeck.setDealCount(52);
						System.out.println("Deal count set to 52");
						break;
				}
		}
	}
}



