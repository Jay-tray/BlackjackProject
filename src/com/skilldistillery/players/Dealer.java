package com.skilldistillery.players;

import java.util.Scanner;

import com.skilldistillery.cards.Card;
import com.skilldistillery.cards.Deck;

public class Dealer extends Player {
	private Deck deck; // dealer is the only one who touches the deck
	
	public Dealer() {
		deck = new Deck();
	}

	// dealer shuffles cards
	public void shuffleCards() {
		deck.shuffle();
	}
	
	public void dealCards(Player player) {
		player.bjHand.addCard(deck.dealCard());
		this.bjHand.addCard(deck.dealCard());
		player.bjHand.addCard(deck.dealCard());
		this.bjHand.addCard(deck.dealCard());
	}

	// dealers deals
	public void playerPlay(Player player) {
		System.out.println("You cards are: " + player.bjHand + ". Current total is " + player.bjHand.getHandValue());
		
		if (player.bjHand.isBust()) {
			System.out.println("Better luck next time!");
			return;
		} else if (player.bjHand.isBlackjack()) {
			System.out.println("Congrats, you got a blackjack!!");
			return;
		} 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like to hit or stand?");
		String input = scanner.nextLine();
		
		while (!input.equalsIgnoreCase("stand")) {
			player.bjHand.addCard(deck.dealCard());
			
			if (player.bjHand.isBust() || player.bjHand.isBlackjack()) {
				break;
			}
			
			System.out.println("You cards are: " + player.bjHand + ". Current total is " + player.bjHand.getHandValue());
			System.out.println("Would you like to hit or stand?");
			input = scanner.nextLine();
		}
		
		System.out.println("You cards are: " + player.bjHand + ". Current total is " + player.bjHand.getHandValue());
	}

	public void dealerPlay(Player player) {
		System.out.println("Dealer cards are: " + this.bjHand + ". Current total is " + this.bjHand.getHandValue());
		
		if (player.bjHand.isBust() || player.bjHand.isBlackjack()) {
			return;
		}
		
		while (this.bjHand.getHandValue() <= 16) {
			this.bjHand.addCard(deck.dealCard());
			System.out.println("Dealer cards are: " + this.bjHand + ". Current total is " + this.bjHand.getHandValue());
		}
		
	}
	
	public void determineWinner(Player player) {
		if (player.bjHand.isBust()) {
			System.out.println("Player has busted! Dealer wins!");
		} else if (player.bjHand.isBlackjack()) {
			System.out.println("Congrats, you got a blackjack!! You win!!");
		} else if (this.bjHand.isBust()) {
			System.out.println("Dealer busts. Player wins!!");
		} else if (player.bjHand.getHandValue() > this.bjHand.getHandValue()) {
			System.out.println("Player has won!");
		} else if (player.bjHand.getHandValue() < this.bjHand.getHandValue()) {
			System.out.println("Dealer wins!");
		} else {
			System.out.println("It's a tie!");
		}
	}
	
	public int getRemainingCards() {
		return this.deck.checkDeckSize();
	}
	
	public void clearHand(Player player) {
		this.bjHand.clear();
		player.bjHand.clear();
	}
}

//dealer greets player
//dealer shuffles cards
//dealer then begins to deal 
//if player hits 21 on first deal its a black jack 
//if not dealer then deals per players instructions
//dealer then plays, if dealer has less than 17 they hit
//if they have more they stand
//determine winner 
//initiate new game 