package com.skilldistillery.players;

import com.skilldistillery.cards.Card;
import com.skilldistillery.cards.Deck;

public class Dealer extends Player {
	private Deck deck; //dealer is the only one who touches the deck

	public Card dealCard() {
		Card card = null;

		return card;

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