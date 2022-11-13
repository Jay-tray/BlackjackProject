package com.skilldistillery.cardgame;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.Card;

public abstract class Hand {
	// fields
	protected List<Card> numCards;

	// constructor
	public Hand() {
		numCards = new ArrayList<>();
		// super(); is explicit.
	}

	public void addCard(Card card) {
		numCards.add(card);
		// add card to required player

	}

	public void clear() {
		numCards.clear();
		// clear the hand

	}

	public abstract int getHandValue(); // abstract

	@Override
	public String toString() {
		return numCards.toString();
	}

}

//Even though I cannot explicitly call Hand with new, 
//I can call the child that is extending the parent
//that will bring the constructor from the parent through 
//the child class
//dont need to have abstract methods, they just cannot be instantiated 
//forces you to have a concrete implementation