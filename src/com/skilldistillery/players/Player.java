package com.skilldistillery.players;

import com.skilldistillery.cardgame.BlackjackHand;
import com.skilldistillery.cardgame.Hand;

public class Player {
	//fields
	//instantiate a new BlackjackHand -- Dealer will inherit through extends
	BlackjackHand bjHand = new BlackjackHand();
}




// Flow of game for player
//Joins table 
//Is dealt a card face up
//After dealer gets their first card face down player gets second card
//if player hits 21 with first hand its a black jack 
//if not player then has to decide to hit or stand
//player decides what they are doing 
//if over 21 auto lose
//if not wait to see what dealer gets