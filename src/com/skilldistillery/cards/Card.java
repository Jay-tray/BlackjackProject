/*User Story #1
Create a class structure that mimics a deck of cards. 
Remember decks as well as hands are made up of cards.
Feel free to create the structure in any way you see fit.*/

package com.skilldistillery.cards;

import java.util.Objects;

public class Card {
	// (has - a association)
	// fields
	private Rank rank;
	private Suit suit;

	// constructor with fields set in them
	public Card(Rank rank, Suit suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}

	// a method to return the numeric value
	public int getValue() {
		return this.rank.getValue();
	}

	@Override
	public int hashCode() {
		return Objects.hash(rank, suit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return rank == other.rank && suit == other.suit;
	}

	@Override
	public String toString() {
		return rank + " of " + suit;
	}

}
