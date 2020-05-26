package com.appian.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class CardGame {

	public static void main(String[] args) {

		Deck deck = new Deck();

		Scanner scanner = new Scanner(System.in);
		boolean loop = true;

		while (loop) {
			System.out.println("\nEnter : 1 to DEAL CARD,  2 to SHUFFLE,  3 to PRINT DECK,  4 to EXIT. ");
			int input = scanner.nextInt();

				switch (input) {
					case 1:
						try {
							System.out.println("Your card is -> " + deck.dealOneCard().toString());
						}
						catch (Exception e){
							System.out.println("Exception occurred: " + e.getMessage() + "SHUFFLE again or EXIT the game.");
						}
						break;
					case 2:
						deck.shuffle();
						System.out.println("Deck Shuffled");
						break;
					case 3:
						Arrays.stream(deck.getDeckOfCards()).forEach(i -> System.out.print(i.toString() + " | "));
						break;
					case 4:
						loop = false;
						System.out.println("End Game");
						break;
				}
		}
	}
}



