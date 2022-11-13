package com.skilldistillery.blackjackapp;

import java.util.Scanner;

import com.skilldistillery.players.Dealer;
import com.skilldistillery.players.Player;

public class BlackjackApp {

	public static void main(String[] args) {
		BlackjackApp bjApp = new BlackjackApp();
		bjApp.run();
		

	}

	private void run() {
		// TODO Auto-generated method stub
		Dealer dealer = new Dealer();
		Player player = new Player();
		Scanner scanner = new Scanner(System.in);
		String input;
		
		System.out.println("Welcome to the Blackjack table!");
		System.out.println();
		
		// Shuffle and deals
		dealer.shuffleCards();
		
		do {
			dealer.dealCards(player);
			
			dealer.playerPlay(player);
			dealer.dealerPlay(player);
			
			dealer.determineWinner(player);
			dealer.clearHand(player);
			
			System.out.println("Would you like to play again (yes / no)?");
			input = scanner.nextLine();
		} while (input.equalsIgnoreCase("yes") && dealer.getRemainingCards() > 8);
		if (dealer.getRemainingCards() <= 8) {
			System.out.println("Dealer has to swap out decks. PITBOSS is coming to oversee! We will get back to playing shortly, enjoy a drink while you wait.");
		}
		
		System.out.println("Thanks for playing!!");
	
	}
	 
}
