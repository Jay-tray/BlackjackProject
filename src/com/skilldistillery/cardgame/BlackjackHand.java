package com.skilldistillery.cardgame;

import com.skilldistillery.cards.Card;

public class BlackjackHand extends Hand {

	// no arg constructor
	public BlackjackHand() {

	}

	@Override
	public int getHandValue() {
		int total = 0;
		for (Card card : numCards) {
			total += card.getValue();
		} // adding value

		return total;
	}

	public boolean isBlackjack() {
		if (getHandValue() == 21) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isBust() {
		if (getHandValue() > 21)
			return true;
		else {
			return false;
		}

	}

}

