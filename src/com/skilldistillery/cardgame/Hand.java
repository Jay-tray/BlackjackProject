package com.skilldistillery.cardgame;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.Card;

public abstract class Hand {
	public Hand() { 
		//fields
		//List<Card> numCards = new ArrayList<>();
		//constructor 
		super(); //super is explicit. leaving for visual awareness 
		
		public void addCard(card : Card)() {
			//add card to required player
		}
		
		public void clear() {
			//clear the hands
		}
		
		int getHandValue() {
			
		}
	}

	@Override
	public String toString() {
		return "input text";
	}
	
}




//Even though I cannot explicitly call Hand with new, 
//I can call the child that is extending the parent
//that will bring the constructor from the parent through 
//the child class
//dont need to have abstract methods, they just cannot be instantiated 
//forces you to have a concrete implementation