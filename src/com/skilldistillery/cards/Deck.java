/*User Story #1
Create a class structure that mimics a deck of cards. 
Remember decks as well as hands are made up of cards.
Feel free to create the structure in any way you see fit.*/


package com.skilldistillery.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	// declared in a field
	// has a / composition / association
	private List<Card> deck = new ArrayList<>();

	// constructor initialized new list of cards which is created in the method
	public Deck() {
		Suit[] suits = Suit.values();
		Rank[] ranks = Rank.values();
		for (Suit suit : suits) {
			// for all 4 suits
			for (Rank rank : ranks) {
				// for all 13 cards
				Card aCard = new Card(rank, suit);

				deck.add(aCard);
			}
		}
	}

	public int checkDeckSize() {
		return deck.size();
	}

	public Card dealCard() {
		//dealer removes top card from the deck
		return deck.remove(0);

	}

	public void shuffle() {
		Collections.shuffle(deck);
	}
}
